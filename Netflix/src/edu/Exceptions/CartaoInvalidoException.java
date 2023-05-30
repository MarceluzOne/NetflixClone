package edu.Exceptions;

import edu.Servico.AssinaturaServico;
import edu.entidades.Assinatura;

public class CartaoInvalidoException extends Exception{
    
public String mensagemErro(){
    return "Os números do seu cartão precisa ter mais de 16 dígitos.\n";
    }
}

