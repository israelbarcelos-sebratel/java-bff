package br.com.sebratel.bff.repository.erp.projections;

public interface ContratoSemFaturaProjection {
    String getContractDescription();
    String getPppoe();
    Long getQtdFaturas();
}