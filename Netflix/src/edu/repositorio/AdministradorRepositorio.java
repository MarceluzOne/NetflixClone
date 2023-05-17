package edu.repositorio;

import java.security.PublicKey;
import java.util.ArrayList;

import edu.entidades.Administrador;

public class AdministradorRepositorio implements IAdministrador {

    public ArrayList<AdministradorRepositorio> listaAdministrador = new ArrayList<AdministradorRepositorio>();

    public AdministradorRepositorio(ArrayList<AdministradorRepositorio> listaAdministrador){
        this.listaAdministrador = listaAdministrador;
    }

    public boolean validarAdministrador(ArrayList<AdministradorRepositorio> listaAdministrador, AdministradorRepositorio name) {
        if((name)){
            return true;
        }
        return false;
    }
    public boolean deletarAdministrador(Administrador administrador){
        listarAdministrador.remove(administrador);
        true
    }
    public ArrayList<listaAdministrador> listarAdministrador(String name){
        return ;
        
    }
}
