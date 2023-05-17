package edu.entidades;

//CLASSE
public class Assinatura  {
	private String plano;
    private String formaPagamento;
	private String dados;

	public Assinatura(String plano, String formaPagamento) {
        this.plano = plano;
        this.formaPagamento = formaPagamento;
		this.dados = dados;
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

	public String getformaPagamento() {
		return formaPagamento;
	}

	public void setplano(String plano) {
		this.plano = plano;
	public void cadastroAssinaturaCredito(){
		Scanner input = new Scanner(System.in);
		System.out.println("Insira dos dados do cartão a ser cadastrado: ");
		String cartao =input.nextLine();
		System.out.println("Informe a melhor data de Pagamento");
		String dataPagamento = input.nextLine();
		System.out.println("O cartão inserido foi: " + cartao + "\nA melhor data de pagamento escolhida foi: " + dataPagamento);
	}

	public String getformaPagamento() {
		return formaPagamento;
	}

	public void setformaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getdados() {
		return dados;
	}

	public void setdados(String dados) {
		this.dados = dados;
	}
}
