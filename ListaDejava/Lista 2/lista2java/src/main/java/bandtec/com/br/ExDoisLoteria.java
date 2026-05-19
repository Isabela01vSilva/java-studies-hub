package bandtec.com.br;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExDoisLoteria {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número 0 a 10:");
        Integer numeroEntre = leitor.nextInt();
        Integer aleatorio;
        Integer contador = 0;

        do {
            contador++;
            //Gerar numero aleatorio
            aleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            
            System.out.println(String.format("%dº SORTEIO: %d", contador, aleatorio));
        } 
        
        while (!numeroEntre.equals(aleatorio));
        // "!" enquanto nao for igual 
        System.out.println(String.format("A máquina acertou o número %d, foram %d tentativas.\n", numeroEntre, contador));

        if (contador <= 3) {
            System.out.println("Você é muito sortudo");
        } else if (contador > 3 && contador < 11) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor ser trabalhador!");
        }
    }
}
