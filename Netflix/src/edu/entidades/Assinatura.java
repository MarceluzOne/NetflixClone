package edu.entidades;
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

}