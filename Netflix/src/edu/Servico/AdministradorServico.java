package edu.Servico;

import Exceptions.NomeInvalidoException;
import edu.entidades.Administrador;
import edu.repositorio.AdministradorRepositorio;

public class AdministradorServico {
  private static AdministradorRepositorio = new AdministradorRepositorio();

  public void cadastraAdministrador (Administrador name){
    try{
      if(name.getName().length()<30){
        throw new NomeInvalidoException()
      }else{
        AdministradorServico.getAdministradorRepositorio().save(name);
      }
    } catch (Exception e) {
      System.out.println("Seu nome é muito longo");
    }
  }

  public void 
}
