import java.util.Date;
import java.util.Scanner;

import edu.entidades.Cliente;
import edu.entidades.Filme;
import edu.repositorio.ClienteRepositorio;
import edu.suporte.Suporte;

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

  // public static void main(String[] args) {
      
  //   Scanner input = new Scanner(System.in);
  //   int escolha;
  //   do {
  //     System.out.println("Escolha uma opção:");
  //     System.out.println("1 - Criar um Usuário");
  //     System.out.println("2 - Acessar o Suporte");
  //     System.out.println("3 - Cadastro de Filme");
  //     System.out.println("4 - Opção 4");
  //     System.out.println("5 - Opção 5");
  //     System.out.println("0 - Sair");

  //     escolha = input.nextInt();
  //     //CRIAÇÃO DO MENU PRINCIPAL
  //     switch(escolha) {
  //       case 1:
  //         System.out.println("Criando um novo Usuario");
  //         //Profile.cadastro();
  //         break;
  //       case 2:
  //         System.out.println("Iniciando o Suporte");
  //         Suporte.suporte();
          
  //         break;
  //       case 3:
  //           System.out.println("Iniciando Cadastro de Filme");
  //           Filme.cadastroFilme();
  //           break;
  //       case 4:
  //           System.out.println("Iniciar Pagamento.");
            
  //           break;
  //       case 0:
  //           System.out.println("Encerrando a plataforma");
  //           break;
  //       default:
  //           System.out.println("Opção inválida. Tente novamente.");
  //     }
  // } while(escolha != 0);
  // }

}