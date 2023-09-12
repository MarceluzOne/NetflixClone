package edu.Repositorio;
import java.util.ArrayList;


import edu.entidades.Assinatura;

public class AssinaturaRepositorio implements IAssinatura {

    public ArrayList<Assinatura> listaAssinaturas = new ArrayList<Assinatura>();
    
    public boolean salvarAssinatura(Assinatura assinatura){
        return listaAssinaturas.add(assinatura);
    }

    public boolean atualizarPlano(Assinatura assinatura){
        for (Assinatura assinatura2 : listaAssinaturas){
            if(assinatura2.getplano().equals(assinatura.getplano())){
                assinatura2 = assinatura;
            }
        }
    return false;
    }

    public boolean atualizarFormaPagamento(Assinatura assinatura){
        for (Assinatura assinatura2 : listaAssinaturas){
            if(assinatura2.getformaPagamento().equals(assinatura.getformaPagamento())){
                assinatura2 = assinatura;
            }
        }
        return false;
}

    public boolean atualizarDados(Assinatura assinatura){
        for (Assinatura assinatura2 : listaAssinaturas){
            if(assinatura2.getdados().equals(assinatura.getdados())){
                assinatura2 = assinatura;
            }
        }
        return false;
    }

    public boolean deletarAssinatura(String plano){
        for (Assinatura assinatura : listaAssinaturas){
            if(assinatura.getplano().equals(plano)){
                listaAssinaturas.remove(assinatura);
            }
        }
        return false;
    }

    public ArrayList<Assinatura> listarAssinatura(){
        return this.listaAssinaturas;
    }

}