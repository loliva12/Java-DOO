package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DTO.ConnectionMySQL;
import DTO.ProductosDto;
import modelos.ProductoBuilder;

public class ProductosDao {

    ConnectionMySQL cn = new ConnectionMySQL(); 
    Connection conn; 
    PreparedStatement pst;
    ResultSet rs;
    
    //Registrar producto
    public boolean registerProductQuery(ProductosDto producto){
        String query = "INSERT INTO productos ( nombre, precio, marca, modelo, stock, color, pais, dimension, peso, meses_garantia, descripcion )"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)"; 
        Timestamp datetime = new Timestamp (new Date().getTime());
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query);
            pst.setString(1, producto.getNombre());
            pst.setDouble(2, producto.getPrecio()); 
            pst.setString(3, producto.getMarca());
            pst.setString(4, producto.getModelo());
            pst.setInt(5, producto.getStock());
            pst.setString(6, producto.getColor());
            pst.setString(7, producto.getPais());
            pst.setString(8, producto.getDimension());
            pst.setFloat(9, producto.getPeso());
            pst.setInt(10, producto.getMeses_garantia());
            pst.setString(11, producto.getDescription());
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar el producto");
            return false; 
        }
    }
    
    //Listar producto
    public List listProductQuery(String value){
        List<ProductosDto> lista_productos = new ArrayList(); 
        String query = "SELECT * FROM productos";
        String query_search_product = "SELECT * FROM productos WHERE id LIKE '%" + value + "%'";
        
        try{
             conn = cn.getConnection();
            if(value.equalsIgnoreCase("")){
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery(); 
            }else{
                pst = conn.prepareStatement(query_search_product);
                rs = pst.executeQuery(); 
            }
            while(rs.next()){
                ProductosDto producto = new ProductoBuilder().conId(rs.getInt("id")).conNombre(rs.getString("nombre")).conPrecio(rs.getDouble("precio")).conMarca(rs.getString("marca")).conModelo(rs.getString("modelo")).conStock(rs.getInt("stock")).conColor(rs.getString("color")).conPais(rs.getString("pais")).conDimension(rs.getString("dimension")).conPeso(rs.getFloat("peso")).conMesesGarantia(rs.getInt("meses_garantia")).conDescripcion(rs.getString("descripcion")).build();
                lista_productos.add(producto);
            }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista_productos; 
    }
    
    //Modificar producto
    public boolean updateProductQuery(ProductosDto producto){
        String query = "UPDATE productos SET nombre = ?, precio = ?, marca = ?, modelo = ?, stock = ?, color = ?, pais = ?, dimension = ?, peso = ?, meses_garantia = ?, descripcion = ? "
                + "WHERE id = ?";
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query);
            
            pst.setString(1, producto.getNombre());
            pst.setDouble(2, producto.getPrecio()); 
            pst.setString(3, producto.getMarca());
            pst.setString(4, producto.getModelo());
            pst.setInt(5, producto.getStock());
            pst.setString(6, producto.getColor());
            pst.setString(7, producto.getPais());
            pst.setString(8, producto.getDimension());
            pst.setFloat(9, producto.getPeso());
            pst.setInt(10, producto.getMeses_garantia());
            pst.setString(11, producto.getDescription());
            pst.setInt(12, producto.getId());
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del producto");
            return false; 
        }
    }
    
    //Eliminar producto
    public boolean deleteProductQuery(int id){
        String query ="DELETE FROM productos WHERE id = " + id; 
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puede eliminar un producto que tenga relación con otra tabla");
            return false; 
        }
    }
    
    //Buscar producto
    public ProductosDto searchProduct(int id){
        String query = "SELECT * FROM productos WHERE id = " + id; 
        
        ProductosDto producto = null;
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            rs = pst.executeQuery();
            
            if(rs.next()){
                producto = new ProductoBuilder().conId(rs.getInt("id")).conNombre(rs.getString("nombre")).conPrecio(rs.getDouble("precio")).conMarca(rs.getString("marca")).conModelo(rs.getString("modelo")).conStock(rs.getInt("stock")).conColor(rs.getString("color")).conPais(rs.getString("pais")).conDimension(rs.getString("dimension")).conPeso(rs.getFloat("peso")).conMesesGarantia(rs.getInt("meses_garantia")).conDescripcion(rs.getString("descripcion")).build();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return producto; 
    }
    
    
    //Traer la cantidad de productos
    public ProductosDto searchId(int id){
        String query = "SELECT stock FROM productos WHERE id = " + id; 
        ProductosDto producto = null;
        
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            rs = pst.executeQuery(); 
            if(rs.next()){
                producto = new ProductoBuilder().conId(id).conStock(rs.getInt("stock")).build();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return producto; 
    }
    
    //Actualizar stock
    public boolean updateStockQuery(int stock, int id){
        String query = "UPDATE productos SET stock = ? WHERE id = ?";
        try{
            conn = cn.getConnection(); 
            pst = conn.prepareStatement(query); 
            pst.setInt(1, stock);
            pst.setInt(2, id);
            pst.execute(); 
            return true; 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false; 
        }
    }
}
