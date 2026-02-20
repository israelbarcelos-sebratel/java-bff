package br.com.sebratel.bff.repository.radius;

import br.com.sebratel.bff.model.RadiusContract;
import br.com.sebratel.bff.repository.radius.projections.AquisicaoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AquisicaoRepository extends JpaRepository<RadiusContract, Long> {

    @Query(value = """
        SELECT 
            par.id AS id,
            sp.code AS codigo,
            sp.title AS produto,
            par.date AS data,
            p.name AS requisitadoPor,
            par.receipt_date_prevision AS dataPrevisao,
            pari.units AS unidades,
            CASE 
                WHEN UPPER(par.observation) LIKE '%SCHARLAU%' THEN 'BASE OPERACIONAL - SÃO LEOPOLDO'
                WHEN UPPER(par.observation) LIKE '%VICTOR BARRETO%' THEN 'BASE OPERACIONAL - CANOAS'
                WHEN UPPER(par.observation) LIKE '%NAVEGANTES%' THEN 'SEDE - PORTO ALEGRE'
                ELSE 'NÃO IDENTIFICADA'
            END AS base,
            CASE 
                WHEN par.status = 4 THEN 'Aguardando Entrega'
                WHEN par.status = 2 THEN 'Em Aprovação'
                WHEN par.status = 1 THEN 'Inclusão'
            END AS status
        FROM erp.product_acquisition_requests par
        LEFT JOIN erp.product_acquisition_request_items AS pari ON pari.product_acquisition_request_id = par.id
        LEFT JOIN erp.service_products sp ON sp.id = pari.service_product_id
        LEFT JOIN erp.people p ON p.id = par.person_id
        WHERE par.status IN (1, 2, 4) 
          AND par.deleted IS FALSE
        GROUP BY par.id, sp.code, sp.title, par.date, p.name, par.receipt_date_prevision, pari.units
        ORDER BY par.date DESC
        """, nativeQuery = true)
    List<AquisicaoProjection> findAquisicoesPendentes();
}