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
public void deletarAdministrado(Administrador administrador){
  try{
    if(!administrador.getName().isBlank() &&
  !administrador.getName().isEmpty()){
    throw new NomeErroException();
    }else{deletarAdministrado(administrador);
    }
    } catch(NomeErroException e){
      e.getMessege(administrador.getName());
    }
}
public void alterarAdministrador(Administrador administrador){
  try{
    if(!administrador.getName().isBlank() &&
    !administrador.getName().isEmpty()){
      throw new NomeErroException();}
      else{};
  }catch(NomeErroException e){
    e.getMessege(administrador.getEmail());
  }


}
}
