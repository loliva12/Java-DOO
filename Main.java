package main;

import views.login;
import controllers.LoginController;
import modelos.EmpleadoModelo;

public class Main {

    public static void main(String[] args) {

        login vista             = new login();
        EmpleadoModelo modelo   = new EmpleadoModelo();
        LoginController login   = new LoginController( modelo, vista );

    }
    
}
