package br.com.sebratel.bff.dto;

public record MergeApoioSemanalDTO(
        String dataCriacaoContrato,
        String dataAtivacao,
        String contrato,
        String vendedor,
        String clientes,
        String tecnologia,
        String statusContrato,
        String statusCancelamento,
        String mesDaCriacao
) {}