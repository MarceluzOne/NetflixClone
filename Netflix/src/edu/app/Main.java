
import java.util.ArrayList;
import java.util.Scanner;
import edu.profile.Profile;

class Main{
  public static void cadastro(){
    
    Scanner text = new Scanner(System.in);

    System.out.println("Qual o CPF");
    String cpf = text.nextLine();
    System.out.println("Qual o nome?");
    String name = text.nextLine();
    System.out.println("Qual o email");
    String email =text.nextLine();
    System.out.println("Qual o telefone");
    String phone = text.nextLine();
    System.out.println("Qual a idade");
    int age = text.nextInt();
    Profile pessoa = new Profile(name,age,cpf,email,phone);
    System.out.println(pessoa);
  }

  public static int menu(){
    Scanner text = new Scanner(System.in);
    
    int contador;
    
    do{
      System.out.println("Qual menu desejaria acessar");
      contador = text.nextInt();

    }
    while(contador < 0 && contador > 5);
    
    return contador;
    }

  public static void main(String[] args) {
  menu();
    
  }

}