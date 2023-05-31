
package edu.Repositorio;
import java.util.ArrayList;
import edu.entidades.Filme;

public class FilmesRepositorio {
    
    public ArrayList<Filme> listaFilme = new ArrayList<Filme>();


    public boolean salvarFilme(Filme name){
        listaFilme.add(name);
        return true;
    }

    public boolean modificarFilme(Filme filme){
        listaFilme.add(filme);
        return true;
    }

    public boolean deletarFilme(Filme filme){
        listaFilme.remove(filme);
        return true;
    }
    
    public ArrayList<Filme> listarFilme(){
        return listaFilme;
    }
}
