package br.com.algaworks.mj.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private String documento;
    private BigDecimal rendimentoAnual;

    private TipoPessoa tipo = TipoPessoa.FISICA;

    private LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

    public void setRendimentoAnual(BigDecimal rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(documento, pessoa.documento) && Objects.equals(rendimentoAnual, pessoa.rendimentoAnual) && tipo == pessoa.tipo && Objects.equals(dataUltimaAtualizacao, pessoa.dataUltimaAtualizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, documento, rendimentoAnual, tipo, dataUltimaAtualizacao);
    }
}
