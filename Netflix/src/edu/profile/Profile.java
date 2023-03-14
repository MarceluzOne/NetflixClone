package edu.profile;
import java.util.Scanner;

public class Profile {
  String name;
  int age;
  String cpf;
  String email;
  String telefone;

  public Profile(
    String name,
    int age,
    String cpf,
    String email,
    String telefone){
      this.name = name;
      this.age = age;
      this.cpf = cpf;
      this.email = email;
      this.telefone = telefone;
  }
  public String toString()
	{
		return (this.name + " " + this.age + " " + this.cpf + " " + this.email + " " + this.telefone);
	}
  public static void cadastro(){
    
    Scanner text = new Scanner(System.in);

    System.out.println("Qual o CPF");
    String cpf = text.nextLine();
    System.out.println("Qual o nome?");
    String name = text.nextLine();
    System.out.println("Qual o email");
    String email =text.nextLine();
    System.out.println("Qual o telefone");
    String telefone = text.nextLine();
    System.out.println("Qual a idade");
    int age = text.nextInt();
    Profile pessoa = new Profile(name,age,cpf,email,telefone);
    System.out.println(pessoa);
  }
  public static void main(String[] args) {
    cadastro();
  }
}
