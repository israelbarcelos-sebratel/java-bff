package br.com.sebratel.bff.service;

import br.com.sebratel.bff.dto.ContratoSemFaturaDTO;
import br.com.sebratel.bff.repository.erp.ContratoSemFaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoSemFaturaService {

    private final ContratoSemFaturaRepository repository;

    public ContratoSemFaturaService(ContratoSemFaturaRepository repository) {
        this.repository = repository;
    }

    public List<ContratoSemFaturaDTO> listarContratosSemFatura() {
        return repository.findContratosSemFatura().stream()
                .map(p -> new ContratoSemFaturaDTO(
                        p.getContractDescription(),
                        p.getPppoe(),
                        p.getQtdFaturas()
                )).toList();
    }
}