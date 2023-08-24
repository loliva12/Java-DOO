package modelos;

import DTO.ProductosDto;

/**
 *
 * @author fedem
 */
public class ProductoBuilder implements Builder {
    public int id;
    public String nombre;
    public double precio;
    public String marca;
    public String modelo;
    public int stock;
    public String color;
    public String pais;
    public String dimension;
    public float peso;
    public int meses_garantia;
    public String description;

    public ProductoBuilder(String nombre, double precio, String marca, String modelo, int stock, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.stock = stock;
        this.color = color;
    }

    public ProductoBuilder() {
    }

    @Override
    public Builder conId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public Builder conPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public Builder conMarca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public Builder conModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public Builder conStock(int stock) {
        this.stock = stock;
        return this;
    }

    @Override
    public Builder conColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder conPais(String pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public Builder conDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public Builder conPeso(float peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public Builder conMesesGarantia(int meses_garantia) {
        this.meses_garantia = meses_garantia;
        return this;
    }

    @Override
    public Builder conDescripcion(String descripcion) {
        this.description = descripcion;
        return this;
    }

    @Override
    public ProductosDto build() {
        return new ProductosDto(this);
    }
}
