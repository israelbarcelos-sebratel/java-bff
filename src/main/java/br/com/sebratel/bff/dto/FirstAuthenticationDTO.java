package br.com.sebratel.bff.dto;

import java.time.LocalDateTime;

public record FirstAuthenticationDTO(
        String pppoe,
        LocalDateTime authentication
) {}