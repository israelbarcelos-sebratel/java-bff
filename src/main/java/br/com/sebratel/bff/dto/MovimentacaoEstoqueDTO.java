package br.com.sebratel.bff.dto;
public record MovimentacaoEstoqueDTO(
        String codigos,
        Long id,
        String descricao,
        String baseDeOrigem,
        Double estoqueAtual,
        Integer minimo
) {}