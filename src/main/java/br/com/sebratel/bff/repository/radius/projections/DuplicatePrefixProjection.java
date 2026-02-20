package br.com.sebratel.bff.repository.radius.projections;

public interface DuplicatePrefixProjection {
    String getUsername();
    Long getCountCallingstation();
}