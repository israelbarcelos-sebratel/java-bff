package br.com.sebratel.bff.service;

import br.com.sebratel.bff.dto.PatrimonioPendenteDTO;
import br.com.sebratel.bff.repository.erp.PatrimonioPendenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrimonioPendenteService {

    private final PatrimonioPendenteRepository repository;

    public PatrimonioPendenteService(PatrimonioPendenteRepository repository) {
        this.repository = repository;
    }

    public List<PatrimonioPendenteDTO> listarPatrimoniosPendentes() {
        return repository.findPatrimoniosPendentes().stream()
                .map(p -> new PatrimonioPendenteDTO(
                        p.getCodigo(),
                        p.getCompanyPlace(),
                        p.getProductName(),
                        p.getUnidadesPendentes()
                )).toList();
    }
}