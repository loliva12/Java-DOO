package DTO;

import modelos.Persona;

public class EmpleadosDto extends Persona {
    private int id; 
    private String username; 
    private String password;
    private String rol; 

    public EmpleadosDto(int id, String nombre, String apellido, String username, String password, String direccion, String email, String telephone, String rol) {
        super(nombre, apellido, telephone, direccion, email);
        this.id = id;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public EmpleadosDto(int id, String nombre, String apellido, String username, String direccion, String email, String telephone, String rol) {
        super(nombre, apellido, telephone, direccion, email);
        this.id = id;
        this.username = username;
        this.rol = rol;
    }

    public EmpleadosDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
