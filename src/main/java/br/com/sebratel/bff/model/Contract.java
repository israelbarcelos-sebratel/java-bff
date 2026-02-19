package br.com.sebratel.bff.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contracts", schema = "erp")
public class Contract {
    @Id
    private Long id;
}