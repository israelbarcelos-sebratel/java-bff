package br.com.sebratel.bff.controller;

import br.com.sebratel.bff.dto.PatrimonioPendenteDTO;
import br.com.sebratel.bff.service.PatrimonioPendenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patrimonios")
public class PatrimonioPendenteController {

    private final PatrimonioPendenteService service;

    public PatrimonioPendenteController(PatrimonioPendenteService service) {
        this.service = service;
    }

    @GetMapping("/pendentes")
    public ResponseEntity<List<PatrimonioPendenteDTO>> getPendentes() {
        return ResponseEntity.ok(service.listarPatrimoniosPendentes());
    }
}