package modelos;

import DAO.ClientesDao;
import DTO.ClientesDto;
import java.util.List;

/**
 *
 * @author fedem
 */
public class ClienteModelo {
    private ClientesDao dao;

    public ClienteModelo() {
        this.dao = new ClientesDao();
    }
    
    public boolean registrarCliente( ClientesDto dto ){
        return( dao.registerClientesQuery(dto) );
    }
    
    public boolean actualizarCliente ( ClientesDto dto ){
        return( dao.updateClientesQuery(dto) );
    }
    
    public boolean borrarCliente ( int id ){
        return( dao.deleteClientesQuery(id) );
    }
    
    public List listarClientes ( String value ){
        return( dao.listClientesQuery(value) );
    }
    
}
