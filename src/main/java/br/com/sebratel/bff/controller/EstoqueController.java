package br.com.sebratel.bff.controller;

import br.com.sebratel.bff.dto.EstoqueTecnicoDTO;
import br.com.sebratel.bff.service.EstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estoque")
@RequiredArgsConstructor
public class EstoqueController {

    private final EstoqueService service;

    @PostMapping("/tecnico")
    public ResponseEntity<List<EstoqueTecnicoDTO>> getEstoque(@RequestBody String nome) {
        return ResponseEntity.ok(service.buscarEstoquePorTecnico(nome));
    }
}