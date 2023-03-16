package edu.suporte;
import java.util.Scanner;


public class suporte {
  String SolicitarTitulo;
  String TermosDeUso;
  String dicas;
  String sobreNetflix;
  String SAC;

public suporte(
  String SolicitarTitulo,
  String TermosDeUso,
  String dicas,
  String sobreNetflix,
  String SAC) {
    this.SolicitarTitulo = SolicitarTitulo;
    this.TermosDeUso = TermosDeUso;
    this.dicas = dicas;
    this.sobreNetflix= sobreNetflix;
    this.SAC = SAC;
  }
/* 
public static void escolha(){

  Scanner text = new Scanner(System.in);
  
  System.out.println("Qual opção gostaria de acessar?");
  System.out.println("[1]Solicitar Título\n[2]Termos de Uso\n[3]Dicas Netflix\n[4]Sobre a Netflix\n[5]SAC");
  
    System.out.println("Qual título deseja solicitar? ");
    String option = text.nextLine();

  if (option == "1"){
    System.out.println("Título escolhido: " + titulo);
    suporte titulo = new suporte(SolicitarTitulo);
    System.out.println(titulo);
  }
}*/
}