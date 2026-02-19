package br.com.sebratel.bff.service;

import br.com.sebratel.bff.repository.ContractPaymentRepository;
import br.com.sebratel.bff.dto.ContractFirstPaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContractPaymentService {

    @Autowired
    private ContractPaymentRepository repository;

    @Cacheable(value = "contracts-first-payment", key = "'all'")
    public List<ContractFirstPaymentDTO> getFirstPaymentReport() {
        return repository.findFirstContractPayments().stream().map(p -> {
            ContractFirstPaymentDTO dto = new ContractFirstPaymentDTO();
            dto.setNome(p.getNome());
            dto.setNumeroContrato(p.getNumero_Contrato());
            dto.setPrimeiraEmissao(p.getPrimeira_Emissao());
            dto.setPagamentoCliente(p.getPagamento_Cliente());
            dto.setDataCriacao(p.getData_Criacao());
            dto.setContractNumber(p.getContractnumber());
            dto.setDescription(p.getDescription());
            dto.setStatus(p.getStatus());
            return dto;
        }).collect(Collectors.toList());
    }
}