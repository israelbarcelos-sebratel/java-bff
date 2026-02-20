package br.com.sebratel.bff.repository.erp.projections;

import java.time.LocalDateTime;

public interface ContractActivationProjection {
    LocalDateTime getDataCriacaoContrato();
    LocalDateTime getDataAtivacao();
    String getContrato();
    String getVendedor();
    String getClientes();
    String getTecnologia();
    String getStatusContrato();
    String getStatusCancelamento();
}