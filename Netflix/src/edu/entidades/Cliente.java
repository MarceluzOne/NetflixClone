package edu.entidades;

import java.util.Date;

public class Cliente extends Pessoa{
  Date dataDeCadastro;
  String tipoDeCliente;

  public Cliente(String name, String cpf,Date dataDeCadastro){
    super(name, cpf);
    this.dataDeCadastro = dataDeCadastro;
  }
  public Date getDataDeCadastro() {
    return dataDeCadastro;
  }
  public void setDataDeCadastro(Date dataDeCadastro) {
    this.dataDeCadastro = dataDeCadastro;
  }
  public String getTipoDeCliente() {
    return tipoDeCliente;
  }
  public void setTipoDeCliente(String tipoDeCliente) {
    this.tipoDeCliente = tipoDeCliente;
  }
}
