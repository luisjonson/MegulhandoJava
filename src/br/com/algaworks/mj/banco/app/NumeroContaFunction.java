package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.Conta;

import java.util.function.ToIntFunction;

public class NumeroContaFunction implements ToIntFunction<Conta> {

    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero();
    }
}
