public class Main {
    public static void main(String[] args) {
        double celsius = 30.4;
        int fahrenheit = (int) ((celsius * 1.8) + 32);

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %d Fahrenheit", celsius, fahrenheit);

        System.out.println(mensagem);

    }
}