package br.com.sebratel.bff.controller;

import br.com.sebratel.bff.dto.AquisicaoDTO;
import br.com.sebratel.bff.service.AquisicaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aquisicoes")
public class AquisicaoController {

    private final AquisicaoService service;

    public AquisicaoController(AquisicaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AquisicaoDTO>> getAquisicoes() {
        return ResponseEntity.ok(service.listarAquisicoes());
    }
}