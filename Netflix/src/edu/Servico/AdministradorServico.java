package edu.Servico;

import java.util.ArrayList;

import edu.Exceptions.NomeErroException;
import edu.Repositorio.AdministradorRepositorio;
import edu.entidades.Administrador;

public class AdministradorServico {
  AdministradorRepositorio admservico = new AdministradorRepositorio();
  
  public void cadastrarAdministrador(Administrador administrador) throws NomeErroException{

    try {
      if(administrador.getName().isEmpty()){
        System.out.println("teste cadastro is empty");
        throw new NomeErroException();
      }else{
        System.out.println("Cadastrar ADm serviço");
        admservico.cadastrarAdministrador(administrador);
      }
    } catch (NomeErroException e) {
      e.getMessege(administrador.getName());
      System.out.println("test catch cadastro");
      
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

public ArrayList<Administrador> listarAdm(){
  return admservico.listarAdministrador();
}
}
