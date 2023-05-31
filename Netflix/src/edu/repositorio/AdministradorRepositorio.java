package edu.Repositorio;

import java.util.ArrayList;

import edu.entidades.Administrador;

public class AdministradorRepositorio implements IAdministrador  {

    public ArrayList<Administrador> listaAdministrador = new ArrayList<Administrador>();


    public void cadastrarAdministrador( Administrador administrador){
        listaAdministrador.add(administrador);
    }
    //LER
    public ArrayList<Administrador> listarAdministrador(){
        return listaAdministrador;
    }

    //DELETAR
    public void deletarAdministrador(ArrayList<Administrador> listaAdministrador, Administrador name){
        listaAdministrador.remove(name);
    }
    // MODIFICAR

    public void atualizarAdministrador( Administrador name, int index){
        listaAdministrador.add(index, name);
    }

    public Administrador buscarAdministrador(Administrador administrador){
        //listaAdministrador.contains(administrador.getName());
        return administrador;
    }

}