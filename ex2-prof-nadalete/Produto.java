package com.example.edu.fatec.lp2.exercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, String unidade, String descricao, double preco, double descontoMaximo) {
        this.nome = nome;
        this.unidade = unidade;
        this.descricao = descricao;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
    }

    public Produto(Supermercado s) {
        this.supermercado = s;
    }

    public String retornarproduto(String nome){
        return nome;
    }

    public void associarSupermercado(Supermercado s) {
        this.supermercado = s;
    }

    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", unidade='" + unidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", descontoMaximo=" + descontoMaximo +
                ", supermercado=" + supermercado +
                '}';
    }

    public String getNome() {
        return nome;
    }


    public String getUnidade() {
        return unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }


    public double getDescontoMaximo() {
        return descontoMaximo;
    }


    public Supermercado getSupermercado() {
        return supermercado;
    }


    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }


}
