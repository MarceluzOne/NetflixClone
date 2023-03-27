import java.util.Scanner;
import edu.profile.Profile;
import edu.suporte.Suporte;
import edu.filmes.Filme;
import edu.assinatura.Assinatura;

//CRIAÇÃO DA CLASSE PRINCIPAL DO PROJETO
class Main{

  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    int escolha;
    do {
      System.out.println("------MENU PRINCIPAL------");
      System.out.println("1 - Criar um Usuário");
      System.out.println("2 - Acessar o Suporte");
      System.out.println("3 - Cadastro de Filme");
      System.out.println("4 - Fazer uma assinatura");
      System.out.println("0 - Sair");

      escolha = input.nextInt();
      //CRIAÇÃO DO MENU PRINCIPAL
      switch(escolha) {
        case 1:
          System.out.println("\nCriando um novo Usuario\n");
          Profile.cadastro();
          break;
        case 2:
          System.out.println("\nIniciando o Suporte\n");
          Suporte.suporte();
          
          break;
        case 3:
            System.out.println("\nIniciando Cadastro de Filme\n");
            Filme.cadastroFilme();
            break;
        case 4:
            System.out.println("\nIniciando Assinatura\n");
            Assinatura.plano();
            break;
        case 0:
            System.out.println("-----Encerrando a plataforma-----");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
      }
  } while(escolha != 0);
  }

}