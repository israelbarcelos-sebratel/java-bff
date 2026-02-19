package br.com.sebratel.bff.service;

import br.com.sebratel.bff.dto.VendedoresAtivosDTO;
import br.com.sebratel.bff.repository.VendedoresAtivosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorAtivosService {

    private final VendedoresAtivosRepository vendedorRepository;

    @Autowired
    public VendedorAtivosService(VendedoresAtivosRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }


    public List<VendedoresAtivosDTO> listarVendedoresAtivos() {
        return vendedorRepository.findVendedoresAtivos().stream()
                .map(VendedoresAtivosDTO::new)
                .toList();
    }
}