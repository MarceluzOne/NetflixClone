package edu.Repositorio;

import java.util.ArrayList;

import edu.entidades.Cliente;

public interface IClienteRepositorio {
  
  public void salvarCliente(Cliente cliente);
  public ArrayList<Cliente> listarCliente(String cliente);
  public void deletarCliente(Cliente cliente);
  public void atualizarCliente(Cliente cliente, int index);

  
}
