package DTO;

import modelos.ProductoBuilder;

public class ProductosDto {
    private int id;
    private String nombre;
    private double precio;
    private String marca;
    private String modelo;
    private int stock;
    private String color;
    private String pais;
    private String dimension;
    private float peso;
    private int meses_garantia;
    private String description;

    public ProductosDto(ProductoBuilder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.stock = builder.stock;
        this.color = builder.color;
        this.pais = builder.pais;
        this.dimension = builder.dimension;
        this.peso = builder.peso;
        this.meses_garantia = builder.meses_garantia;
        this.description = builder.description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMeses_garantia() {
        return meses_garantia;
    }

    public void setMeses_garantia(int meses_garantia) {
        this.meses_garantia = meses_garantia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
