package edu.entidades;

import java.util.Date;

public class Cliente extends Pessoa{
  Date dataDeCadastro;
  String tipoDeCliente;
  char tipoDePagamento;

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
  public char getTipoDePagamento() {
    return tipoDePagamento;
  }
  public void setTipoDePagamento(char tipoDePagamento) {
    this.tipoDePagamento = tipoDePagamento;
  }
}
