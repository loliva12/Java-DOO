package DAO;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DTO.ConnectionMySQL;
import DTO.DetalleDto;
import DTO.PedidosDto;

public class PedidosDao {

    ConnectionMySQL cn = new ConnectionMySQL(); 
    Connection conn; 
    PreparedStatement pst;
    ResultSet rs;
    
    //Registrar pedidio
    public boolean registrarPedidoQuery(PedidosDto pedido){
        String query = "INSERT INTO pedidos (empleado_id, cliente_id, fecha, estado, total)"
                + "VALUES(?,?,?,?,?)";
        
        Timestamp datetime = new Timestamp (new Date().getTime());
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.setInt(1, pedido.getEmpleado());
            pst.setInt(2, pedido.getCliente());
            pst.setTimestamp(3, datetime);
            pst.setString(4, "Creado");
            pst.setDouble(5, pedido.getTotal());
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al insertar el pedido");
            return false; 
        }
    }
    
    //Registrar detalles del pedido
    public boolean registrarPedidoDetalleQuery( DetalleDto detalleDto ){
        String query = "INSERT INTO detallespedidos (pedido_id, producto_id, pedido_precio, cantidad_producto)"
                + "VALUES(?,?,?,?)";
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.setInt(1, detalleDto.getPedido_id());
            pst.setInt(2, detalleDto.getProducto());
            pst.setDouble(3, detalleDto.getPedido_precio());
            pst.setInt(4, detalleDto.getCantidad_productos());
            pst.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar los detalles del pedido" + e);
            return false; 
        }
    }
    
    //Obtener el id del pedido
    public int pedidoId(){
        int id = 0; 
        String query = "SELECT MAX(id) AS id FROM pedidos"; 
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            rs = pst.executeQuery(); 
            
            if(rs.next()){
                id = rs.getInt("id"); 
            }
        }catch(SQLException e){
            System.err.println(e.getMessage()); 
        }
        return id; 
    }

// Listar todos los pedidos realizados
public List<PedidosDto> listAllPedidosQuery() {
    List<PedidosDto> lista_pedidos = new ArrayList<>();
    String query = "SELECT * FROM pedidos";

    try {
        conn = cn.getConnection();
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();

        while (rs.next()) {
            
            PedidosDto pedidos = new PedidosDto(rs.getInt("id"), rs.getInt("empleado_id"), rs.getInt("cliente_id"), rs.getString("fecha"), rs.getString("estado"), rs.getDouble("total"),rs.getString("tipo") );
            
            lista_pedidos.add(pedidos);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
        // Cerrar los recursos de la base de datos (rs, pst, conn)
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    return lista_pedidos;
}

    
    //Modificar producto
    public boolean updateEstadoQuery(String estado, int id){
        String query = "UPDATE pedidos SET estado = ? WHERE id = ?"; 
        Timestamp datetime = new Timestamp (new Date().getTime());
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query);
            pst.setString(1, estado);
            pst.setInt(2, id); 
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del estado del pedido");
            return false; 
        }
    }
    
    public boolean updateEstadoPagoQuery(String estado, String tipo ,int id){
        String query = "UPDATE pedidos SET estado = ?, tipo = ? WHERE id = ?"; 
        Timestamp datetime = new Timestamp (new Date().getTime());
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query);
            pst.setString(1, estado);
            pst.setString(2, tipo);
            pst.setInt(3, id); 
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del estado del pedido");
            return false; 
        }
    }
    
}
