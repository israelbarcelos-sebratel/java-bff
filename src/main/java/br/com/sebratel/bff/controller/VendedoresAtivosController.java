package br.com.sebratel.bff.controller;

import br.com.sebratel.bff.dto.VendedoresAtivosDTO;
import br.com.sebratel.bff.service.VendedorAtivosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vendedores")
public class VendedoresAtivosController {


    private final VendedorAtivosService vendedoresAtivosService;

    @Autowired
    public VendedoresAtivosController(VendedorAtivosService vendedoresAtivosService) {
        this.vendedoresAtivosService = vendedoresAtivosService;
    }

    @GetMapping("/ativos")
    public ResponseEntity<List<VendedoresAtivosDTO>> getAtivos() {
        List<VendedoresAtivosDTO> vendedores = vendedoresAtivosService.listarVendedoresAtivos();
        return ResponseEntity.ok(vendedores);
    }
}