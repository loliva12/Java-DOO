package DTO;

public class PedidosDto {
    int num_pedido;
    int empleado;
    int cliente;
    String fecha;
    String estado;
    double total;
    String tipo; 

    public PedidosDto(int empleado, int cliente, double total) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.total = total;
    }

    public PedidosDto(int num_pedido, int empleado, int cliente, String fecha, String estado, double total, String tipo) {
        this.num_pedido = num_pedido;
        this.empleado = empleado;
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
        this.tipo = tipo; 
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
