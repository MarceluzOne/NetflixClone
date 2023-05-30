package edu.Servico;

import edu.Exceptions.NomeErroException;

import edu.entidades.Administrador;

public class AdministradorServico {
  
  public void cadastrarAdministrador(Administrador administrador) throws NomeErroException{
    try {
      if(!administrador.getName().isBlank() &&
      !administrador.getName().isEmpty()){
        throw new NomeErroException();
      }else{
        cadastrarAdministrador(administrador);
      }
      
    } catch (NomeErroException e) {
      e.getMessege(administrador.getName());
      
    }
  


}
}
