package edu.Repositorio;


import java.util.ArrayList;

public interface IAdministrador {
  public void cadastrarAdministrador(AdministradorRepositorio name);

  public ArrayList<AdministradorRepositorio> listarAdministrador();

  public void deletarAdministrador(ArrayList<AdministradorRepositorio> listaAdministrador, AdministradorRepositorio name);

  
  public void atualizarAdministrador( AdministradorRepositorio name, int index);

}
