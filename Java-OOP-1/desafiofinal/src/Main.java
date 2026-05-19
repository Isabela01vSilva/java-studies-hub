import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Isabela";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        int opcao = 0;
        double valor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("\n***********************");

        String menu = """
                    Digite a opção desejada:
                    \n1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;

        while (opcao != 4) {

            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a Receber: ");
                valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado R$: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual o valor da Transferencia? ");
                valor = scanner.nextDouble();
                if(valor > saldo){
                    System.out.println("Não há saldo suficiente");
                }else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Saindo");
            } else {
                System.out.println("Opção invalida, escolha outra");
            }
        }
    }
}