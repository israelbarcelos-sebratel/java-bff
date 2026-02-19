package br.com.sebratel.bff.repository;

import br.com.sebratel.bff.model.Contract;
import br.com.sebratel.bff.repository.projections.VendedoresProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendedoresAtivosRepository extends JpaRepository<Contract, Long> {

    @Query(value = """
        SELECT 
            p.name AS nomeVendedor, 
            p.email AS emailVendedor 
        FROM erp.people_crm_informations x
        LEFT JOIN people p ON x.person_id = p.id 
        LEFT JOIN v_users vu ON p.name = vu.name
        WHERE x.industry_sector_id IS NOT NULL 
          AND p.email <> ''
          AND vu.active IS TRUE  
          AND vu.email = p.email 
        ORDER BY p.name ASC
        """, nativeQuery = true)
    List<VendedoresProjection> findVendedoresAtivos();
}