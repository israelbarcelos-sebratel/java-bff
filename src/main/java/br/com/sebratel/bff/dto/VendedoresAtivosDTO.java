package br.com.sebratel.bff.dto;

import br.com.sebratel.bff.repository.projections.VendedoresProjection;


public record VendedoresAtivosDTO(String nome, String email) {
    // Constructor para converter de Projection para DTO facilmente
    public VendedoresAtivosDTO(VendedoresProjection projection) {
        this(projection.getNomeVendedor(), projection.getEmailVendedor());
    }
}