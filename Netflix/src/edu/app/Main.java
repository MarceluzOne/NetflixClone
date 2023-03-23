import java.util.Scanner;
import edu.profile.Profile;
import edu.suporte.Suporte;


class Main{

  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    int escolha;
    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Criar um Usuário");
      System.out.println("2 - Acessar o Suporte");
      System.out.println("3 - Cadastro de Filme");
      System.out.println("4 - Opção 4");
      System.out.println("5 - Opção 5");
      System.out.println("0 - Sair");

      escolha = input.nextInt();

      switch(escolha) {
        case 1:
          System.out.println("Criando um novo Usuario");
          Profile.cadastro();
          break;
        case 2:
          System.out.println("Iniciando o Suporte");
          Suporte.suporte();
          Suporte.suporte();
          break;
        case 3:
            System.out.println("Iniciando Cadastro de Filme");
            break;
        case 4:
            System.out.println("Opção 4 selecionada.");
            break;
        case 0:
            System.out.println("Encerrando a plataforma");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
      }
  } while(escolha != 0);
  }

}