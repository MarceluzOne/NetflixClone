import java.util.Scanner;

//CLASSE
class Assinatura{
	private String tipoPagamento;
	private String dataPagamento;
	private String plano;

	//CONSTRUCTOR
	public Assinatura(
		String pagamento,
		String dataPagamento,
		String plano){
			this.tipoPagamento = pagamento;
			this.dataPagamento = dataPagamento;
			this.plano = plano;
	}

	public String getDataPagamento(){
    return dataPagamento;
  }
  public void setDataPagamento(String dataPagamento){
    this.dataPagamento = dataPagamento;
  }
	public String getPlano(){
    return plano;
  }
  public void setPlano(String plano){
    this.plano = plano;
  }

	public static void plano(){
		Scanner input = new Scanner(System.in);
		boolean option;
		System.out.println("Escolha um Menu");
		int escolha = input.nextInt();

		if (escolha ==1){
			option = true;
		}if (escolha ==2){
			option = true;
		}if (escolha ==3){
			option = true;
		}else{option = false;}

		do{
			System.out.println("Escolha qual o melhor plano para você e sua familia\n 1 - Plano Básico com anúncio no valor de R$ 25,90\n 2 - Plano Padrão - R$ 39,90\n 3 - Plano Premium no valor de R$55,90");
			System.out.println("Escolha um menu");
			escolha = input.nextInt();

			switch (escolha) {
				case 1:
					System.out.println("Plano Básico com anuncio selecionado");
					option = true;
					break;
					case 2:
					System.out.println("Plano Padrão selecionado");
					option = true;
					break;
					case 3:
					System.out.println("Plano Premium selecionado");
					option = true;
					break;
				default:
					break;
			}
		}while(option != true );
	}

	public void cadastroAssinaturaCredito(){
		Scanner input = new Scanner(System.in);
		System.out.println("Qual os dados do cartão a serem cadastrado");
		String cartao =input.nextLine();
		System.out.println("Informe a melhor data de Pagamento");
		String dataPagamento = input.nextLine();
		System.out.println("O cartão inserido foi: " + cartao + "\nA melhor data de pagamento escolhida foi: " + dataPagamento);
	}

	public void cadastroAssinaturaPix(){
		Scanner input = new Scanner(System.in);
		String pix = "11558535256684";
		System.out.println("Nos informe qual a melhor data de Pagamento");
		String dataPagamento = input.nextLine();
		System.out.println("Chave pix Aleatoria é: " + pix + "\nA melhor data de pagamento escolhida foi: " + dataPagamento);
	}

	public static void main(String[] args) {
		plano();
		
	}
}