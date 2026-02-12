package br.com.sebratel.bff.service;

import br.com.sebratel.bff.dto.EstoqueTecnicoDTO;
import br.com.sebratel.bff.repository.EstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository repository;

    public List<EstoqueTecnicoDTO> buscarEstoquePorTecnico(String nome) {
        return repository.findEstoqueByTecnicoNative(nome).stream()
                .map(obj -> new EstoqueTecnicoDTO(
                        (String) obj[0],
                        (String) obj[1],
                        (String) obj[2],
                        ((Number) obj[3]).longValue()
                ))
                .collect(Collectors.toList());
    }
}