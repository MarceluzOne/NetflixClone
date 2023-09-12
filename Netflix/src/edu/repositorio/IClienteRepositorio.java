package edu.Repositorio;

import java.util.ArrayList;

import edu.entidades.Cliente;

public interface IClienteRepositorio {
  
  public void salvarCliente(Cliente name);
  public ArrayList<Cliente> listarCliente();
  public void deletarCliente(Cliente cliente);
  public void atualizarCliente(Cliente cliente, int index);

  
}
