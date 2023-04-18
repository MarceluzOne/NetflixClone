import java.util.Scanner;

public class Pagamento extends Assinatura {

    protected String cartao;
    protected String pix;
    protected String data;
    
    protected Pagamento(String cartao, String data, String pix, String plano) {
        super(plano);
        this.cartao = cartao;
        this.pix = pix;
        this.data = data;
    }
    public String  getcartao(){
        return cartao;
      }
      public void setcartao(String cartao){
        this.cartao = cartao;
      }
    public String  getpix(){
        return pix;
      }
      public void setpix(String pix){
        this.pix = pix;
      }
    public String  getdata(){
        return data;
      }
      public void setdata(String data){
        this.data = data;
      }
    //METODO
  public static void Pagar(){
      Scanner input = new Scanner(System.in);
      Scanner text = new Scanner(System.in);
      String pix = "f2db957c-f4a8-4fd0-ba6f-15967a8b5ae0";
      int data;
      int pag;
      String cartao;

      do{
        System.out.println("Qual a forma de pagamento?\n[1]Cartão de crédito\n[2]PIX");

		pag = input.nextInt();

		switch(pag){
			case 1:
        System.out.println("\nQual o numero do cartão do titular a ser cadastrado: ");
        cartao = text.nextLine();
          if (cartao.length() != 16 ){
            System.out.println("Informe um número de cartão com 16 dígitos: ");
          cartao = text.nextLine();
          }
        System.out.println("\nInforme o melhor dia de Pagamento: ");
        data = input.nextInt();
          if (data > 31 || data <= 0){
            System.out.println("Informe um dia válido , de 1 até 31: ");
            data = input.nextInt();
          }
        System.out.println("O cartão inserido foi: " + cartao + "\nO melhor dia de pagamento escolhido foi: " + data+"\n");
      break;

			case 2:
        System.out.println("Nos informe qual o melhor dia de Pagamento");
        data = input.nextInt();
          if (data > 31 || data < 0){
              System.out.println("Informe um dia válido , de 1 até 31: ");
              data = input.nextInt();
            }
        System.out.println("Chave pix Aleatoria é: " + pix + "\nO melhor dia de pagamento escolhido foi: " + data +"\n");
      break;

			default:
				System.out.println("OPÇÃO INVÁLIDA!\n");
    }
      } while(pag != 1 && pag != 2);
  }
}
