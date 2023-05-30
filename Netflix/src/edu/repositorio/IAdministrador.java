package edu.Repositorio;


import java.util.ArrayList;

import edu.entidades.Administrador;

public interface IAdministrador {
  public void cadastrarAdministrador(Administrador administrador);
  public ArrayList<Administrador> listarAdministrador();
  public void deletarAdministrador(ArrayList<Administrador> listaAdministrador, Administrador name);
  public Administrador buscarAdministrador(Administrador administrador);
}
