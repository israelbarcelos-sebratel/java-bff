package br.com.sebratel.bff.dto;

import java.util.List;

public record OrderedApoioSemanalDTO(
        List<RelatorioFinalDTO> data
) {}