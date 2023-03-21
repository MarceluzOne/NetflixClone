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
  
  public static void main(String[] args) {
  }
}
