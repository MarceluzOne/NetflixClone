package edu.repositorio;

import java.security.PublicKey;
import java.util.ArrayList;

public class Administrador implements IAdministrador {
    
    public ArrayList<Administrador> listaAdministrador;

    public Administrador(ArrayList<Administrador> listaAdministrador){
        this.listaAdministrador = listaAdministrador;
    }

    public boolean validarAdministrador(ArrayList<Administrador> listaAdministrador, Administrador name) {
        if((name)){
            return true;
        }
        return false;
    }
}
