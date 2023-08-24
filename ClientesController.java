
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DTO.ClientesDto;
import static controllers.LoginController.rol_user;
import modelos.ClienteModelo;
import views.SystemView;

public class ClientesController implements ActionListener, MouseListener, KeyListener{
    
    private SystemView views;
    private ClienteModelo modelo;
    String rol = rol_user;
    
    DefaultTableModel model = new DefaultTableModel();
    
    public ClientesController(SystemView views, ClienteModelo modelo) {
        
        //this.cliente = cliente;
        //this.clienteDao = clienteDao;
        
        this.views = views;
        this.modelo = modelo;
        
        //Setting de botones
        this.views.btn_registrar_cliente.addActionListener(this);
        this.views.txt_search_cliente.addKeyListener(this);
        this.views.btn_modificar_cliente.addActionListener(this);
        this.views.btn_eliminar_cliente.addActionListener(this);
        this.views.btn_cancelar_cliente.addActionListener(this);
        this.views.jLabelClientes.addMouseListener(this);
        this.views.clientes_tabla.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == views.btn_registrar_cliente) {
            //Verificar si los campos estan vacios
            if (views.txt_cliente_id.getText().equals("")
                    || views.txt_cliente_nombre.getText().equals("")
                    || views.txt_cliente_apellido.getText().equals("")
                    || views.txt_cliente_email.getText().equals("")
                    || views.txt_cliente_direccion.getText().equals("")
                    || views.txt_cliente_celular.getText().equals("")
                    || views.txt_cliente_dni.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

            } else {
                int id = Integer.parseInt(views.txt_cliente_id.getText().trim());
                String nombre       = views.txt_cliente_nombre.getText().trim();
                String apellido     = views.txt_cliente_apellido.getText().trim();
                String dni          = views.txt_cliente_direccion.getText().trim();
                String direccion    = views.txt_cliente_celular.getText().trim();
                String telefono     = views.txt_cliente_email.getText().trim();
                String email        = views.txt_cliente_dni.getText().trim();

                if (modelo.registrarCliente(new ClientesDto(id, nombre, apellido, dni, direccion, telefono, email))) {
                    cleanTable();
                    listAllCliente();
                    JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar un cliente");
                }

            }
        } else if (e.getSource() == views.btn_modificar_cliente) {
            if (views.txt_cliente_id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            } else {
                if (views.txt_cliente_id.getText().equals("")
                    || views.txt_cliente_nombre.getText().equals("")
                    || views.txt_cliente_apellido.getText().equals("")
                    || views.txt_cliente_email.getText().equals("")
                    || views.txt_cliente_direccion.getText().equals("")
                    || views.txt_cliente_celular.getText().equals("")
                    || views.txt_cliente_dni.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                } else {
                    int id = Integer.parseInt(views.txt_cliente_id.getText().trim());
                    String nombre       = views.txt_cliente_nombre.getText().trim();
                    String apellido     = views.txt_cliente_apellido.getText().trim();
                    String dni          = views.txt_cliente_direccion.getText().trim();
                    String direccion    = views.txt_cliente_celular.getText().trim();
                    String telefono     = views.txt_cliente_email.getText().trim();
                    String email        = views.txt_cliente_dni.getText().trim();

                    if (modelo.actualizarCliente(new ClientesDto(id, nombre, apellido, dni, direccion, telefono, email))) {
                        cleanTable();
                        cleanFields();
                        listAllCliente();
                        views.btn_registrar_cliente.setEnabled(true);

                        JOptionPane.showMessageDialog(null, "Datos del cliente modificados con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar al cliente");
                    }
                }
            }
        } else if (e.getSource() == views.btn_eliminar_cliente) {
            int row = views.clientes_tabla.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente para eliminar");
            } else {
                int id = Integer.parseInt(views.clientes_tabla.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar a este cliente?");

                if (question == 0 && modelo.borrarCliente(id) != false) {
                    cleanTable();
                    cleanFields();
                    views.btn_registrar_cliente.setEnabled(true);
                    listAllCliente();
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
                }
            }
        } else if (e.getSource() == views.btn_cancelar_cliente) {
            views.btn_registrar_cliente.setEnabled(true);
            cleanFields();
        }
    }
    
    //Listar clientes
    public void listAllCliente() {
        List<ClientesDto> list = modelo.listarClientes(views.txt_search_cliente.getText());
        model = (DefaultTableModel) views.clientes_tabla.getModel();

        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNombre();
            row[2] = list.get(i).getApellido();
            row[3] = list.get(i).getCelular();
            row[4] = list.get(i).getDni();
            row[5] = list.get(i).getDireccion();
            row[6] = list.get(i).getEmail();
            model.addRow(row);
        }
        views.clientes_tabla.setModel(model);
        
        if (rol.equals("Caja") || rol.equals("Despacho")) {
                views.btn_registrar_cliente.setEnabled(false);
                views.btn_modificar_cliente.setEnabled(false);
                views.btn_eliminar_cliente.setEnabled(false);
                views.btn_cancelar_cliente.setEnabled(false);
                views.txt_cliente_nombre.setEnabled(false);
                views.txt_cliente_apellido.setEnabled(false);
                views.txt_cliente_email.setEditable(false);
                views.txt_cliente_dni.setEditable(false);
                views.txt_cliente_id.setEditable(false);
            }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.clientes_tabla) {
            int row = views.clientes_tabla.rowAtPoint(e.getPoint());
            views.txt_cliente_id.setText(views.clientes_tabla.getValueAt(row, 0).toString());
            views.txt_cliente_nombre.setText(views.clientes_tabla.getValueAt(row, 1).toString());
            views.txt_cliente_apellido.setText(views.clientes_tabla.getValueAt(row, 2).toString());
            views.txt_cliente_celular.setText(views.clientes_tabla.getValueAt(row, 3).toString());
            views.txt_cliente_dni.setText(views.clientes_tabla.getValueAt(row, 4).toString());
            views.txt_cliente_direccion.setText(views.clientes_tabla.getValueAt(row, 5).toString());
            views.txt_cliente_email.setText(views.clientes_tabla.getValueAt(row, 6).toString());

            //deshabilitar botones
            views.btn_registrar_cliente.setEnabled(false);
            views.txt_cliente_id.setEditable(false);
        } else if (e.getSource() == views.jLabelClientes) {
            
                views.jTabbedPane1.setSelectedIndex(2);
                //Limpiar tabla
                cleanTable();
                //Limpiar campos
                cleanFields();
                //Listar clientes
                listAllCliente();
                
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_search_cliente) {
            //Limpiar la tabla
            cleanTable();
            //Limpiar cliente
            listAllCliente();
        }
    }
        public void cleanFields() {
        views.txt_cliente_id.setText("");
        views.txt_cliente_id.setEditable(true);
        views.txt_cliente_nombre.setText("");
        views.txt_cliente_apellido.setText("");
        views.txt_cliente_dni.setText("");
        views.txt_cliente_celular.setText("");
        views.txt_cliente_direccion.setText("");
        views.txt_cliente_email.setText("");
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
}
