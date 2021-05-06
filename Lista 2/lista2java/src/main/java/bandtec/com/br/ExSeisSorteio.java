package bandtec.com.br;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ExSeisSorteio {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite  um número de 1 a 100:");
        Integer numeroDigitado = numero.nextInt();
        
        Integer pares = 0;
        Integer impares = 0;
        Integer rodada = 0;
        
        for (int i = 0; i < 100; i++) {
         
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,200);
         
         if(numeroSorteado % 2 == 0){
             pares ++;
             System.out.println(String.format("pares: %d",pares));  
         }
         else{
             impares ++;
             System.out.println(String.format("Impares: %d",impares));
         }
         if (numeroSorteado.equals(numeroDigitado)) {
                rodada = i;
                break;
            }
          
          System.out.println(String.format("rodada:",rodada,i));
        }
    }
}
