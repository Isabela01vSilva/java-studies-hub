package br.com.desafio.principal;

import br.com.desafio.interfaces.ConversorTemperatura;
import br.com.desafio.modelos.*;

public class Principal {
    public static void main(String[] args) {
        //1
        System.out.println("************");
        ConversorMoeda converter = new ConversorMoeda();
        converter.converterDolarParaReal(10);

        //2
        System.out.println("************");
        CalculadoraSalaRetangular calcular = new CalculadoraSalaRetangular();
        calcular.calcularArea(5, 8);
        calcular.calcularPerimetro(5, 8);

        //3
        System.out.println("************");
        TabuadaMultiplicacao numero = new TabuadaMultiplicacao();
        numero.mostrarTabuada(5);

        //4
        System.out.println("************");
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.fahrenheitParaCelsius(18);
        temperatura.celsiusParaFahrenheit(18);

        //5
        System.out.println("************");
        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.setPreco(40.50);
        System.out.println("Preço final: R$" + produto1.calcularPrecoFinal());


    }
}
