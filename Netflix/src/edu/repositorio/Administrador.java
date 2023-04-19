package edu.repositorio;

import java.security.PublicKey;
import java.util.ArrayList;

public class Administrador implements IAdministrador {
    
    public ArrayList<Administrador> listaAdministrador;

    public Administrador(ArrayList<Administrador> listaAdministrador){
        this.listaAdministrador = listaAdministrador;
    }

    public @Override
    public boolean validarAdministrador(edu.entidades.Administrador name) {
        // TODO Auto-generated method stub
        return false;
    }
}
