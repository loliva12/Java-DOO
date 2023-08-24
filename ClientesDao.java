
package DAO;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import DTO.ClientesDto;
import DTO.ConnectionMySQL;

public class ClientesDao {

    ConnectionMySQL cn = new ConnectionMySQL(); 
    Connection conn; 
    PreparedStatement pst;
    ResultSet rs;
    
    //Registrar cliente
    public boolean registerClientesQuery(ClientesDto cliente){
        String query = "INSERT INTO clientes (id, nombre, apellido, celular, dni, domicilio, email) "
                + "VALUES (?,?,?,?,?,?,?)";
        
        Timestamp datetime = new Timestamp (new Date().getTime());
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query);
            pst.setInt(1, cliente.getId());
            pst.setString(2, cliente.getNombre());
            pst.setString(3, cliente.getApellido());
            pst.setString(4, cliente.getCelular());
            pst.setString(5, cliente.getDni());
            pst.setString(6, cliente.getDireccion());
            pst.setString(7, cliente.getEmail());
            pst.execute();
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar cliente"); 
            return false; 
        }
    }
    
    //Listar cliente
    public List listClientesQuery(String value){
        List<ClientesDto> lista_clientes = new ArrayList();
        String query = "SELECT * FROM clientes"; 
        String query_search_clientes = "SELECT * FROM clientes WHERE id LIKE '%" + value + "%'";
        
        try{
            conn = cn.getConnection();
            if(value.equalsIgnoreCase("")){
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery(); 
            }else{
                pst = conn.prepareStatement(query_search_clientes);
                rs = pst.executeQuery(); 
            }
            
            while(rs.next()){
                ClientesDto clientes = new ClientesDto(); 
                clientes.setId(rs.getInt("id"));
                clientes.setNombre(rs.getString("nombre"));
                clientes.setApellido(rs.getString("apellido"));
                clientes.setCelular(rs.getString("celular"));
                clientes.setDni(rs.getString("dni"));
                clientes.setDireccion(rs.getString("domicilio"));
                clientes.setEmail(rs.getString("email"));
                lista_clientes.add(clientes); 
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista_clientes; 
    }
    
    //Modificar cliente 
    public boolean updateClientesQuery(ClientesDto clientes){
        String query = "UPDATE clientes SET nombre = ?, apellido = ?, celular = ?, dni =  ?, domicilio = ?, email = ?  "
                + "WHERE id = ?";
        
        Timestamp datetime = new Timestamp (new Date().getTime());
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query);
            
            pst.setString(1, clientes.getNombre());
            pst.setString(2, clientes.getApellido());
            pst.setString(3, clientes.getCelular());
            pst.setString(4, clientes.getDni());
            pst.setString(5, clientes.getDireccion());
            pst.setString(6, clientes.getEmail());
            pst.setInt(7, clientes.getId());
            pst.execute();
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del cliente"); 
            return false; 
        }
    }
    
    //Eliminar cliente
    public boolean deleteClientesQuery(int id){
        String query ="DELETE FROM clientes WHERE id = " + id; 
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puede eliminar un cliente que tenga relación con otra tabla");
            return false; 
        }
    }
    
}
