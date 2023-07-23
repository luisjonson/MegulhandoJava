package br.com.algaworks.mj.banco.app;

import br.com.algaworks.mj.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Princiapal2 {

    public static void main(String[] args) {
        Pessoa pessoa =  new Pessoa("Jão da Silva", "3232132321");
        Pessoa pessoa2 =  new Pessoa("Jão Batista", "000000000");
        /*List<Pessoa> pessoas = new ArrayList<>();*/
        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        System.out.println(pessoas);

     /*   for (int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i).getNome());
        }

        for (Pessoa pes : pessoas) {
            System.out.println(pes.getNome());
        }*/

        boolean existe = pessoas.contains(pessoa);
        System.out.println(existe);


    }
}
