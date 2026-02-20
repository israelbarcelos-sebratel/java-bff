package br.com.sebratel.bff.repository.erp.projections;

import java.time.LocalDate;

public interface AquisicaoProjection {
    Long getId();
    String getCodigo();
    String getProduto();
    LocalDate getData();
    String getRequisitadoPor();
    LocalDate getDataPrevisao();
    Double getUnidades();
    String getBase();
    String getStatus();
}