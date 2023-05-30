package edu.Repositorio;

import java.util.ArrayList;

import edu.entidades.Administrador;

public class AdministradorRepositorio implements IAdministrador  {

    public ArrayList<AdministradorRepositorio> listaAdministrador;

    public AdministradorRepositorio(ArrayList<AdministradorRepositorio> listaAdministrador){
        this.listaAdministrador = listaAdministrador;
    }


    public void cadastrarAdministrador( AdministradorRepositorio name){
        listaAdministrador.add(name);
    }
    //LER
    public ArrayList<AdministradorRepositorio> listarAdministrador(){
        return listaAdministrador;
    }

    //DELETAR
    public void deletarAdministrador(ArrayList<AdministradorRepositorio> listaAdministrador, AdministradorRepositorio name){
        listaAdministrador.remove(name);
    }
    // MODIFICAR

    public void atualizarAdministrador( AdministradorRepositorio name, int index){
        listaAdministrador.add(index, name);
    }

    public Administrador buscarAdministrador(Administrador administrador){
        listaAdministrador.contains(administrador);
        return administrador;
    }

}
