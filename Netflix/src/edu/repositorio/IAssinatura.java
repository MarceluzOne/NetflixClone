package edu.repositorio;
import java.util.ArrayList;

import edu.Servico.AssinaturaServico;
import edu.entidades.Assinatura;

public interface IAssinatura {
    
  public boolean salvarAssinatura(Assinatura assinatura);

  public ArrayList<Assinatura> listarAssinatura();

  public boolean deletarAssinatura(Assinatura plano);

  public boolean atualizarPlano(Assinatura plano);

  public boolean atualizarFormaPagamento(Assinatura formaPagamento);

  public boolean atualizarDados(Assinatura dados);
}
