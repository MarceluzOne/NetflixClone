package edu.repositorio;

import java.util.ArrayList;

import edu.entidades.Administrador;

public class AdministradorRepositorio implements IAdministrador {
	public ArrayList<Administrador> listaAdministrador = new ArrayList<Administrador>();

    public boolean cadastrarAdministrador(Administrador name){
        listaAdministrador.add(name);
        return true;
    }
    
    public ArrayList<Administrador> listarAdministrador(){
        return listaAdministrador;
    }
    public boolean atualizarAdministrador(Administrador administrador){
        for (Administrador administrador2 : listaAdministrador) {
            if(administrador.getCPF().equals(administrador2.getCPF())){
                administrador2 = administrador;
            }
            
        }

        return true;
    }
    public boolean validarAdministrador(ArrayList<Administrador> listaAdministrador, Administrador name){
        return true;
    }
    
    public boolean deletarAdministrador(Administrador name) {
      listaAdministrador.remove(name);
      return true;
    }






}
