package br.com.desafio.modelos;

import br.com.desafio.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double c) {
        double calcular = (c * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + calcular);
    }

    @Override
    public void fahrenheitParaCelsius(double f) {
        double calcular = (f - 32) / 1.8;
        System.out.println("Temperatura em Celsius: " + calcular);
    }
}
