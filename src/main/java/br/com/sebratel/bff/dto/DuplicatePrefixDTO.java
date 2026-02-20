package br.com.sebratel.bff.dto;

public record DuplicatePrefixDTO(
        String username,
        Long countCallingstation
) {}