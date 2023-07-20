package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.Conta;
import br.com.algaworks.mj.banco.modelo.ContaEspecial;
import br.com.algaworks.mj.banco.modelo.ContaInvestimento;
import br.com.algaworks.mj.banco.modelo.Pessoa;

import javax.script.ScriptEngine;

public class principal {

    public static <Contaespecial> void main(String[] args) {

        Pessoa titular = new Pessoa();
        titular.setNome("João Alfredo");
        titular.setDocumento("032.656.584-15");


        ContaInvestimento minhaConta = new ContaInvestimento(titular,1020,10123);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);
        minhaConta.creditarRendimentos(0.8);
        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        ContaEspecial suaConta = new ContaEspecial(titular,222,33,1_000);

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);
        System.out.println("______________________________");
        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());


    }
}
