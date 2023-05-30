package edu.Servico;
import java.util.ArrayList;
import edu.entidades.Assinatura;
import edu.repositorio.AssinaturaRepositorio;
import java.util.Scanner;
import edu.Servico.*;
import javax.management.RuntimeErrorException;
import edu.*;


public class AssinaturaServico {

private static AssinaturaRepositorio ar = new AssinaturaRepositorio();

public static void numerosCartao() {

String dados="";
Scanner entrada = new Scanner(System.in);
    dados = entrada.nextLine().toUpperCase();
    if (dados.length() >= 16){
    throw new RuntimeException("Cartão cadastrado");
}
else if ( dados.length() < 16){
    System.out.println("Os números do seu cartão precisa ter mais de 16 dígitos.\n");
}}


    public static void listarAssinaturas(){
        ArrayList<Assinatura> lista = new ArrayList<Assinatura>();

        lista = ar.listarAssinatura();

        for (Assinatura assinatura: lista){
            System.out.println("PLANO É : " + assinatura.getplano());
            System.out.println("FORMA DE PAGAMENTO É: " + assinatura.getformaPagamento());
            System.out.println("--------------------------------------------------------");
        }
}
}







