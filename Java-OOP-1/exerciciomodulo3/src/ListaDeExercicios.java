import java.util.Scanner;

public class ListaDeExercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        //1 - Número positivo ou negativo
        //int numeroDigitado;
        System.out.println("Digite um número:");
        number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("É um número positivo");
        } else {
            System.out.println("É um número negativo");
        }

        //2 - Maior número
        double numero1;
        double numero2;
        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

        //3
        int opcao = 0;

        while (opcao != 3){
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Digite o número");
                number = scanner.nextInt();
                System.out.println("Número ao quadrado: " + number * 2);

            } else if(opcao == 2){
                System.out.println("Digite o número");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);

            }else if( opcao == 3){
                System.out.println("Saindo");
            }
            else {
                System.out.println("Opção inválida.");
            }
        }

        //4 - Tabuada
        System.out.println("Digite o número para calcular a tabuada:");
        number = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);

        }

        //5 - Número par ou ímpar
        System.out.println("Digite um número: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        //6
        System.out.println("Digite um número para calcular o Fatorial: ");
        number = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= number; i ++){
            fatorial *= i;
        }
        System.out.println(" Fatorial de: " + number + " é: " + fatorial);

    }
}
