package br.com.sebratel.bff.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Subselect("SELECT 1 as id") // Isso define um ID estático para satisfazer o JPA
public class EstoqueEntity {

    @Id
    private Long id;

    // Getters e Setters (opcionais se você usar apenas Interface Projection)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}