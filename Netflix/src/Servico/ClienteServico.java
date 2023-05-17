package Servico;
import Exceptions.CpfInvalidoException;
import edu.entidades.Cliente;
import edu.repositorio.ClienteRepositorio;
import Exceptions.NomeInvalidoException;

public class ClienteServico {
    
    public void cadastrar(Cliente cliente){
        try {


        if (cliente.getCPF().length() < 11){
            throw new CpfInvalidoException();
    
        }
        if (cliente.getName().length() < 20){
            throw new NomeInvalidoException();
        }else{
            ClienteRepositorio().salvarCliente()
        }
    } catch (CpfInvalidoException ex){
        System.out.println("Seu CPF está incorreto.");

        }
    catch (NomeInvalidoException ex){
        System.out.println("Seu nome está incorreto.");

        }
    }
}
