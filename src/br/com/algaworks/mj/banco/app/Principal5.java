package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.Banco;
import br.com.algaworks.mj.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Optional;

public class Principal5 {

    public static void main(String[] args) {
        Banco banco = new Banco();

       /* banco.buscar(123,222)
                .ifPresent(conta -> System.out.println(conta.getSaldo()));*/
        /*if(contaEncontrada.isEmpty()){
            Conta conta = contaEncontrada.get();
            System.out.println(conta.getSaldo());
        }*/

       /* Conta conta = banco.buscar(123,333)
                .orElseThrow(() ->new RuntimeException("Conta não encontrada"));

        System.out.println(conta.getSaldo());*/

       BigDecimal saldo =  banco.buscar(123,333)
                .map(Conta::getSaldo)
                .orElse(BigDecimal.ZERO);
        System.out.println(saldo);
    }
}
