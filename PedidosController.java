package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static controllers.LoginController.rol_user;
import static controllers.LoginController.id_user;
import DTO.DetalleDto;
import DTO.PedidosDto;
import DTO.ProductosDto;
import modelos.PedidoModelo;

import views.SystemView;

public class PedidosController implements ActionListener, KeyListener, MouseListener {

    private PedidoModelo modelo;
    private SystemView views;
    private int item = 0;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel temp;
    String rol = rol_user;

    public PedidosController(PedidoModelo modelo, SystemView views) {
        
        this.modelo = modelo;
        this.views = views;
        
        //Settings de botones
        this.views.btn_agregar_producto_a_comprar.addActionListener(this);
        this.views.btn_confirmar_pedido.addActionListener(this);
        this.views.btn_eliminar_pedido.addActionListener(this);
        this.views.txt_pedido_producto_id.addKeyListener(this);
        this.views.txt_pedido_precio.addKeyListener(this);
        this.views.btn_nuevo_pedido.addActionListener(this);
        this.views.jLabelPedidos.addMouseListener(this);
        this.views.jLabelReporte.addMouseListener(this);
        this.views.jButton_despachar.addActionListener(this);
        this.views.jButton_pagar.addActionListener(this);
        this.views.jButton_cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_agregar_producto_a_comprar) {

            int cantidad    = Integer.parseInt(views.txt_pedido_cantidad.getText());
            String nombre = views.txt_pedido_producto_nombre.getText();
            double precio   = Double.parseDouble(views.txt_pedido_precio.getText());
            int pedido_id   = Integer.parseInt(views.txt_pedido_id.getText());

            if (cantidad > 0) {
                temp = (DefaultTableModel) views.pedidos_tabla.getModel();
                for (int i = 0; i < views.pedidos_tabla.getRowCount(); i++) {
                    if (views.pedidos_tabla.getValueAt(i, 1).equals(views.txt_pedido_producto_nombre.getText())) {
                        JOptionPane.showMessageDialog(null, "El producto ya esta registrado en la tabla de compras");
                        return;
                    }
                }

                ArrayList list = new ArrayList();
                //Agregar cada uno de los items
                item = 1;
                list.add(item);
                list.add(pedido_id);
                list.add(nombre);
                list.add(cantidad);
                list.add(precio);
                list.add(cantidad * precio);

                Object[] obj = new Object[5];
                obj[0] = list.get(1);
                obj[1] = list.get(2);
                obj[2] = list.get(3);
                obj[3] = list.get(4);
                obj[4] = list.get(5);

                temp.addRow(obj);
                views.pedidos_tabla.setModel(temp);
                cleanFieldsPedidos();
                views.txt_pedido_producto_id.requestFocus();
                calculatePedidos();
            }

        } else if (e.getSource() == views.btn_confirmar_pedido) {
            insertarPedido();
        } else if (e.getSource() == views.btn_eliminar_pedido) {
            model = (DefaultTableModel) views.pedidos_tabla.getModel();
            model.removeRow(views.pedidos_tabla.getSelectedRow());
            calculatePedidos();
            views.txt_pedido_producto_id.requestFocus();
        } else if (e.getSource() == views.btn_nuevo_pedido) {
            cleanTableTemp();
            cleanFieldsPedidos();
        }
        
        if (rol.equals("Despacho") || rol.equals("Administrativo")) {
            
            if (e.getSource() == views.jButton_cancelar) {
                int id = Integer.parseInt(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 0).toString());
                modelo.actualizarEstado("Cancelado", id);
                cleanTable();
                listAllPedidos();
            }
            
            if (e.getSource() == views.jButton_despachar) {
                if ( "Creado".equals(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 5).toString())
                        || "Cancelado".equals(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 5).toString())){
                    JOptionPane.showMessageDialog(null, "No se puede realizar esta accion.");
                }else{
                    int id = Integer.parseInt(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 0).toString());
                    modelo.actualizarEstado("Despachado", id);
                    cleanTable();
                    listAllPedidos();
                }
                
            }
        }
        if (rol.equals("Caja") || rol.equals("Administrativo")) {
            if (e.getSource() == views.jButton_pagar) {
                
                if("Despachado".equals(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 5).toString())
                        || "Cancelado".equals(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 5).toString()))
                {
                    JOptionPane.showMessageDialog(null, "No se puede realizar esta accion.");
                }
                else
                {
                 // Opciones para los botones
                 String[] options = {"Efectivo", "Debito", "Credito"};

                 // Mostrar el cuadro de diálogo de confirmación
                 int result = JOptionPane.showOptionDialog(
                         null, // Componente padre, en este caso, nulo para que aparezca en el centro de la pantalla
                         "Seleccione el método de pago:", // Mensaje que se muestra
                         "Método de Pago", // Título del cuadro de diálogo
                         JOptionPane.DEFAULT_OPTION, // Tipo de opciones (predeterminado)
                         JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
                         null, // Icono personalizado (nulo para el predeterminado)
                         options, // Arreglo de opciones para los botones personalizados
                         options[0] // Opción predeterminada (seleccionada al presionar Enter)
                 );

                 int id = Integer.parseInt(views.tabla_todos_pedidos.getValueAt(views.tabla_todos_pedidos.getSelectedRow(), 0).toString());
                 // Comprobar la opción seleccionada por el usuario
                 switch (result) {
                     case 0:
                         // Acción para el botón "Efectivo"
                         modelo.actualizarEstadoPago("Pagado", "Efectivo", id);
                         modelo.generarTicket();
                         break;
                     case 1:
                         // Acción para el botón "Debito"
                         modelo.actualizarEstadoPago("Pagado", "Debito", id);
                         modelo.generarTicket();
                         break;
                     case 2:
                         // Acción para el botón "Credito"
                         modelo.actualizarEstadoPago("Pagado", "Credito", id);
                         modelo.generarTicket();
                         break;
                     default:
                         break;
                 } 
                }
                
                cleanTable();
                listAllPedidos();
                
            }
        }
    }
        

    private void insertarPedido(){
        double total = Double.parseDouble(views.txt_pedido_total_a_pagar.getText());
        int empleado_id = id_user; //va a ser igual al usuario autenticado
        int cliente_id = Integer.parseInt(views.txt_pedido_cliente_id.getText());
        
        if(modelo.registrarPedido(new PedidosDto(empleado_id, cliente_id, total ))){
            int pedido_id = modelo.maxPedidoId();
            for(int i=0; i<views.pedidos_tabla.getRowCount(); i++){
                int producto_id         = Integer.parseInt(views.pedidos_tabla.getValueAt(i, 0).toString()); 
                int pedido_cantidad     = Integer.parseInt(views.pedidos_tabla.getValueAt(i, 2).toString()); 
                double pedido_precio    = Double.parseDouble(views.pedidos_tabla.getValueAt(i, 3).toString()); 
                
                //Registrar detalles de la compra
                modelo.registrarPedidoDetalle( new DetalleDto(pedido_id, producto_id, pedido_precio, pedido_cantidad));
            }
            cleanTableTemp(); 
            cleanFieldsPedidos();
            JOptionPane.showMessageDialog(null, "Compra generada con éxito");

        }
    
    }
    
    //Metodo para listar los pedidos realizados
    public void listAllPedidos(){
        if(rol.equals("Administrativo") || rol.equals("Despacho") || rol.equals("Caja")){
            List<PedidosDto> list = modelo.listAllPedidos(); 
            model = (DefaultTableModel) views.tabla_todos_pedidos.getModel();
            Object[] row = new Object[7];
            //Recorrer con ciclo for
            for(int i=0; i<list.size(); i++){
                row[0] = list.get(i).getNum_pedido(); 
                row[1] = list.get(i).getTotal(); 
                row[2] = list.get(i).getFecha();
                row[3] = list.get(i).getEmpleado();
                row[4] = list.get(i).getCliente();
                row[5] = list.get(i).getEstado();
                row[6] = list.get(i).getTipo();
                model.addRow(row);
            }
            views.tabla_todos_pedidos.setModel(model);
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getSource() == views.txt_pedido_producto_id) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {  //Si la persona presiona enter
                if (views.txt_pedido_producto_id.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingresa el código del producto a comprar");
                } else {
                    int id = Integer.parseInt(views.txt_pedido_producto_id.getText());
                    ProductosDto busquedaDto = modelo.buscarProducto(id);
                    views.txt_pedido_producto_nombre.setText(busquedaDto.getNombre());
                    views.txt_pedido_precio.setText(Double.toString(busquedaDto.getPrecio()));
                    views.txt_pedido_id.setText("" + busquedaDto.getId());
                    views.txt_pedido_cantidad.requestFocus();

                }
            }
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_pedido_precio) {
            int cantidad;
            double precio = 0.0;

            if (views.txt_pedido_cantidad.getText().equals("")) {
                //Si la persona no introdujo una cantidad le va a sergir mostrando el mismo precio
                cantidad = 1;
                views.txt_pedido_precio.setText("" + precio);
            } else {
                cantidad = Integer.parseInt(views.txt_pedido_cantidad.getText());
                precio = Double.parseDouble(views.txt_pedido_precio.getText());
                views.txt_pedido_subtotal.setText(" " + cantidad * precio);
            }
        }
    }
    
    //Metodo limpiar campos
    public void cleanFieldsPedidos(){
        views.txt_pedido_cantidad.setText("");
        views.txt_pedido_id.setText("");
        views.txt_pedido_precio.setText("");
        views.txt_pedido_producto_id.setText("");
        views.txt_pedido_producto_nombre.setText("");
        views.txt_pedido_subtotal.setText("");
        views.txt_pedido_total_a_pagar.setText("");
    }
    
    //Calcular total a pagar
    public void calculatePedidos(){
        double total = 0.00; 
        int numRow = views.pedidos_tabla.getRowCount();
        
        for(int i = 0; i < numRow; i++){
            //Pasar el indice de la columna que se sumará
            total = total + Double.parseDouble(String.valueOf(views.pedidos_tabla.getValueAt(i, 4)));
        }
        views.txt_pedido_total_a_pagar.setText("" + total);
    }
    
    //Limpiar tabla temporal
    public void cleanTableTemp(){
        for(int i=0; i<temp.getRowCount(); i++){
            temp.removeRow(i);
            i = i-1; 
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.jLabelPedidos){
            if(rol.equals("Administrativo") ){
                views.jTabbedPane1.setSelectedIndex(3);
                cleanTable();
                
            }else{
                views.jTabbedPane1.setEnabledAt(3, false);
                views.jLabelPedidos.setEnabled(false);
                JOptionPane.showInternalMessageDialog(null, "No tiene privilegios de administradtivo para entrar a esta vista");
            }
        }else if(e.getSource() == views.jLabelReporte){
            if(rol.equals("Administrativo") || rol.equals("Despacho") || rol.equals("Caja")){
                views.jTabbedPane1.setSelectedIndex(4);
                cleanTable();
                listAllPedidos();
            } else{
                views.jTabbedPane1.setEnabledAt(4, false);
                views.jLabelPedidos.setEnabled(false);
                JOptionPane.showInternalMessageDialog(null, "No tiene privilegios de administradtivo para entrar a esta vista");
            }
        }
    }
    
     @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    //Metodo para limpiar la tabla
    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    

    }
