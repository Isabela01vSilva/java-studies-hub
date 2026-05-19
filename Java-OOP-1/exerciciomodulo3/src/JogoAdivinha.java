import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = 0;
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.println("Digite o número: ");
            numeroDigitado = leitura.nextInt();
            tentativas--;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns você acertou o número aleatorio! Com apenas " + tentativas + "tentativas");
                break;
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("Número Aleatorio é menor. Você tem: " + tentativas + " tentativas");
            } else {
                System.out.println("Número Aleatorio é maior. Você tem: " + tentativas + " tentativas");
            }
            if (tentativas == 0) {
                System.out.println("Infelizmente você não conseguiu acerta o número e acabou suas tentativas. O número era: " + numeroAleatorio);
            }
        }

    }
}