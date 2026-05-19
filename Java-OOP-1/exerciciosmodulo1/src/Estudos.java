public class Estudos {
    public static void main(String[] args) {
        System.out.println("Local de anotações");
        System.out.println("No Java não tem como criar uma variavel em braco");
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");

        int valor =  10;
        valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor

        //Operadores aritméticos:
        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        //Operadores relacionais:
        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

        //Operadores lógicos:
        boolean f = true;
        boolean h = false;
        if (f && h) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }
        if (f || h) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
        }
        if (!f) {
            // Este código não será executado, já que a é verdadeiro.
        }

        //Operadores de incremento:
        //Pre-incremento
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        //Pos-incremento
        resultado = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num); // imprime 7
        System.out.println(resultado); // imprime 6

    }
}
