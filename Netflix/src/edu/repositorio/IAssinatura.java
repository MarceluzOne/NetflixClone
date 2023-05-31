package edu.Repositorio;
import java.util.ArrayList;
import edu.entidades.Assinatura;

public interface IAssinatura {
    
  public boolean salvarAssinatura(Assinatura assinatura);

  public ArrayList<Assinatura> listarAssinatura();

  public boolean deletarAssinatura(String plano);

  public boolean atualizarPlano(Assinatura plano);

  public boolean atualizarFormaPagamento(Assinatura formaPagamento);

  public boolean atualizarDados(Assinatura dados);
}
