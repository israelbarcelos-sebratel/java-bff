package br.com.sebratel.bff.dto;

public record ContratoSemFaturaDTO(
        String contractDescription,
        String pppoe,
        Long qtdFaturas
) {}