package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.excessao.SaldoInsuficienteException;
import br.com.algaworks.mj.banco.modelo.*;
import br.com.algaworks.mj.banco.modelo.atm.CaixaEletronico;
import br.com.algaworks.mj.banco.modelo.pagamento.Boleto;
import br.com.algaworks.mj.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class principal {

    public static void main(String[] args) {

        Pessoa titular = new Pessoa();
        titular.setNome("João Alfredo");
        titular.setDocumento("032.656.584-15");
        titular.setRendimentoAnual(new BigDecimal("15000"));
        System.out.println(titular.getTipo());
        titular.setDataUltimaAtualizacao(LocalDateTime.parse("2023-06-27T13:00:00"));
        System.out.println(titular.getDataUltimaAtualizacao());

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        ContaInvestimento minhaConta = new ContaInvestimento(titular, 1020, 10123);
        try {
            minhaConta.depositar(new BigDecimal("30000"));
            minhaConta.sacar(new BigDecimal("1000"));
            minhaConta.debitarTarifaMensal();
            minhaConta.creditarRendimentos(new BigDecimal("0.8"));
            // caixaEletronico.imprimirSaldo(minhaConta);

            Boleto boletoEscola = new Boleto(titular, new BigDecimal("200"));
            Holerite salarioFuncionario = new Holerite(titular, new BigDecimal("100"), 160);
            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);
            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);
            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();
            System.out.println("Boleto pago: " + boletoEscola.estaPago());
            System.out.println("Salário pago: " + salarioFuncionario.estaPago());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao execultar operação na conta " + e.getMessage());
        }

        ContaEspecial suaConta = new ContaEspecial(titular, 222, 33, new BigDecimal("1000"));

        suaConta.depositar(new BigDecimal("15000"));
        suaConta.sacar(new BigDecimal("15500"));
        suaConta.debitarTarifaMensal();
        caixaEletronico.imprimirSaldo(suaConta);

    }
}
