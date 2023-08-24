package modelos;

import DAO.ProductosDao;
import DTO.ProductosDto;
import java.util.List;

/**
 *
 * @author fedem
 */
public class ProductoModelo {
    private ProductosDao dao;

    public ProductoModelo() {
        this.dao = new ProductosDao();
    }
    
    public boolean registrarProducto( ProductosDto dto ){
        return( dao.registerProductQuery(dto) );
    }
    
    public boolean actualizarProducto ( ProductosDto dto ){
        return( dao.updateProductQuery(dto) );
    }
    
    public boolean borrarProducto ( int id ){
        return( dao.deleteProductQuery(id) );
    }
    
    public List listarProductos ( String value ){
        return( dao.listProductQuery(value) );
    }
    
    public ProductosDto buscarProducto( int id ){
        return ( dao.searchProduct(id) );
    }
    
}