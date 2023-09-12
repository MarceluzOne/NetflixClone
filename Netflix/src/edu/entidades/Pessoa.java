package edu.entidades;

public abstract class Pessoa {
  private String name;
  private int age;
  private String cpf;
  private String email;
  private String phone;
  
  public Pessoa(String name, String cpf){
    this.name = name;
    this.cpf = cpf;
  }


  //METODOS GET E SET DA CLASSE
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

  //METODO DE ALTERAÇÃO DO OBJETO PARA STRING
  public String toString()
	{
		return ("O Nome  informado foi: " + this.name + "\nA Idade informada foi: " + this.age + "\nO CPF informado foi:  " + this.cpf + "\nO E-mail informado foi: " + this.email + "\nO telefone informado foi: " + this.phone);
	}

    
  public void somarInteiros(int num1, int num2){
    int resultado = num1 + num2;
    System.out.println(resultado);
  }
}
