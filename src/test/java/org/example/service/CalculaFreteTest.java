package org.example.service;

import org.example.domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Vector;

public class CalculaFreteTest {

    @Test
    public void deveCalcularFreteDoisItens(){
        Produto vassoura = new Produto("Macia", 10.0, "Vassoura");
        Produto rodo = new Produto("", 12.0, "Rodo");
        Endereco endereco = new Endereco("Rua Interventor Manoel Ribas", "56", "Centro", "86975-000", "Mandaguari", "Sobrado");
        Veiculo veiculo = new Veiculo(TipoVeiculo.CARRO, Boolean.TRUE, "BB34TG", 50.0);
        LocalDate data = LocalDate.of(2023, 12, 14);

        List<Produto> produtos = List.of(vassoura, rodo);
        Pedido pedido = new Pedido(123, produtos);
        Entrega entrega = new Entrega(data, endereco, pedido, veiculo);

        Assertions.assertEquals(2, pedido.getQuantidadeProdutos());
        Assertions.assertEquals(22.0, pedido.getValorTotal());
        Assertions.assertEquals(38.0, entrega.calculaFrete(10.0));
    }

    @Test
    public void deveCalcularFreteDezItens(){
        Produto vassoura = new Produto("Macia", 10.0, "Vassoura");
        Produto rodo = new Produto("", 12.0, "Rodo");
        Produto roupa = new Produto("Camiseta", 100.0, "Roupa");
        Produto tinta = new Produto("Tinta Preta", 500.0, "Tinta");
        Produto pasta = new Produto("Colgate", 10.0, "Pasta de Dente");
        Produto bola = new Produto("Bola de Futebol Adidas", 100.0, "Bola");
        Produto maquina = new Produto("Secadora", 100.0, "Maquina de Secar");
        Produto mochila = new Produto("Mochila Element", 50.0, "Mochila");
        Produto maquiagem = new Produto("Bruna Tavares", 100.0, "Pó");
        Produto placa = new Produto("Placa Indicativa", 100.0, "Placa");

        Endereco endereco = new Endereco("Rua Interventor Manoel Ribas", "56", "Centro", "86975-000", "Mandaguari", "Sobrado");
        Veiculo veiculo = new Veiculo(TipoVeiculo.CARRO, Boolean.TRUE, "BB34TG", 50.0);
        LocalDate data = LocalDate.of(2023, 12, 14);

        List<Produto> produtos = List.of(vassoura, rodo, roupa, tinta, pasta, bola, maquina, mochila, maquiagem, placa);
        Pedido pedido = new Pedido(123, produtos);
        Entrega entrega = new Entrega(data, endereco, pedido, veiculo);

        Assertions.assertEquals(10, pedido.getQuantidadeProdutos());
        Assertions.assertEquals(1082.0, pedido.getValorTotal());
        Assertions.assertEquals(39.0, entrega.calculaFrete(10.0));
    }


}
