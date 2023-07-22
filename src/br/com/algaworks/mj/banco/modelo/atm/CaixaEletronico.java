package br.com.algaworks.mj.banco.modelo.atm;

import br.com.algaworks.mj.banco.modelo.Conta;
import br.com.algaworks.mj.banco.modelo.pagamento.DocumentoEstornavel;
import br.com.algaworks.mj.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titlar: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if(documento.estaPago()){
            throw new IllegalStateException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta){
        if(Boolean.FALSE.equals(documento.estaPago())){
            throw new IllegalStateException("Documento não está pago.");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}
