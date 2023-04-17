package edu.repositorio;
import java.util.ArrayList;
import edu.entidades.Cliente;

public class ClienteRepositorio {
  public ArrayList<Cliente> listaCliente;
  public int idCliente = 0;

  public ClienteRepositorio(ArrayList<Cliente> listaCliente){
    this.listaCliente = listaCliente;
  }
  public void cadastrar(Cliente cliente){
    listaCliente.add(cliente);
  }
  public ArrayList<Cliente> listarPorNome(String nome){
    ArrayList<Cliente> listadeCliente = new ArrayList<Cliente>();
    for(Cliente cliente :listadeCliente){
      if(cliente.getName().equals(nome))
      listaCliente.add(cliente);
    }
    return listadeCliente;
  }
  public void atualizar(Cliente cliente, int index){
    listaCliente.add(index,cliente);
  }
  public void  deletar(Cliente cliente) {
		listaCliente.remove(cliente);
	}





}
