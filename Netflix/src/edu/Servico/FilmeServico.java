package edu.Servico;
import Exceptions.AnodelancamentoInvalidoException;
import edu.entidades.Filme;
import Exception.AnodelancamentoInvalidoException;

public class FilmeServico {
    
    public void cadastrar(Filme filme){

        try{

        if(filme.anoLancamento() < 4){
            throw new AnodelancamentoInvalidoException();
        }

        } catch (AnodelancamentoInvalidoException ex){
            System.out.println("O ano de lançamento está incorreto!");
        }
    }

}
