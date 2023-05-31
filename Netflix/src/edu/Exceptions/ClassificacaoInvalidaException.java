package edu.Exceptions;

public class ClassificacaoInvalidaException extends Exception{
    
    public String getMessage(){
    return "Classificação indicativa incorreta!";
    }
}