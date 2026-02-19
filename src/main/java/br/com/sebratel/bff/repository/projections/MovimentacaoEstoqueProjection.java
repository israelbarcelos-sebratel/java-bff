package br.com.sebratel.bff.repository.projections;

public interface MovimentacaoEstoqueProjection {
    String getCodigos();
    Long getId();
    String getDescricao();
    String getBaseDeOrigem();
    Double getEstoqueAtual();
    Integer getMinimo();
}
