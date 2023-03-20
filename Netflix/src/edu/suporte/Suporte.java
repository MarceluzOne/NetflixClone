package edu.suporte;
import java.util.Scanner;


//classe
public class Suporte {
  private String SolicitarTitulo;
  private String TermosDeUso;
  private String dicas;
  private String sobreNetflix;
  private String SAC;

//construtor
  private Suporte(
    String SolicitarTitulo,
    String TermosDeUso,
    String dicas,
    String sobreNetflix,
    String SAC){
      this.SolicitarTitulo = SolicitarTitulo;
      this.TermosDeUso = TermosDeUso;
      this.dicas = dicas;
      this.sobreNetflix = sobreNetflix;
      this.SAC = SAC;
  }

  public String getSolicitarTitulo(){
    return SolicitarTitulo;
  }
  public void setSolicitarTitulo(String SolicitarTitulo){
      this.SolicitarTitulo = SolicitarTitulo;
    }
    public String getTermosDeUso(){
      return TermosDeUso;
    }
    public void setTermosDeUso(String TermosDeUso){
      this.TermosDeUso = TermosDeUso;
    }
  public String getdicas(){
    return dicas;
  }
  public void setdicas(String dicas){
      this.dicas = dicas;
  }
  public String getsobreNetflix(){
    return sobreNetflix;
  }
  public void setsobreNetflix(String sobreNetflix){
      this.sobreNetflix = sobreNetflix;
  }
  public String getSAC(){
    return SAC;
  }
  public void setSAC(String SAC){
    this.SAC = SAC;
  }
  public void Titulo(String titulo) {
    this.SolicitarTitulo = titulo;
  }
  //método
  public static void suporte(){
    Scanner text = new Scanner(System.in);

    String SolicitarTitulo = " ";
    String TermosDeUso = ("\nTERMOS DE USO: A Netflix fornece um serviço personalizado de assinatura\nque permite aos nossos assinantes acessar conteúdo de entretenimento. \n");
    String dicas = ("\nDICAS NETFLIX: Quando a Netflix não estiver funcionando, é possível resolver a maioria dos problemas com as instruções abaixo.\n- Desligue o aparelho e religue-o\n- Limpe os dados do aplicativo Netflix\n- Reinstale o aplicativo Netflix\n- Teste sua conexão à Internet\n- Reinicie a rede doméstica.\n");
    String sobreNetflix = ("\nSOBRE A NETFLIX: A Netflix é um serviço de streaming que oferece uma ampla variedade de \nséries, filmes e documentários premiados em milhares de aparelhos conectados à internet.\nVocê pode assistir a quantos filmes e séries quiser, quando e onde quiser tudo por um preço mensal acessível.\n");
    String SAC = ("\nSAC: Entre em contato conosco: +55 (xx) x xxxx-xxxx \n");
    
    Scanner scan = new Scanner(System.in);
    int option;

    do{
    
      System.out.println("\n--------------SUPORTE--------------\nBem vindo(a) ao Suporte Netflix!\n[1]Solicitar um novo filme/título\n[2]Termos de Uso\n[3]Dicas Netflix\n[4]Sobre a Netflix\n[5]SAC\n[6]Sair\n");
      System.out.println("\nSUA OPÇÃO: \n");
      option = scan.nextInt();

      switch(option){

        case 1 : 
          
          System.out.println("\nQual novo filme deseja solicitar?");
          SolicitarTitulo = text.nextLine();
          System.out.println("Título selecionado: " + SolicitarTitulo +" --- Obrigada pela sugestão!");
          
          break;
       
        case 2: 
          System.out.println(TermosDeUso);
          break;
        
        case 3: 
          System.out.println(dicas);
          break;
        
        case 4: 
          System.out.println(sobreNetflix);
          break;
        
        case 5: 
          System.out.println(SAC);
          break;

        case 6 :
        System.out.println("----SUPORTE FECHADO----");
        scan.close();
        break;

        default :
          System.out.println("Opção inválida!");
      }
  }
    while (option != 6);
      scan.close();
    
    //guardando as info
    Suporte SUPORTE = new Suporte(SolicitarTitulo,TermosDeUso,dicas,sobreNetflix,SAC);
   
    //System.out.println(SUPORTE);
}
  //testando
   /*public String toString(){
      return("Titulo: " + this.SolicitarTitulo);}*/

public static void main(String []args) {
  suporte();
  }
}
