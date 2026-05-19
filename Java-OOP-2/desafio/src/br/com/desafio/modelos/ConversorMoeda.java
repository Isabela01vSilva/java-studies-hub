package br.com.desafio.modelos;

import br.com.desafio.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double dolar) {
        double converter = dolar * 5.61;
        System.out.println("Valor do Dolar: " + dolar + ". Convertido para Real: " + converter);
    }
}
