package edu.entidades;

//CRIAÇÃO DA CLASSE
public class Filme{
    
  private String nome;
  private int anoLancamento;  
  private String genero;
  private String classificacaoIndicativa;
  //CRIAÇÃO DO CONSTRUCTOR
  public Filme(
    String nome,
    int anoLancamento)
    {this.nome = nome;
      this.anoLancamento = anoLancamento;
  }
  //METODOS GET E SET
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome; 
  }
  public int anoLancamento(){
    return anoLancamento;
  }
  public void anoLancamento(int anoLancamento){
    this.anoLancamento = anoLancamento;
  }
  public String getGenero(){
    return genero;
  }
  public void setGenero(String genero){
    this.genero = genero; 
  }

  public String getClassificacaoIndicativa(){
    return classificacaoIndicativa;
  }
  public void setClassificacaoIndicativa(String classificacaoIndicativa){
    this.classificacaoIndicativa = classificacaoIndicativa; 
  }
  //METODO DE ALTERAÇÃO DO OBJETO PARA STRING
  public String toString(){
		return ("O filme cadastrado foi: " + this.nome + "\nO genero informado foi " + this.genero + "\nA classificação do filme é: " + this.classificacaoIndicativa + "\nO ano de lançamento foi: " + this.anoLancamento);
	}
    
}

