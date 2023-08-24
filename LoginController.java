package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import DTO.EmpleadosDto;
import modelos.ClienteModelo;
import modelos.EmpleadoModelo;
import modelos.PedidoModelo;
import modelos.ProductoModelo;
import views.login;
import views.SystemView;

public class LoginController implements ActionListener {
    
    private EmpleadoModelo modelo;
    private login login_view;
    
    public static String rol_user;
    public static int id_user;

    public LoginController( EmpleadoModelo modelo, login login_view) {
        this.modelo = modelo;
        this.login_view = login_view;
        this.login_view.btn_enter.addActionListener(this);
        login_view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Obtener los datos de la vista
        String user = login_view.txt_usuario.getText().trim();
        String pass = String.valueOf(login_view.txt_password.getPassword());

        EmpleadosDto empleado = new EmpleadosDto();
        
        if (e.getSource() == login_view.btn_enter) {
            //validar que los campos no esten vacios 
            if (!user.equals("") || !pass.equals("")) {
                empleado = modelo.loginEmpleado(user, pass);
                //verificar la existencia del usuario
                if (empleado.getUsername() != null) {
                    
                    rol_user    = empleado.getRol();
                    id_user     = empleado.getId();
                    
                    SystemView admin = new SystemView();
                    admin.titleInterface(empleado.getNombre(), empleado.getApellido(), empleado.getRol());
                    admin.setVisible(true);
                    
                    //Controller Empleados
                    EmpleadoModelo empleadoModelo = new EmpleadoModelo();
                    EmpleadosController empleadoController = new EmpleadosController( empleadoModelo, admin );
                    empleadoController.listAllEmpleados();
                    
                    //Controller Clientes
                    ClienteModelo clienteModelo = new ClienteModelo();
                    ClientesController clienteController = new ClientesController(admin, clienteModelo);
                    clienteController.listAllCliente();
                    
                    //Controller Productos
                    ProductoModelo productoModelo = new ProductoModelo();
                    ProductosController productoController = new ProductosController( admin, productoModelo);
                    productoController.listAllProductos();
                    
                    //Controller Pedidos
                    PedidoModelo pedidoModelo = new PedidoModelo();
                    PedidosController pedidoController = new PedidosController( pedidoModelo, admin );
                    pedidoController.listAllPedidos();
                    
                    this.login_view.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }
        }
    }

}
