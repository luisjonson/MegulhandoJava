package br.com.algaworks.mj.banco.excessao;

public class SaldoInsuficienteException extends  RuntimeException{
   public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
