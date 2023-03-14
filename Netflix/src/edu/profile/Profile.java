package edu.profile;
import java.util.Scanner;

public class Profile {
  String name;
  int age;
  String cpf;
  String adress;
  String gender;

  public Profile(
    String name,
    int age,
    String cpf,
    String adress,
    String gender){
      this.name = name;
      this.age = age;
  }

  public static void main(String[] args) {
    Scanner text = new Scanner(System.in);

    System.out.println("Qual o nome?");
    String name = text.nextLine();
    System.out.println("Qual a idade");
    int age = text.nextInt();
    System.out.println("Qual o CPF");
    String cpf = text.nextLine();
    System.out.println("Qual o Endereço");
    String adress =text.nextLine();
    System.out.println("Qual o genero");
    String gender = text.nextLine();

    Profile pessoa = new Profile(name,age,cpf,adress,gender);
    
    System.out.println();







  }
}
