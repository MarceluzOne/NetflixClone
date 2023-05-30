package edu.Exceptions;


public class NomeErroException extends Exception {
  
  public String getMessege(String user){
    if(user.isBlank() || user.isEmpty()){
      return "Nome Vazio";
    }
    return"Nome  " + user + "não pode ser cadastrado";
  }
}
