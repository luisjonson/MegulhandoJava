package br.com.algaworks.mj.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getDocumento() {
      return documento;
   }

   public void setDocumento(String documento) {
      this.documento = documento;
   }

   public TipoPessoa getTipo() {
      return tipo;
   }

   public void setTipo(TipoPessoa tipo) {
      this.tipo = tipo;
   }

   public LocalDateTime getDataUltimaAtualizacao() {
      return dataUltimaAtualizacao;
   }

   public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
      this.dataUltimaAtualizacao = dataUltimaAtualizacao;
   }

   public BigDecimal getRendimentoAnual() {
      return rendimentoAnual;
   }
}
