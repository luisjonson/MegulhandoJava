package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.Conta;
import br.com.algaworks.mj.banco.modelo.Pessoa;

public class principal {

    public static void main(String[] args) {

        Pessoa titular = new Pessoa();
        titular.setNome("João Alfredo");
        titular.setDocumento("032.656.584-15");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Jose");
        titular2.setDocumento("258.233.458-15");


        Conta minhaConta = new Conta(titular,1020,10123);

        System.out.println(minhaConta.getSaldo());
        minhaConta.depositar(30_000);
        System.out.println(minhaConta.getSaldo());

        Conta suaConta = new Conta(titular2,1020,10123);

        suaConta.depositar(20_000);
        System.out.println("Valor antes do saque "+ minhaConta.getSaldo());
        suaConta.sacar(1_000, 10);
        System.out.println("Valor apois o saque "+ minhaConta.getSaldo());
    }
}
