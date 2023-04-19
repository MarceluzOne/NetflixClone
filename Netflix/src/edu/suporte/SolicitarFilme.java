package edu.suporte;
import java.util.Scanner;


class SolicitarFilme extends SolicitarGenero {
    protected String filme;

    protected SolicitarFilme(String filme){
      super();
      this.filme = filme;
    }
    public String getfilme(){
      return filme;
    }
    public void setfilme(String filme){
      this.filme = filme;
    }
  //METODO DE SOLICITAÇÃO DE FILME
  public static void Filme(){
    Scanner text = new Scanner(System.in);

    System.out.println("Qual é o nome do filme que você deseja solicitar? ");
}

      public SolicitarFilme(){
      }

    public static void main(String []args){
        Filme();
    }
}
