package br.com.sebratel.bff.repository.erp.projections;

public interface PatrimonioPendenteProjection {
    String getCodigo();
    String getCompanyPlace();
    String getProductName();
    Double getUnidadesPendentes();
}