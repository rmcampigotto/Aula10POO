package org.example.domain;

import java.time.LocalDate;

public class Entrega {

    private LocalDate dataPrevista;
    private Endereco endereco;
    private Pedido pedido;
    private Veiculo veiculo;
    //private Double valorFrete;

    public Entrega(LocalDate dataPrevista, Endereco endereco, Pedido pedido, Veiculo veiculo) {
        this.dataPrevista = dataPrevista;
        this.endereco = endereco;
        this.pedido = pedido;
        this.veiculo = veiculo;
    }

//    public Double calculaDistancia(String cep){
//        return 0.0;
//    }

    public Double calculaFrete(Double distancia){
        Double km = 1.8;
        Double min = 20.00;
        Integer quantidade = pedido.getQuantidadeProdutos();
        Double valorQuantidade = 0.0;

        if (quantidade >= 10) {
            int dezenas = quantidade / 10;
            valorQuantidade = dezenas * 1.0; // 1 real por dezena completa
        }

        return min + (km * distancia) + valorQuantidade;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
