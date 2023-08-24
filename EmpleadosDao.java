package DAO;

import java.sql.Timestamp;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DTO.ConnectionMySQL;
import DTO.EmpleadosDto;

public class EmpleadosDao {

    ConnectionMySQL cn = new ConnectionMySQL(); 
    Connection conn; 
    PreparedStatement pst;
    ResultSet rs;
    
    //Variables para enviar datos entre interfaces 
    public static int id_user = 0;
    public static String rol_user = "";

    //Metodo de login
    public EmpleadosDto loginQuery(String user, String password){
        String query = "SELECT * FROM empleados WHERE username = ? AND password = ?"; 
        EmpleadosDto empleado = new EmpleadosDto();
        try{
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            //Enviar parametros
            pst.setString(1, user);     
            pst.setString(2, password);
            rs = pst.executeQuery(); //ejecutar la consulta
            
            if(rs.next()){

                empleado = new EmpleadosDto( rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("username"), rs.getString("address"), rs.getString("email"), rs.getString("telephone"), rs.getString("rol")); 
                
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener al empleado " + e);
        }
        return empleado; 
    }
    
    //Registrar empleados
    public boolean registerEmployeeQuert(EmpleadosDto empleado){
        String query =         "INSERT INTO empleados (id, nombre, apellido, username, address, telephone, email, password, rol)" 
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime()); //obtiene la fecha y hora exacta del registro y de la actualizacion

        try{
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            //acceder a los metodos setters de empleados para enviar los datos que se registraran en la base de datos 
            pst.setInt(1, empleado.getId());
            pst.setString(2, empleado.getNombre());
            pst.setString(3, empleado.getApellido());
            pst.setString(4, empleado.getUsername()); 
            pst.setString(5, empleado.getDireccion());
            pst.setString(6, empleado.getCelular()); 
            pst.setString(7, empleado.getEmail()); 
            pst.setString(8, empleado.getPassword());
            pst.setString(9, empleado.getRol());
            pst.execute();
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar al empleado " + e);
            return false; 
        }
    }
    
    //Listar empleado
    public List listEmpleadoQuery(String value){
        List<EmpleadosDto> list_empleado = new ArrayList(); 
        //Consulta para listar todos los empleados 
        String query ="SELECT * FROM empleados ORDER BY rol ASC";
        //Consulta para listar el empleado buscado
        String query_buscar_empleado = "SELECT * FROM empleados WHERE nombre LIKE '%" + value + "%'";
        
        try{
            conn = cn.getConnection();
            if(value.equalsIgnoreCase("")){
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery(); 
            }else{
                pst = conn.prepareStatement(query_buscar_empleado);
                rs = pst.executeQuery(); 
            }
            
            //recorre este ciclo mientas encuentra registros
            //rs nos devuelve todos los resultados que trea esta consulta
            while(rs.next()){
                EmpleadosDto empleado = new EmpleadosDto( rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("username"), rs.getString("address"), rs.getString("email"), rs.getString("telephone"), rs.getString("rol")); 
                list_empleado.add(empleado);  //pasamos toda la informacion a la lista 
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_empleado; 
    }
    
    //Modificar empleaado
    public boolean updateEmpleadoQuery(EmpleadosDto empleado){
        String query = "UPDATE empleados SET nombre = ?, apellido = ?, username = ?, address = ?, telephone = ?, email = ?, rol = ?"
                + "WHERE id = ?";
        Timestamp datetime = new Timestamp(new Date().getTime()); //obtiene la fecha y hora exacta del registro y de la actualizacion
        
        try{
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            //acceder a los metodos setters de empleados para enviar los datos que se registraran en la base de datos 
            pst.setString(1, empleado.getNombre());
            pst.setString(2, empleado.getApellido());
            pst.setString(3, empleado.getUsername()); 
            pst.setString(4, empleado.getDireccion());
            pst.setString(5, empleado.getCelular()); 
            pst.setString(6, empleado.getEmail()); 
            pst.setString(7, empleado.getRol());
            pst.setInt(8, empleado.getId());
            pst.execute();
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del empleado " + e);
            return false; 
        }
    }
    
    //Eliminar empleado
    public boolean deleteEmpleadoQuery(int id){
        String query ="DELETE FROM empleados WHERE id = " + id; 
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puede eliminar un empleado que tenga relación con otra tabla");
            return false; 
        }
    }
    
    //Cambiar la contraseña
    public boolean updateEmploeadoPassword(EmpleadosDto empleado){
        String query = "UPDATE empleados SET password = ? WHERE username = '" + empleado.getPassword() + "'";
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.setString(1, empleado.getPassword());
            pst.executeUpdate(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar la contraseña" + e);
            return false; 
        }
    }
    
    
    
}


