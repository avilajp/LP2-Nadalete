package com.example.edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel{
    private int qtdeMax;
    private ItemCompra[] itemcompra;


    public ItemCompra[] getItemCompra() {
        return itemcompra;
    }

    @Override
    public double calcularPreco() {
        return 0;
    }

    public int QuantidadeComprada(int qtdeMax){

        return qtdeMax;
    }

    public int tamanhoAtual() {
        if (itemcompra != null) {
            return itemcompra.length;
        } else {
            return 0;
        }
    }

    public void incluirItem(ItemCompra item) {
        if (itemcompra == null) {
            itemcompra = new ItemCompra[1];
            itemcompra[0] = item;
        } else if (tamanhoAtual() < qtdeMax) {
            ItemCompra[] novaLista = new ItemCompra[itemcompra.length + 1];
            for (int i = 0; i < itemcompra.length; i++) {
                novaLista[i] = itemcompra[i];
            }
            novaLista[itemcompra.length] = item;
            itemcompra = novaLista;
        } else {
            System.out.println("Limite máximo de itens atingido na lista de compras.");
        }
    }



}
