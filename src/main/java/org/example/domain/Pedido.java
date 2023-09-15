package org.example.domain;

import java.util.List;

public class Pedido {

    private Integer numero;
    private List<Produto> produtos;

    public Pedido(Integer numero, List<Produto> produtos) {
        this.numero = numero;
        this.produtos = produtos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getQuantidadeProdutos(){
        Integer quantidade = 0;
        for (Produto p: produtos) {
            quantidade++;
        }
        return quantidade;
    }

    public Double getValorTotal(){
        Double valorTotal = 0.0;
        for (Produto p: produtos) {
            valorTotal += p.getPreco();
        }
        return valorTotal;
    }

}
