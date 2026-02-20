package br.com.sebratel.bff.dto;

public record PatrimonioPendenteDTO(
        String codigo,
        String companyPlace,
        String productName,
        Double unidadesPendentes
) {}