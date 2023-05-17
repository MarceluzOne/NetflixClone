import java.util.Date;
import java.util.Scanner;

import Servico.ClienteServico;
import edu.entidades.Cliente;
import edu.entidades.Filme;
import edu.repositorio.ClienteRepositorio;
import edu.suporte.Suporte;
import edu.suporte.Servico.*;


//CRIAÇÃO DA CLASSE PRINCIPAL DO PROJETO
class Main{


  public static void main(String[] args ){
    Cliente cliente1 =new Cliente("Marcelo", "083.751.884-92",null);
    ClienteRepositorio banco = new ClienteRepositorio();
    boolean salvar; 
    salvar = banco.salvarCliente(cliente1);
    
    if (salvar){
      System.out.println(cliente1.getName() + " Cadastrado com Sucesso");
    }
  
  }