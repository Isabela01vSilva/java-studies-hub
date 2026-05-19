package br.com.desafio.modelos;

import br.com.desafio.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {

    protected double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }

}
