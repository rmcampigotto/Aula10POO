package org.example.domain;

public class Produto {

    private String descricao;
    private Double preco;
    private String nome;

    public Produto(String descricao, Double preco, String nome) {
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
