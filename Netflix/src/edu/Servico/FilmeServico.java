package edu.Servico;
//import Exceptions.AnodelancamentoInvalidoException;
import edu.Repositorio.FilmesRepositorio;

import java.util.ArrayList;

import edu.Exceptions.AnoLancamentoExceptions;
import edu.Exceptions.ModificarFilmeExceptions;
import edu.entidades.Filme;
//import Exception.AnodelancamentoInvalidoException;

public class FilmeServico {
    
    FilmesRepositorio filmesrepositorio = new FilmesRepositorio();

    public void cadastrar(Filme filme){
        try{
        if(filme.anoLancamento() > 1800 && filme.anoLancamento() < 2023) {
            throw new AnoLancamentoExceptions();
        } else {
            filmesrepositorio.salvarFilme(filme);
        }
        } catch (AnoLancamentoExceptions e){
            e.getMessage();
        }
    }

    public void modificarFilme(Filme filme){
        try{
        if(filme.getGenero().isBlank() &&
            filme.getNome().isEmpty()){
            throw new ModificarFilmeExceptions();
            } else {
                filmesrepositorio.modificarFilme(filme);
            }
            } catch (ModificarFilmeExceptions e){
                e.getMessage();
            }
    }

    public void deletarFilme(Filme filme){
        try{
            if(filme.getGenero().isBlank() &&
                filme.getNome().isEmpty()){
                throw new ModificarFilmeExceptions();
                } else {
                    filmesrepositorio.deletarFilme(filme);;
                }
                } catch (ModificarFilmeExceptions e){
                    e.getMessage();
                }
    }


    public ArrayList<Filme> listarFilme(){
        return filmesrepositorio.listarFilme();
    }
}
    

