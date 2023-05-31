package edu.Exceptions;

public class CartaoInvalidoException extends Exception{
    
public String mensagemErro(){
    return "Os números do seu cartão precisa ter mais de 16 dígitos.\n";
    }
}

