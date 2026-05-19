package br.com.desafio.modelos;

import br.com.desafio.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " x " + numero + " = " + numero * i);
        }
    }
}
