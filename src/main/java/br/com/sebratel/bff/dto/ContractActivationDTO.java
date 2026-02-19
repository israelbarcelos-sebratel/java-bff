package br.com.sebratel.bff.dto;

import java.io.Serializable;

public class ContractActivationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String dataCriacaoContrato;
    private String cadastroCliente;
    private String clientes;
    private String cidade;
    private String statusContrato;
    private String statusCancelamento;
    private String contrato;
    private String vendedor;
    private String regiaoVendedor;
    private Double valor;
    private String tecnologia;
    private String dataAtivacao;
    private String retorno;

    public ContractActivationDTO() {
    }

    public String getDataCriacaoContrato() { return dataCriacaoContrato; }
    public void setDataCriacaoContrato(String dataCriacaoContrato) { this.dataCriacaoContrato = dataCriacaoContrato; }

    public String getCadastroCliente() { return cadastroCliente; }
    public void setCadastroCliente(String cadastroCliente) { this.cadastroCliente = cadastroCliente; }

    public String getClientes() { return clientes; }
    public void setClientes(String clientes) { this.clientes = clientes; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getStatusContrato() { return statusContrato; }
    public void setStatusContrato(String statusContrato) { this.statusContrato = statusContrato; }

    public String getStatusCancelamento() { return statusCancelamento; }
    public void setStatusCancelamento(String statusCancelamento) { this.statusCancelamento = statusCancelamento; }

    public String getContrato() { return contrato; }
    public void setContrato(String contrato) { this.contrato = contrato; }

    public String getVendedor() { return vendedor; }
    public void setVendedor(String vendedor) { this.vendedor = vendedor; }

    public String getRegiaoVendedor() { return regiaoVendedor; }
    public void setRegiaoVendedor(String regiaoVendedor) { this.regiaoVendedor = regiaoVendedor; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public String getTecnologia() { return tecnologia; }
    public void setTecnologia(String tecnologia) { this.tecnologia = tecnologia; }

    public String getDataAtivacao() { return dataAtivacao; }
    public void setDataAtivacao(String dataAtivacao) { this.dataAtivacao = dataAtivacao; }

    public String getRetorno() { return retorno; }
    public void setRetorno(String retorno) { this.retorno = retorno; }
}