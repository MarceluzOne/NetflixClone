import java.util.Scanner;

//CLASSE
public class Assinatura{
	protected Pagamento cartao;
	protected Pagamento pix;
	protected Pagamento data;
	protected String plano;

	//CONSTRUCTOR
	public Assinatura(
		String plano){
			this.plano = plano;
	}
	public String getPlano(){
    return plano;
  }
  public void setPlano(String plano){
    this.plano = plano;
  }

	public static void plano(){
			Scanner input = new Scanner(System.in);	
			int escolha;
			boolean opcao = false;
			
		do{
			
				System.out.println("----- Faça sua assinatura! -----");
				System.out.println("Escolha qual o melhor plano para você e sua família:\n[1] - Plano Básico com anúncio no valor de R$ 25,90(Somente uma tela permitida)\n[2] - Plano Padrão - R$ 39,90(Assista em até 2 aparelhos ao mesmo tempo!)\n[3] - Plano Premium no valor de R$55,90(Assista em até 4 aparelhos ao mesmo tempo!)\n[0] - Voltar");
				escolha = input.nextInt();
				switch (escolha) {
					case 1:
						System.out.println("-----Plano Básico com anúncio selecionado-----");					
						Pagamento.Pagar();
							opcao = true;
						break;
					case 2:
						System.out.println("-----Plano Padrão selecionado-----");
						Pagamento.Pagar();
						opcao = true;
						break;
					case 3:
						System.out.println("-----Plano Premium selecionado-----");
						Pagamento.Pagar();
						opcao = true;
						break;
					case 0:
						System.out.println("\n---------------------------------------------------\n");
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!\n");
						break;
				}
			} while(opcao != true);
	}


}