package br.com.desafio.modelos;

import br.com.desafio.interfaces.Vendavel;

public class Produto implements Vendavel {
    private double precoUni;

    public double getPreco() {
        return precoUni;
    }

    public void setPreco(double precoUni) {
        this.precoUni = precoUni;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUni * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUni -= precoUni * (percentualDesconto / 100.0);
    }

}
