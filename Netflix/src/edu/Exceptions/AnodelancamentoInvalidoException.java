package edu.Exceptions;

public class AnodelancamentoInvalidoException extends Exception {
    
    public String getMessage(){
        return "O ano de lançamento é inválido!";
    }
}
