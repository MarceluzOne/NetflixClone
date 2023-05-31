package edu.Servico;
import edu.entidades.Cliente;

import java.util.ArrayList;
import edu.Exceptions.NomeErroException;
import edu.Repositorio.ClienteRepositorio;

public class ClienteServico {

  ClienteRepositorio repoCliente = new ClienteRepositorio();

  public void cadastrar(Cliente cliente){
    try{
      if(cliente.getName().length() > 15){
        throw new NomeErroException();
      }else{
        repoCliente.salvarCliente(cliente);
      }
    } catch(NomeErroException e){
      e.getMessege(cliente.getName());
    }
  }

  public void deletarCliente(Cliente cliente){
    try{
      if(!cliente.getName().isEmpty()){
        throw new NomeErroException();
        }else{
          repoCliente.deletarCliente(cliente);
        }
    } catch( NomeErroException e){
      e.getMessege(cliente.getName());
    }
  }
  public void atualizarCliente(Cliente cliente){
    try{
      if(!cliente.getName().isBlank()){
        throw new NomeErroException();
    }else{
      repoCliente.atualizarCliente(cliente, 0);
    }
    }catch (NomeErroException e){
    e.getMessege(cliente.getName());
    }
  }
  public ArrayList<Cliente> listarCliente(){
    return repoCliente.listarCliente();
  }
}
