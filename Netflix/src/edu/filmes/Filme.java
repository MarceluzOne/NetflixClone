package edu.filmes;
import java.util.Scanner;

public class Filme{
    
    private String nome;
    private int anoLancamento;  
    private String genero;
    private String classificacaoIndicativa;

    public Filme(
        String nome,
        int anoLancamento,
        String genero,
        String classificacaoIndicativa){
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

    public String getClassificacaoIndicativa(){
        return classificacaoIndicativa;
    }
    public void setClassificacaoIndicativa(String classificacaoIndicativa){
        this.classificacaoIndicativa = classificacaoIndicativa; 
    }

    public static void cadastroFilme(){

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do filme a ser cadastrado: ");
        String nome = input.nextLine();
        System.out.println("Informe o genero do filme a ser cadastrado: ");
        String genero = input.nextLine();
        System.out.println("Informe a classificação indicativa do filme a ser cadastrado: ");
        String classificacaoIndicativa = input.nextLine();
        System.out.println("Informe o ano de lançamento do filme a ser cadastrado: ");
        int anoLancamento = input.nextInt();

            Filme novofilme = new Filme(nome, anoLancamento, genero, classificacaoIndicativa);
        
    }   
}
