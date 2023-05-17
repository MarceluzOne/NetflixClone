package Servico;
import java.util.ArrayList;
import edu.entidades.Assinatura;
import edu.repositorio.AssinaturaRepositorio;
import java.util.Scanner;

public class AssinaturaServico {
    private static AssinaturaRepositorio ar = new AssinaturaRepositorio();

    public static void planoPagamento(){

        System.out.println("Escolha qual o melhor plano para você e sua família:\n[BASICO] - Plano Básico com anúncio no valor de R$ 25,90(Somente uma tela permitida)\n[PADRAO] - Plano Padrão - R$ 39,90(Assista em até 2 aparelhos ao mesmo tempo!)\n[PREMIUM] - Plano Premium no valor de R$55,90(Assista em até 4 aparelhos ao mesmo tempo!)\n");
        Scanner entrada = new Scanner(System.in);

		String formaPagamento ;
		String plano ;
        boolean opcao = false;
        plano = entrada.nextLine().toUpperCase();

		switch (plano) {
            case "BASICO":
            System.out.println("Plano Básico escolhido\n");
            break;
            
			case "PADRAO": 
            System.out.println("Plano Padrão escolhido\n");
            break;
            
			case "PREMIUM":
            System.out.println("Plano Premium escolhido\n");
            break;
            
			default:
            System.out.println("OPÇÃO INVÁLIDA!\n");
            
		}
        System.out.println("Escolha a forma de pagameto :\nCREDITO\nDEBITO\nPIX\nBOLETO \n");
		formaPagamento = entrada.nextLine().toUpperCase();
        
        
		switch (formaPagamento) {
			case "CREDITO":
				System.out.println("CRÉDITO ESCOLHIDO\n");
				break;

			case "DEBITO": 
				System.out.println("DÉBITO ESCOLHIDO\n");
				break;
                
                case "PIX":
				System.out.println("PIX ESCOLHIDO\n");
				break;
                
                case "BOLETO":
				System.out.println("BOLETO ESCOLHIDO\n");
				break;

			default:
            System.out.println("OPÇÃO INVÁLIDA!\n");
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

