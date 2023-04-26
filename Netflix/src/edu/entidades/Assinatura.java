package edu.entidades;
import java.util.Scanner;

//CLASSE
public class Assinatura  {
	private String plano;
    private String formaPagamento;

	public Assinatura(String plano, String formaPagamento) {
        this.plano = plano;
        this.formaPagamento = formaPagamento;
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
   
}
