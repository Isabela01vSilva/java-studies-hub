import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual é sua avaliação?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações é " + mediaAvaliacao/3);
    }
}