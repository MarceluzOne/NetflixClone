package edu.entidades;

import edu.entidades.TipoDePagamentoEnum;
import java.util.Scanner;

//CLASSE
public class Assinatura {
	private String formaPagamento;
	private String plano;

	// CONSTRUCTOR
	public Assinatura(String formaPagamento) {
		this.formaPagamento = formaPagamento;
		this.plano = plano;
	}

	public String getformaPagamento() {
		return formaPagamento;
	}

	public void setformaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getplano() {
		return plano;
	}

	public void setplano(String plano) {
		this.plano = plano;
	}

	public static void escolhePagamento() {
		Scanner entrada = new Scanner(System.in);

		String formaPagamento;

		System.out.println("Escolha a forma de pagameto  ");
		formaPagamento = entrada.next().toUpperCase();

		Assinatura p1 = new Assinatura(formaPagamento);

		switch (formaPagamento) {
			case "CREDITO":
				System.out.println("Credito escolhido");
				break;

			case "DEBITO":
				System.out.println("Debito escolhido");
				break;

			case "PIX":
				System.out.println("PIX ESCOLHIDO");
				break;

			case "BOLETO":
				System.out.println("BOLETO ESCOLHIDO");
				break;

		}

		if (formaPagamento == "CREDITO" && formaPagamento == "BOLETO" && formaPagamento == "PIX" && formaPagamento == "DEBITO"){
			System.out.println("Escolha qual o melhor plano para você e sua família:\n[1] - Plano Básico com anúncio no valor de R$ 25,90(Somente uma tela permitida)\n[2] - Plano Padrão - R$ 39,90(Assista em até 2 aparelhos ao mesmo tempo!)\n[3] - Plano Premium no valor de R$55,90(Assista em até 4 aparelhos ao mesmo tempo!)\n[0] - Voltar");
		}
		else{
			System.out.println("opção invalida");
		}
	}

	// public static void plano() {
	// 	if ()
	// }

	public static void main(String[] args) {
		Assinatura.escolhePagamento();

	}
}

/*
 * public static void plano(){
 * Scanner input = new Scanner(System.in);
 * int escolha;
 * boolean opcao = false;
 * 
 * do{
 * 
 * System.out.println("----- Faça sua assinatura! -----");
 * System.out.
 * println("Escolha qual o melhor plano para você e sua família:\n[1] - Plano Básico com anúncio no valor de R$ 25,90(Somente uma tela permitida)\n[2] - Plano Padrão - R$ 39,90(Assista em até 2 aparelhos ao mesmo tempo!)\n[3] - Plano Premium no valor de R$55,90(Assista em até 4 aparelhos ao mesmo tempo!)\n[0] - Voltar"
 * );
 * escolha = input.nextInt();
 * switch (escolha) {
 * case 1:
 * System.out.println("-----Plano Básico com anúncio selecionado-----");
 * Pagamento.Pagar();
 * opcao = true;
 * break;
 * case 2:
 * System.out.println("-----Plano Padrão selecionado-----");
 * Pagamento.Pagar();
 * opcao = true;
 * break;
 * case 3:
 * System.out.println("-----Plano Premium selecionado-----");
 * Pagamento.Pagar();
 * opcao = true;
 * break;
 * case 0:
 * System.out.println("\n---------------------------------------------------\n")
 * ;
 * break;
 * default:
 * System.out.println("OPÇÃO INVÁLIDA!\n");
 * break;
 * }
 * } while(opcao != true);
 * }
 */
