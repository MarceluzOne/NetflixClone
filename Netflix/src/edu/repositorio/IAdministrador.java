package edu.Repositorio;


import java.util.ArrayList;

public interface IAdministrador {
  public void cadastrarAdministrador();
  public ArrayList<AdministradorRepositorio> listarAdministrador();
  public void deletarAdministrador();
  public void atualizarAdministrador();

}
