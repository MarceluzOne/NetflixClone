package edu.filmes;
import java.util.Scanner;

class Filmes {
    
    private String nome;
    private int anoLancamento; 
    private String genero;
    private int classificacaoIndicativa;

    public Filmes(
        String nome,
        int anoLancamento,
        String genero,
        int classificacaoIndicativa){
            this.nome = nome;
            this.anoLancamento = anoLancamento;
            this.genero = genero;
            this.classificacaoIndicativa = classificacaoIndicativa;
        }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome; 
    }
    public int anoLancamento(){
        return anoLancamento;
    }
    public void anoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero; 
    }

    public int getClassificacaoIndicativa(){
        return classificacaoIndicativa;
    }
    public void setClassificacaoIndicativa(int classificacaoIndicativa){
        this.classificacaoIndicativa = classificacaoIndicativa; 
    }

    public static void  cadastro(){
        Scanner text = new Scanner(System.in);
        System.out.println("Informe o nome do filme: ");
        String nome = text.nextLine();
        System.out.println("Informe o ano de lançamento: ");
        String anoLancamento = text.nextLine();
        System.out.println("Informe o genero: ");
        String genero = text.nextLine();
        System.out.println("Informe a classificação indicativa: ");
        String classificacaoIndicativa = text.nextLine();
        
        Filmes filme1 = new Filmes(nome,anoLancamento,genero,classificacaoIndicativa);

    }
    public static void main(String[] args){
        cadastro();

    }
}
