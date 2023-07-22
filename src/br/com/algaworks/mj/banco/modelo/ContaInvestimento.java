package br.com.algaworks.mj.banco.modelo;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(Pessoa titular,int agencia,int numero){
        super(titular,agencia,numero);
    }

    @Override
    public void debitarTarifaMensal() {
        if(getSaldo() < 10_000){
            sacar(10);
        }
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }
}
