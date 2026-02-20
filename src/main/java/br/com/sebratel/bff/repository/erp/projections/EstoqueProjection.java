package br.com.sebratel.bff.repository.erp.projections;

public interface EstoqueProjection {
    Long getId();
    String getCodigo();
    String getDescricao();
    String getTecnico();
    Integer getPossui();
}