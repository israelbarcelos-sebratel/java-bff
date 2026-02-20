package br.com.sebratel.bff.service;

import br.com.sebratel.bff.dto.DuplicatePrefixDTO;
import br.com.sebratel.bff.repository.radius.DuplicatePrefixRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuplicatePrefixService {

    private final DuplicatePrefixRepository repository;

    public DuplicatePrefixService(DuplicatePrefixRepository repository) {
        this.repository = repository;
    }

    public List<DuplicatePrefixDTO> listarPrefixosDuplicados() {
        return repository.findDuplicatePrefixes().stream()
                .map(p -> new DuplicatePrefixDTO(
                        p.getUsername(),
                        p.getCountCallingstation()
                )).toList();
    }
}