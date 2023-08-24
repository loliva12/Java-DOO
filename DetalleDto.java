/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author fedem
 */
public class DetalleDto {
    int pedido_id;
    int producto;
    double pedido_precio;
    int cantidad_productos;

    public DetalleDto(int pedido_id, int producto, double pedido_precio, int cantidad_productos) {
        this.pedido_id = pedido_id;
        this.producto = producto;
        this.pedido_precio = pedido_precio;
        this.cantidad_productos = cantidad_productos;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public double getPedido_precio() {
        return pedido_precio;
    }

    public void setPedido_precio(double pedido_precio) {
        this.pedido_precio = pedido_precio;
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }
    
       
    
}
