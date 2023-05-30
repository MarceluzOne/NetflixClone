import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import edu.Exceptions.NomeErroException;
import edu.Repositorio.AdministradorRepositorio;
import edu.Repositorio.ClienteRepositorio;
import edu.Servico.ClienteServico;
import edu.entidades.Administrador;
import edu.entidades.Cliente;
import edu.entidades.Filme;
import edu.suporte.Suporte;
import edu.Servico.AdministradorServico;


//CRIAÇÃO DA CLASSE PRINCIPAL DO PROJETO
class Main{


  public static void main(String[] args ) throws NomeErroException{
    
    AdministradorServico admservicos = new AdministradorServico();

    AdministradorRepositorio admrepo = new AdministradorRepositorio();

    Administrador administrador1 = new Administrador("Marcelo Arruda", "083.751.884-92");
    Administrador administrador2 = new Administrador("Thially", "083.751.884-92");
    Administrador administrador3 = new Administrador("Larissa", "083.751.884-92");
    Cliente cliente = new Cliente("Marcelo Junior", null);

    admservicos.cadastrarAdministrador(administrador1);
    admservicos.cadastrarAdministrador(administrador2);
    admservicos.cadastrarAdministrador(administrador3);

    System.out.println(administrador1);
    System.out.println(administrador2);
    System.out.println(administrador3);

    System.out.println(admrepo.listarAdministrador());

   
  

    

    
    }
  
  }
