package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.Banco;
import br.com.algaworks.mj.banco.modelo.Conta;
import br.com.algaworks.mj.banco.modelo.Pessoa;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        /*Stream<Conta> stream = banco.getContas().stream();*/
        /*Stream<Conta> stream2 = stream.filter(conta ->
            conta.getSaldo().compareTo(new BigDecimal("130")) > 0);*/
        /*banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0)
                .filter(conta -> conta.getNumero() > 300)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .forEach(conta -> {
                    System.out.println(conta.getAgencia() + "/" +conta.getNumero()
                        + " = " +conta.getSaldo());
        });*/

        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(titulares);


        BigDecimal saldoTotal = banco.getContas().stream()
                        .map(Conta::getSaldo)
                        .reduce(BigDecimal.ZERO,BigDecimal::add);
        System.out.println(saldoTotal);

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0)
                .filter(conta -> conta.getNumero() > 300)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);
    }
}
