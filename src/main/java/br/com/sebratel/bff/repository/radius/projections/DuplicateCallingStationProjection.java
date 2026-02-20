package br.com.sebratel.bff.repository.radius.projections;

public interface DuplicateCallingStationProjection {
    String getUsername();
    Long getUniqueCallingstationCount();
}