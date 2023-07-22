package br.com.algaworks.mj.banco.modelo.pagamento;

public interface DocumentoEstornavel extends  DocumentoPagavel{
    void estornarPagamento();
}
