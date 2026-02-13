package br.com.sebratel.bff.entity;

import java.math.BigDecimal;

public interface EstoqueView {
    Long getId(); // Adicionado para bater com o MAX(ppm.id)
    String getCodigo();
    String getDescricao();
    String getTecnico();
    BigDecimal getPossui();
}