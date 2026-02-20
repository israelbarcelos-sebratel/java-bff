package br.com.sebratel.bff.service;

import br.com.sebratel.bff.dto.FirstAuthenticationDTO;
import br.com.sebratel.bff.repository.radius.FirstAuthenticationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstAuthenticationService {

    private final FirstAuthenticationRepository repository;

    public FirstAuthenticationService(FirstAuthenticationRepository repository) {
        this.repository = repository;
    }

    public List<FirstAuthenticationDTO> listarPrimeirasAutenticacoes() {
        return repository.findFirstAuthentications().stream()
                .map(p -> new FirstAuthenticationDTO(
                        p.getPppoe(),
                        p.getAuthentication()
                )).toList();
    }
}