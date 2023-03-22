package edu.suporte;
import java.util.Scanner;


class SolicitarGenero extends Suporte{
    protected String genero;

   protected SolicitarGenero(String genero){
        super();
        this.genero = genero;
    }
    public String  getgenero(){
        return genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }
//metodo
public static void Genero(){
    Scanner text = new Scanner(System.in);

    System.out.println("\nQual o gênero do novo filme que você deseja solicitar?");
    
    //SolicitarGenero genero1 = new SolicitarGenero();
   // genero1.setgenero(genero = text.nextLine());

   
} 
public SolicitarGenero(){
}

    public static void main(String []args){
        Genero();
    }
}
