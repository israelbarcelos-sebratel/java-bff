package br.com.sebratel.bff.repository.erp.projections;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ContractFirstPaymentProjection {
    String getNome();
    String getNumero_Contrato();
    LocalDate getPrimeira_Emissao();
    LocalDate getPagamento_Cliente();
    LocalDateTime getData_Criacao();
    String getContractnumber();
    String getDescription();
    String getStatus();
}