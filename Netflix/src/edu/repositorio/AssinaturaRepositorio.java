package edu.Repositorio;
import java.util.ArrayList;
import edu.entidades.Assinatura;


public class AssinaturaRepositorio implements IAssinatura {

    public ArrayList<Assinatura> listaAssinaturas = new ArrayList<Assinatura>();
    
    public boolean salvarAssinatura(Assinatura assinatura){
        try{
        listaAssinaturas.add(assinatura);
        } catch(Exception e){
        return false;
        }

        return true;
    }

    public boolean atualizarPlano(Assinatura assinatura){
        for (Assinatura assinatura2 : listaAssinaturas){
            if(assinatura2.getplano().equals(assinatura.getplano())){
                listaAssinaturas.remove(assinatura2);
                listaAssinaturas.add(assinatura);
            }
        }
    return false;
    }

    public boolean atualizarFormaPagamento(Assinatura assinatura){
        for (Assinatura assinatura2 : listaAssinaturas){
            if(assinatura2.getformaPagamento().equals(assinatura.getformaPagamento())){
                listaAssinaturas.remove(assinatura2);
                listaAssinaturas.add(assinatura);
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
