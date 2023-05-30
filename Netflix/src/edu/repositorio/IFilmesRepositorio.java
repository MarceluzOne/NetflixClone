package edu.Repositorio;

import java.util.ArrayList;

import edu.entidades.Filme;

public interface IFilmesRepositorio {

    public boolean salvarFilme(Filme filme);
    public boolean modificarFilme(Filme filme);
    public boolean deletarFilme(Filme filme);
    public ArrayList<Filme> listarFilme(String name);

}