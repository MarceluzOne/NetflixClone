import java.util.Scanner;
import edu.profile.Profile;
import edu.suporte.Suporte;


class Main{

  


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
        break;
        default :
          System.out.println("Opção inválida!");
      }
  }
    while (option != 6);
    
    //guardando as info
    //Suporte SUPORTE = new suporte(SolicitarTitulo,TermosDeUso,dicas,sobreNetflix,SAC);
  
    //System.out.println(SUPORTE);
}
  //testando
  /*public String toString(){
      return("Titulo: " + this.SolicitarTitulo);}*/


  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    int escolha;
    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Criar um Usuário");
      System.out.println("2 - Acessar o Suporte");
      System.out.println("3 - Cadastro de Filme");
      System.out.println("4 - Opção 4");
      System.out.println("5 - Opção 5");
      System.out.println("0 - Sair");

      escolha = input.nextInt();

      switch(escolha) {
        case 1:
          System.out.println("Criando um novo Usuario");
          Profile.cadastro();
          break;
        case 2:
          System.out.println("Iniciando o Suporte");
          Suporte.suporte();
          break;
        case 3:
            System.out.println("Iniciando Cadastro de Filme");
            break;
        case 4:
            System.out.println("Opção 4 selecionada.");
            break;
        case 0:
            System.out.println("Encerrando a plataforma");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
      }
  } while(escolha != 0);
  }

}