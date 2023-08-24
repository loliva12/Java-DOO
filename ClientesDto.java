package DTO;

import modelos.Persona;

public class ClientesDto extends Persona {
    private int id; 
    private String dni;

    public ClientesDto() {
    }

    public ClientesDto(int id, String nombre, String apellido, String celular, String dni, String direccion, String email) {
        super(nombre, apellido, celular, direccion, email);
        this.id = id;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
