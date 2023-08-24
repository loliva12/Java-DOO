package modelos;

import DAO.PedidosDao;
import DAO.ProductosDao;
import DTO.DetalleDto;
import DTO.PedidosDto;
import DTO.ProductosDto;
import java.util.List;

/**
 *
 * @author fedem
 */
public class PedidoModelo {
    private PedidosDao dao;
    private ProductosDao productoDao;

    public PedidoModelo() {
        this.dao = new PedidosDao();
        this.productoDao = new ProductosDao();
    }
    
    public boolean registrarPedido( PedidosDto pedido )
    {
        return( dao.registrarPedidoQuery(pedido) );
    }
    
    public boolean actualizarEstado( String estado, int id )
    {
        return( dao.updateEstadoQuery( estado, id ));
    }
    
    public boolean actualizarEstadoPago( String estado, String tipo , int id )
    {
        return( dao.updateEstadoPagoQuery( estado,tipo ,id ));
    }
    
    public int maxPedidoId()
    {
        return( dao.pedidoId() );
    }
    
    public List listAllPedidos()
    {
        return( dao.listAllPedidosQuery() );
    }
    
    public ProductosDto buscarProducto( int id )
    {
        return ( productoDao.searchProduct(id) );
    }
    
    public boolean registrarPedidoDetalle( DetalleDto detalleDto )
    {
        return( dao.registrarPedidoDetalleQuery( detalleDto ));
    }

    public void generarTicket() {
        throw new UnsupportedOperationException("Todavia no implementado.");
    }
}
