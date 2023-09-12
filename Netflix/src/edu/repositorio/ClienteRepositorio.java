package edu.Repositorio;
import java.util.ArrayList;
import edu.entidades.Cliente;

  public class ClienteRepositorio implements IClienteRepositorio {
    public ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public void salvarCliente(Cliente name){
      listaClientes.add(name);
    }
    public void atualizarCliente(Cliente cliente, int index){
      listaClientes.add(index,cliente);
    }
    public void deletarCliente(Cliente cliente){
      listaClientes.remove(cliente);
    }
    public ArrayList<Cliente> listarCliente(){
      return listaClientes;
    }
}
