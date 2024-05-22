package com.example.edu.fatec.lp2.exercicio2;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class ItemCompra implements Calculavel{
    private Produto produto;
    private int quantidade;
    private double desconto;

    public ItemCompra(Produto produto, int quantidade, double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;

        if (desconto < 0) {
            this.desconto = 0;
        } else if (desconto > produto.getDescontoMaximo()) {
            this.desconto = produto.getDescontoMaximo();
        } else {
            this.desconto = desconto;
        }
    }


    @Override
    public double calcularPreco() {
        double precoTotal = produto.getPreco() * quantidade;
        return precoTotal - (precoTotal * (desconto / 100.0));
    }

    public void vincularProduto(Produto produto) {
        this.produto = produto;
    }

    // Método para vincular o desconto ao item de compra
    public void vincularDesconto(double desconto) {
        setDesconto(desconto);
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public static List<Produto> getProdutosComprados(List<ItemCompra> itensCompra) {
        List<Produto> produtosComprados = new ArrayList<>();
        for (ItemCompra item : itensCompra) {
            produtosComprados.add(item.getProduto());
        }
        return produtosComprados;
    }

}