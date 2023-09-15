package org.example.domain;

public class Veiculo {
    private TipoVeiculo tipoVeiculo;
    private Boolean disponibilidade;
    private String placa;
    private Double capacidade;

    public Veiculo(TipoVeiculo tipoVeiculo, Boolean disponibilidade, String placa, Double capacidade) {
        this.tipoVeiculo = tipoVeiculo;
        this.disponibilidade = disponibilidade;
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }
}
