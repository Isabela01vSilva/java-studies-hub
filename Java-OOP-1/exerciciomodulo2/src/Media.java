public class Media {
    public static void main(String[] args) {
        //1
        double nota1 = 4.7;
        double nota2 = 5.4;
        double media = (nota1 * nota2) / 2;
        System.out.println("A média é: " + media);

        //2
        double num1 = 1.5;
        int num2 = (int) num1;
        System.out.println(num2);

        //3
        char letra = 'A';
        String palavra = "ZUL";
        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;
        System.out.println(mensagem);

        //4
        double precoProduto = 9.99;
        int quantidade = 4;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total é R$" + valorTotal);

        //5
        double valorEmDolares = 10.50;
        double valorDoDolar = 5.71;
        double valorReais = valorEmDolares * valorDoDolar;
        System.out.println("Valor em reais é R$" + valorReais);

        //6
        double precoOriginal = 100;
        double percentualDesconto = 10.0;

        double aplicandoDesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - aplicandoDesconto;

        System.out.println("O valor original do produto é de R$:" + precoOriginal);
        System.out.println("O desconto é de R$:" + aplicandoDesconto);
        System.out.println("Novo preço com desconto R$:" + novoPreco);

    }
}
