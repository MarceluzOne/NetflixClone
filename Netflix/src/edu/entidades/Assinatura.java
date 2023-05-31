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


    public String getplano() {
		return plano;
	}

	public void setplano(String plano) {
		this.plano = plano;
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
