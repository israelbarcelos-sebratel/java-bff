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
        // Agora o repositório já retorna uma lista de EstoqueView (Interface)
        return repository.findEstoqueByTecnicoNative(nome).stream()
                .map(view -> new EstoqueTecnicoDTO(

                        view.getCodigo(),
                        view.getDescricao(),
                        view.getTecnico(),
                        view.getPossui() != null ? view.getPossui().longValue() : 0L,
                        view.getId()
                ))
                .collect(Collectors.toList());
    }
}