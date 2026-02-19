package br.com.sebratel.bff.controller;

import br.com.sebratel.bff.dto.MovimentacaoEstoqueDTO;
import br.com.sebratel.bff.service.MovimentacaoEstoqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estoque")
public class MovimentacaoEstoqueController {

    private final MovimentacaoEstoqueService movimentacaoEstoqueService;

    public MovimentacaoEstoqueController(MovimentacaoEstoqueService movimentacaoEstoqueService) {
        this.movimentacaoEstoqueService = movimentacaoEstoqueService;
    }

    @GetMapping("movimentacao")
    public ResponseEntity<List<MovimentacaoEstoqueDTO>> getEstoque() {
        List<MovimentacaoEstoqueDTO> lista = movimentacaoEstoqueService.listarEstoque();
        return ResponseEntity.ok(lista);
    }
}