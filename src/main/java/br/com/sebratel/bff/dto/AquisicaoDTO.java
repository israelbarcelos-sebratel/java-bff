package br.com.sebratel.bff.dto;

import java.time.LocalDateTime;

public record AquisicaoDTO(
        Long id,
        String codigo,
        String produto,
        LocalDateTime data,
        String requisitadoPor,
        LocalDateTime dataPrevisao,
        Double unidades,
        String base,
        String status
) {}