package br.com.sebratel.bff.repository.erp.projections;

import java.time.LocalDateTime;

public interface AquisicaoProjection {
    Long getId();
    String getCodigo();
    String getProduto();
    LocalDateTime getData();
    String getRequisitadoPor();
    LocalDateTime getDataPrevisao();
    Double getUnidades();
    String getBase();
    String getStatus();
}