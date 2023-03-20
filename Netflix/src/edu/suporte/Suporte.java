package edu.suporte;
import java.util.Scanner;


//classe
public class Suporte {
  String SolicitarTitulo;
  String TermosDeUso;
  String dicas;
  String sobreNetflix;
  String sac;

//construtor
  private Suporte(
    String SolicitarTitulo,
    String TermosDeUso,
    String dicas,
    String sobreNetflix,
    String sac){
      this.SolicitarTitulo = SolicitarTitulo;
      this.TermosDeUso = TermosDeUso;
      this.dicas = dicas;
      this.sobreNetflix = sobreNetflix;
      this.sac = sac;
  }


  public String getSolicitarTitulo(){
    return SolicitarTitulo;
  }
  public void setSolicitarTitulo(String SolicitarTitulo){
      this.SolicitarTitulo = SolicitarTitulo;
  }

//método converte pra string
  public String toString(){
      return ("Título selecionado: " + this.SolicitarTitulo +" --- Obrigada pela sugestão!\n"+ this.TermosDeUso + this.dicas + this.sobreNetflix + this.sac);
  }

  //método
  public static void suporte(){

      Scanner text = new Scanner(System.in);

      System.out.println("Bem vindo(a) ao Suporte Netflix!\nQual novo filme deseja solicitar? ");
      String titulo = text.nextLine();

      String termos = ("\nTERMOS DE USO: A Netflix fornece um serviço personalizado de assinatura\nque permite aos nossos assinantes acessar conteúdo de entretenimento. \n");
      String Dicas = ("\nDICAS NETFLIX: Quando a Netflix não estiver funcionando, é possível resolver a maioria dos problemas com as instruções abaixo.\n- Desligue o aparelho e religue-o\n- Limpe os dados do aplicativo Netflix\n- Reinstale o aplicativo Netflix\n- Teste sua conexão à Internet\n- Reinicie a rede doméstica.\n");
      String sobre = ("\nSOBRE A NETFLIX: A Netflix é um serviço de streaming que oferece uma ampla variedade de \nséries, filmes e documentários premiados em milhares de aparelhos conectados à internet.\nVocê pode assistir a quantos filmes e séries quiser, quando e onde quiser tudo por um preço mensal acessível.\n");
      String Sac = ("\nSAC: Entre em contato conosco: +55 (xx) x xxxx-xxxx \n");
      Suporte SUPORTE = new Suporte(titulo,termos,Dicas,sobre,Sac);
      System.out.println(SUPORTE);

  }
  public static void main(String []args) {
      suporte();
  }
  }
