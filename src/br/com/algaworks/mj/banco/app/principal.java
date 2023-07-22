package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.*;
import br.com.algaworks.mj.banco.modelo.atm.CaixaEletronico;
import br.com.algaworks.mj.banco.modelo.pagamento.Boleto;
import br.com.algaworks.mj.banco.modelo.pagamento.Holerite;


public class principal {

    public static <Contaespecial> void main(String[] args) {

        Pessoa titular = new Pessoa();
        titular.setNome("João Alfredo");
        titular.setDocumento("032.656.584-15");

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        ContaInvestimento minhaConta = new ContaInvestimento(titular,1020,10123);


        minhaConta.depositar(30_000);
        minhaConta.sacar(1_000);
        minhaConta.debitarTarifaMensal();
        minhaConta.creditarRendimentos(0.8);
       // caixaEletronico.imprimirSaldo(minhaConta);

        Boleto boletoEscola = new Boleto(titular,200);
        Holerite salarioFuncionario = new Holerite(titular,100,160);

        caixaEletronico.pagar(boletoEscola, minhaConta);
        caixaEletronico.pagar(salarioFuncionario,minhaConta);
        caixaEletronico.estornarPagamento(boletoEscola,minhaConta);
        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();
        System.out.println("Boleto pago: " + boletoEscola.estaPago());
        System.out.println("Salário pago: " + salarioFuncionario.estaPago());





        ContaEspecial suaConta = new ContaEspecial(titular,222,33,1_000);

        suaConta.depositar(15_000);
        suaConta.sacar(15_500);
        suaConta.debitarTarifaMensal();
        caixaEletronico.imprimirSaldo(suaConta);






    }
}
