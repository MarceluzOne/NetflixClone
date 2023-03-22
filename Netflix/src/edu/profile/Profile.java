package edu.profile;
import java.util.Scanner;

public class Profile {
  private String name;
  private int age;
  private String cpf;
  private String email;
  private String phone;

  public Profile(
    String name,
    int age,
    String cpf,
    String email,
    String phone){
      this.name = name;
      this.age = age;
      this.cpf = cpf;
      this.email = email;
      this.phone = phone;
  }

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return age;
  }
  public void setAge(int age){
  this.age = age;
  }

  public String getCPF(){
    return cpf;
  }
  public void setCPF(String cpf){
    this.cpf = cpf;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public String getPhone(){
    return phone;
  }
  public void setPhone(String phone){
    this.phone = phone;
  }

  public String toString()
	{
		return ("O Nome é: " + this.name + "\nA Idade é: " + this.age + "\nO CPF é:  " + this.cpf + "\nO E-mail é: " + this.email + "\nO telefone é: " + this.phone);
	}
  public static void cadastro(){
    Scanner text = new Scanner(System.in);
    System.out.println("== INICIANDO CADASTRO ==");
    System.out.println("Informe o CPF");
    String cpf = text.nextLine();
    if (cpf.length()!=11){
      System.out.println("Informe um CPF de 11 digitos");
      cpf =text.nextLine();
    }
    System.out.println("Informe seu Nome completo");
    String name = text.nextLine();
    System.out.println("Informe seu E-mail");
    String email =text.nextLine();
    System.out.println("Informe um numero para contato");
    String phone = text.nextLine();
    if(phone.length()!= 12){
      System.out.println("Informe um o telefone com DDD9xxxx-xxxx sem hifen");
      phone =text.nextLine();
    }
    System.out.println("informe sua idade");
    int age = text.nextInt();
    if (age<18){
      System.out.println("Usuário menor de idade");
    }
    Profile pessoa = new Profile(name,age,cpf,email,phone);
    System.out.println(pessoa);
  }
  
  public static void main(String[] args) {
  }
}
