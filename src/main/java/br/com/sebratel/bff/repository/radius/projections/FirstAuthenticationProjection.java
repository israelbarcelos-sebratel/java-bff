package br.com.sebratel.bff.repository.radius.projections;

import java.time.LocalDateTime;

public interface FirstAuthenticationProjection {
    String getPppoe();
    LocalDateTime getAuthentication();
}