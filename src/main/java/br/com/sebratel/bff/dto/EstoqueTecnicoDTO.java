package br.com.sebratel.bff.dto;

public record EstoqueTecnicoDTO(
        String codigo,
        String descricao,
        String tecnico,
        Long possui
) {}
