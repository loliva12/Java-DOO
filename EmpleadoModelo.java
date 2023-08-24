package modelos;

import DAO.EmpleadosDao;
import DTO.EmpleadosDto;
import java.util.List;

/**
 *
 * @author fedem
 */
public class EmpleadoModelo {
    private EmpleadosDao dao;

    public EmpleadoModelo() {
        this.dao = new EmpleadosDao();
    }
    
    public EmpleadosDto loginEmpleado( String username, String password )
    {
        return(dao.loginQuery(username, password));
    }
    
    public boolean registrarEmpleado( EmpleadosDto empleado )
    {
        return( dao.registerEmployeeQuert( empleado ) );
    }
    
    public List listarEmpleados( String value )
    {
        return( dao.listEmpleadoQuery(value) );
    }
    
    public boolean updateEmpleado( EmpleadosDto empleado )
    {
        return( dao.updateEmpleadoQuery(empleado) );
    }
    
    public boolean borrarEmpleado( int id )
    {
        return( dao.deleteEmpleadoQuery(id) );
    }
    
    public boolean updateEmpleadoPass( EmpleadosDto empleado )
    {
        return( dao.updateEmploeadoPassword(empleado) );
    }
}
