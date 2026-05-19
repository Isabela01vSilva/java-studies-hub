import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int numero = leitura.nextInt();

        System.out.println("Digite o denominador:");
        int denominador = leitura.nextInt();

        try{
            int resultado = numero / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida.");
        }

    }
}