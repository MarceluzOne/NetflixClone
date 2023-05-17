package edu.repositorio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import edu.entidades.Administrador;

public interface IAdministrador {
  public boolean cadastrarAdministrador(Administrador name);
  public boolean deletarAdministrador();
  public ArrayList<Administrador> listarAdministrador();
  public boolean atualizarAdministrador(Administrador name);
  public boolean validarAdministrador(ArrayList<Administrador> listaAdministrador, Administrador name);

}
