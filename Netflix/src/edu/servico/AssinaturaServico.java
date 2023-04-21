package edu.servico;
import java.util.ArrayList;
import edu.entidades.Assinatura;
import edu.repositorio.AssinaturaRepositorio;
import java.util.Scanner;

public class AssinaturaServico {
    private static AssinaturaRepositorio ar = new AssinaturaRepositorio();

    public static void planoPagamento(){

        System.out.println("Escolha qual o melhor plano para você e sua família:\n[1] - Plano Básico com anúncio no valor de R$ 25,90(Somente uma tela permitida)\n[2] - Plano Padrão - R$ 39,90(Assista em até 2 aparelhos ao mesmo tempo!)\n[3] - Plano Premium no valor de R$55,90(Assista em até 4 aparelhos ao mesmo tempo!)\n");
        Scanner entrada = new Scanner(System.in);

		String formaPagamento ;
		String plano ;
        boolean opcao = false;
        plano = entrada.nextLine().toUpperCase();

		switch (plano) {
            case "BASICO":
            System.out.println("Plano Básico escolhido");
            break;
            
			case "PADRAO": 
            System.out.println("Plano Padrão escolhido");
            break;
            
			case "PREMIUM":
            System.out.println("Plano Premium ESCOLHIDO");
            break;
            
			default:
            System.out.println("OPÇÃO INVÁLIDA!");
            
		}
        System.out.println("Escolha a forma de pagameto :\n[1] - CRÉDITO\n[2] - DÉBITO\n[3] - PIX\n[4] -  BOLETO ");
		formaPagamento = entrada.nextLine().toUpperCase();
        
        
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

			default:
            System.out.println("OPÇÃO INVÁLIDA!");
		}

        Assinatura pf = new Assinatura(plano, formaPagamento);
        ar.salvarAssinatura(pf);
	}
    
    public static void listarAssinaturas(){
        ArrayList<Assinatura> lista = new ArrayList<Assinatura>();

        lista = ar.listarAssinatura();

        for (Assinatura assinatura: lista){
            System.out.println("PLANO É : " + assinatura.getplano());
            System.out.println("FORMA DE PAGAMENTO É: " + assinatura.getformaPagamento());
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void main(String[]args) {
        planoPagamento();
        listarAssinaturas();
        
        
    }
}

