package edu.repositorio;

import java.util.ArrayList;

import edu.entidades.Cliente;

public interface IClienteRepositorio {
  
  public boolean salvarCliente(Cliente cliente);
  public ArrayList<Cliente> listarCliente(String cliente);
  public boolean deletarCliente(Cliente cliente);
  public boolean atualizarCliente(Cliente cliente);

  
}
