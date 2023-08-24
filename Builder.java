/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import DTO.ProductosDto;

/**
 *
 * @author fedem
 */
public interface Builder {
    Builder conId(int id);
    Builder conNombre(String nombre);
    Builder conPrecio(double precio);
    Builder conMarca(String marca);
    Builder conModelo(String modelo);
    Builder conStock(int stock);
    Builder conColor(String color);
    Builder conPais(String pais);
    Builder conDimension(String dimension);
    Builder conPeso(float peso);
    Builder conMesesGarantia(int meses_garantia);
    Builder conDescripcion(String descripcion);

    ProductosDto build();
}
