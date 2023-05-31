package edu.entidades;

public class Cliente extends Pessoa{
  String dataDeCadastro = "29/05/2023";
  String tipoDeCliente;

  public Cliente(String name, String cpf,String dataDeCadastro){
    super(name, cpf);
    
  }
  public Cliente(String name, String cpf){
    super(name, cpf);
  }
  public String getDataDeCadastro() {
    return dataDeCadastro;
  }
  public void setDataDeCadastro(String dataDeCadastro) {
    this.dataDeCadastro = dataDeCadastro;
  }
  public String getTipoDeCliente() {
    return tipoDeCliente;
  }
  public void setTipoDeCliente(String tipoDeCliente) {
    this.tipoDeCliente = tipoDeCliente;
  }
}
