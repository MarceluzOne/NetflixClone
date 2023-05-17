package edu.entidades;

public class Administrador extends Pessoa {
  int matricula = 0;

  public Administrador(String name, String cpf) {
    super(name, cpf);
    this.matricula++;
  }

  public int getMatricula() {
    return matricula;
  }
  public void setMatricula(int matricula){
    this.matricula = matricula;
  }
}
