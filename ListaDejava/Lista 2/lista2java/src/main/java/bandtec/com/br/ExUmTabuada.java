package bandtec.com.br;

import java.util.Scanner;
public class ExUmTabuada {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um numero pra fazer a tabuada:");
        Integer numeroDigitado = numero.nextInt();
        
        for (int i = 0; i < 11; i++) {
            System.out.println(String.format(i + "x" + numeroDigitado + "=" + (i * numeroDigitado),i,numeroDigitado));
        }
    }
}
