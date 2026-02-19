package br.com.sebratel.bff.repository.projections;

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