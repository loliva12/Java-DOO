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
import DTO.EmpleadosDto;
import static controllers.LoginController.rol_user;
import static controllers.LoginController.id_user;
import modelos.EmpleadoModelo;
import views.SystemView;

public class EmpleadosController implements ActionListener, MouseListener, KeyListener{

   private EmpleadoModelo modelo;
   private SystemView views;

   String rol = rol_user; 
   DefaultTableModel model = new DefaultTableModel();
   
   public EmpleadosController( EmpleadoModelo modelo, SystemView views) {

        this.modelo = modelo;
        this.views  = views;
        
        //Settings de botones
        this.views.btn_registrar_empleado.addActionListener(this);
        this.views.btn_modificar_empleado.addActionListener(this);
        this.views.btn_eliminar_empleado.addActionListener(this);
        this.views.btn_cancelar_empleado.addActionListener(this);
        this.views.jLabelEmpleados.addMouseListener(this);
        this.views.empleado_table.addMouseListener(this);
        this.views.txt_search_empleado.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Verificar si los campos estan vacios
        if(e.getSource() == views.btn_registrar_empleado){
            if(views.txt_empleado_id.getText().equals("") 
                    || views.txt_empleado_apellido.getText().equals("")
                    || views.txt_empleado_username.getText().equals("")
                    || views.txt_empleado_address.getText().equals("")
                    || views.txt_empleado_telephone.getText().equals("")
                    || views.txt_empleado_email.getText().equals("")
                    || views.cmb_rol.getSelectedItem().toString().equals("")
                    || String.valueOf(views.txt_empleado_password.getPassword()).equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                //Realizar la insercion
                int id              = Integer.parseInt(views.txt_empleado_id.getText().trim());
                String nombre       = views.txt_empleado_nombre.getText().trim();
                String apellido     = views.txt_empleado_apellido.getText().trim();
                String username     = views.txt_empleado_username.getText().trim();
                String password     = String.valueOf(views.txt_empleado_password.getPassword());
                String direccion    = views.txt_empleado_address.getText().trim();
                String email        = views.txt_empleado_email.getText().trim();
                String telefono     = views.txt_empleado_telephone.getText().trim();
                String rol          = views.cmb_rol.getSelectedItem().toString();
                
                if(modelo.registrarEmpleado(new EmpleadosDto(id, nombre, apellido, username, password, direccion, email, telefono, rol) )){
                    cleanTable();
                    cleanFields();
                    listAllEmpleados();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al empleado");
                }
                
            }
        }else if(e.getSource() == views.btn_modificar_empleado){
           //verificar si la persona ha seleccionado una fila  
           if(views.txt_empleado_id.equals("")){
               JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
           }else{
               //Verificar si los campos estan vacios
               if(views.txt_empleado_id.getText().equals("")
                       || views.txt_empleado_apellido.getText().equals("")
                       || views.cmb_rol.getSelectedItem().toString().equals("")){
                   
                   JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                   
               }else{
                    int id              = Integer.parseInt(views.txt_empleado_id.getText().trim());
                    String nombre       = views.txt_empleado_apellido.getText().trim();
                    String apellido     = views.txt_empleado_apellido.getText().trim();
                    String username     = views.txt_empleado_username.getText().trim();
                    String password     = String.valueOf(views.txt_empleado_password.getPassword());
                    String direccion    = views.txt_empleado_address.getText().trim();
                    String email        = views.txt_empleado_email.getText().trim();
                    String telefono     = views.txt_empleado_telephone.getText().trim();
                    String rol          = views.cmb_rol.getSelectedItem().toString();
                    
                    if(modelo.updateEmpleado(new EmpleadosDto(id, nombre, apellido, username, password, direccion, email, telefono, rol))){
                        cleanTable();
                        cleanFields();
                        listAllEmpleados(); 
                        views.btn_registrar_empleado.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Datos del empleados modificados con éxito");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar al empleado");
                    }
               }
           } 
        }else if(e.getSource() == views.btn_eliminar_empleado){
            int row = views.empleado_table.getSelectedRow(); //Almacena el registro que presionó el usuario
            
            if(row == -1){
                JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado para eliminar");
            }else if(views.empleado_table.getValueAt(row, 0).equals(id_user)){
                JOptionPane.showMessageDialog(null, "No puede elimanar al usuario autenticado");
            }else{
                int id = Integer.parseInt(views.empleado_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar a este empleado");
                
                if(question == 0 && modelo.borrarEmpleado(id) != false){
                    cleanTable();
                    cleanFields();
                    views.btn_registrar_empleado.setEnabled(true);
                    views.txt_empleado_password.setEnabled(true);
                    listAllEmpleados();
                    JOptionPane.showMessageDialog(null, "Empleado eliminado con éxito");
                }
            }
        }else if(e.getSource() == views.btn_cancelar_empleado){
            cleanFields(); 
            views.btn_registrar_empleado.setEnabled(true);
            views.txt_empleado_password.setEnabled(true);
            views.txt_empleado_id.setEnabled(true);
        }
    }
    
    //Listar todos los empleados
    public void listAllEmpleados(){
        if(rol.equals("Administrativo")){
            List<EmpleadosDto> list = modelo.listarEmpleados(views.txt_search_empleado.getText()); 
            model = (DefaultTableModel) views.empleado_table.getModel(); 
            Object[] row = new Object[7];
            for(int i = 0; i<list.size(); i++){
                row[0] = list.get(i).getId(); 
                row[1] = list.get(i).getNombre(); 
                row[2] = list.get(i).getUsername(); 
                row[3] = list.get(i).getDireccion(); 
                row[4] = list.get(i).getCelular(); 
                row[5] = list.get(i).getEmail(); 
                row[6] = list.get(i).getRol();
                model.addRow(row);
            }
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.empleado_table){
            int row = views.empleado_table.rowAtPoint(e.getPoint());   //es para ver dpnde se hizo click
            views.txt_empleado_id.setText(views.empleado_table.getValueAt(row, 0).toString());
            views.txt_empleado_apellido.setText(views.empleado_table.getValueAt(row, 1).toString());
            views.txt_empleado_username.setText(views.empleado_table.getValueAt(row, 2).toString());
            views.txt_empleado_address.setText(views.empleado_table.getValueAt(row, 3).toString());
            views.txt_empleado_telephone.setText(views.empleado_table.getValueAt(row, 4).toString());
            views.txt_empleado_email.setText(views.empleado_table.getValueAt(row, 5).toString());
            views.cmb_rol.setSelectedItem(views.empleado_table.getValueAt(row, 6).toString());
            
            //Deshabilitar
            views.txt_empleado_id.setEditable(false);
            views.txt_empleado_password.setEnabled(false);
            views.btn_registrar_empleado.setEnabled(false);
        }else if(e.getSource() == views.jLabelEmpleados){
            if(rol.equals("Administrativo")){
                views.jTabbedPane1.setSelectedIndex(0);
                //Limpiar tabla
                cleanTable(); 
                //Limpiar campos
                cleanFields();
                //Listar empleados
                listAllEmpleados(); 
            }else{
                views.jTabbedPane1.setEnabledAt(0, false);
                views.jLabelEmpleados.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No tienes privilegios de administrativo");
            }
        }else{
            if(rol.equals("Administrativo")){
                views.jTabbedPane1.setSelectedIndex(5);
                //Limpiar tabla
                cleanTable(); 
                //Limpiar campos
                cleanFields();
                //Listar empleados
                listAllEmpleados(); 
            }else{
                views.jTabbedPane1.setEnabledAt(7, false);
                views.jLabelEmpleados.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No tienes privilegios de administrativo");
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == views.txt_search_empleado){
            cleanTable();
            listAllEmpleados(); 
        }
    }
    
    //Limpiar campos
    public void cleanFields(){
        views.txt_empleado_id.setText("");
        views.txt_empleado_id.setEditable(true);
        views.txt_empleado_nombre.setText("");
        views.txt_empleado_apellido.setText("");
        views.txt_empleado_username.setText("");
        views.txt_empleado_address.setText("");
        views.txt_empleado_telephone.setText("");
        views.txt_empleado_email.setText("");
        views.txt_empleado_password.setText("");
        views.cmb_rol.setSelectedIndex(0);
    }
    
     //Metodo para limpiar la tabla
    public void cleanTable(){
        for(int i = 0; i<model.getRowCount(); i++){
            model.removeRow(i);
            i = i - 1; 
        }
    }
    
}
