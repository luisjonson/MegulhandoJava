package br.com.algaworks.mj.banco.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta{
    private BigDecimal valorLimite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;
    }

    public BigDecimal getValorLimite() {
        return valorLimite;
    }

      @Override
    public BigDecimal getSaldoDisponivel() {
        return getSaldo().add(getValorLimite()) ;
    }

    @Override
    public void debitarTarifaMensal() {
        sacar(new BigDecimal("20"));
    }
}
