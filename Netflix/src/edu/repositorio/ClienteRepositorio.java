package edu.repositorio;
import java.util.ArrayList;
import edu.entidades.Cliente;

  public class ClienteRepositorio implements IClienteRepositorio {

    public ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    // public ClienteRepositorio(ArrayList<Cliente> listaClientes){
    //   this.listaClientes = listaClientes;
    // }
    public boolean salvarCliente(Cliente name){
        listaClientes.add(name);
        return true;
    }
    public boolean atualizarCliente(Cliente cliente){
      return true;
    }
    public boolean deletarCliente(Cliente cliente){
      listaClientes.remove(cliente);
      return true;
    }
    public ArrayList<Cliente> listarCliente(String name){
      return listaClientes;
      
    }





}
