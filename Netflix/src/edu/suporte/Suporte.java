package edu.suporte;
import java.util.Scanner;
import edu.suporte.SolicitarFilme;
import edu.suporte.SolicitarGenero;

//CRIAÇÃO DA CLASSE SUPORTE
public class Suporte {
  protected SolicitarFilme filme;
  protected SolicitarGenero genero;
  private String termosDeUso;
  private String dicas;
  private String sobreNetflix;
  private String sac;

  //CRIAÇÃO DO CONSTRUCTOR
  private Suporte(
    String termosDeUso,
    String dicas,
    String sobreNetflix,
    String sac){
      this.termosDeUso = termosDeUso;
      this.dicas = dicas;
      this.sobreNetflix = sobreNetflix;
      this.sac = sac;
  }

  //METODOS GET E SET DO SUPORTE
  public String getTermosDeUso(){
    return termosDeUso;
  }
  public void setTermosDeUso(String termosDeUso){
    this.termosDeUso = termosDeUso;
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
  public String getsac(){
    return sac;
  }
  public void setsac(String sac){
    this.sac = sac;
  }

  //METODO DA CLASSE SUPORTE
  public static void suporte(){
    Scanner text = new Scanner(System.in);

    String genero = " ";
    String filme = " ";

    String termosDeUso = ("\nTERMOS DE USO: A Netflix fornece um serviço personalizado de assinatura\nque permite aos nossos assinantes acessar conteúdo de entretenimento. \n");
    String dicas = ("\nDICAS NETFLIX: Quando a Netflix não estiver funcionando, é possível resolver a maioria dos problemas com as instruções abaixo.\n- Desligue o aparelho e religue-o\n- Limpe os dados do aplicativo Netflix\n- Reinstale o aplicativo Netflix\n- Teste sua conexão à Internet\n- Reinicie a rede doméstica.\n");
    String sobreNetflix = ("\nSOBRE A NETFLIX: A Netflix é um serviço de streaming que oferece uma ampla variedade de \nséries, filmes e documentários premiados em milhares de aparelhos conectados à internet.\nVocê pode assistir a quantos filmes e séries quiser, quando e onde quiser tudo por um preço mensal acessível.\n");
    String sac = ("\nsac: Entre em contato conosco: +55 (xx) x xxxx-xxxx \n");
  
    Scanner scan = new Scanner(System.in);
    int option;

    do{
      System.out.println("\n--------------SUPORTE--------------\nBem vindo(a) ao Suporte Netflix!\n[1]Solicitar um novo filme/título\n[2]Termos de Uso\n[3]Dicas Netflix\n[4]Sobre a Netflix\n[5]SAC\n[6]Voltar\n");
      System.out.println("\nSUA OPÇÃO: \n");
      option = scan.nextInt();
      //CRIAÇÃO DO MENU
      switch(option){
        case 1 :

        SolicitarGenero.Genero();         
        genero = text.nextLine();
        SolicitarGenero genero1 = new SolicitarGenero(genero);
        SolicitarFilme.Filme();
        filme = text.nextLine();  
        SolicitarFilme filme1 = new SolicitarFilme(filme);

        System.out.println("\nTítulo selecionado: " + filme1.filme + "\nDo gênero: "+ genero1.genero + " \n--- Obrigada pela sugestão!");
          break;
        case 2: 
          System.out.println(termosDeUso);
          break;        
        case 3: 
          System.out.println(dicas);
          break;        
        case 4: 
          System.out.println(sobreNetflix);
          break;        
        case 5: 
          System.out.println(sac);
          break;
        case 6 :
        System.out.println("----SUPORTE ENCERRADO----");
        break;
        default :
          System.out.println("Opção inválida!");
      }
  }
    while (option != 6);
    
    //CRIAÇÃO DO OBJETO
    Suporte SUPORTE = new Suporte(termosDeUso,dicas,sobreNetflix,sac);  
  }
  public Suporte(){
  }

public static void main(String[]args) {
  suporte();
  }
}
