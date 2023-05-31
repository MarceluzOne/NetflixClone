package edu.Repositorio;

import java.util.ArrayList;

import edu.entidades.Filme;

public interface IFilmesRepositorio {

    public void salvarFilme();
    public void modificarFilme();
    public void deletarFilme();
    public ArrayList<Filme> listarFilme();

}