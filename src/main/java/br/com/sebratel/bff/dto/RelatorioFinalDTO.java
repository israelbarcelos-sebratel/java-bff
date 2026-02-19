package br.com.sebratel.bff.dto;

import java.time.LocalDateTime;

public record RelatorioFinalDTO(
        LocalDateTime dataCriacaoContrato,
        LocalDateTime dataAtivacao,
        String contrato,
        String vendedor,
        String clientes,
        String tecnologia,
        String statusContrato,
        String statusCancelamento,
        String mesDaCriacao
) {}