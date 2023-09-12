package edu.Servico;

import edu.Repositorio.AssinaturaRepositorio;
import java.util.Scanner;



public class AssinaturaServico {

private static AssinaturaRepositorio ar = new AssinaturaRepositorio();

public static void numerosCartao() {

String dados;
Scanner entrada = new Scanner(System.in);
    dados = entrada.nextLine().toUpperCase();
    if (dados.length() >= 16){
    throw new RuntimeException("Cartão cadastrado");
}
else if ( dados.length() < 16){
    throw new RuntimeException("Os números do seu cartão precisa ter mais de 16 dígitos.\n");
}
}
}








