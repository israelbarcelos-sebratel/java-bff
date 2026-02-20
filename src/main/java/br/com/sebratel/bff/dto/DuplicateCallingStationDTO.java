package br.com.sebratel.bff.dto;

public record DuplicateCallingStationDTO(
        String username,
        Long uniqueCallingstationCount
) {}