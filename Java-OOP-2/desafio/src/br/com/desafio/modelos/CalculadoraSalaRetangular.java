package br.com.desafio.modelos;

import br.com.desafio.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double base, double altura) {
        double calculo = base * altura;
        System.out.println("Base: " + base + " Altura: " + altura + " Area: " + calculo);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double calculo = 2 * (base + altura);
        System.out.println("Base: " + base + " Altura: " + altura + " Perimetro: " + calculo);
    }
}
