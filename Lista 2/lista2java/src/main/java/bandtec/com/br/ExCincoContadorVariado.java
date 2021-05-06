package bandtec.com.br;

public class ExCincoContadorVariado {
    public static void main(String[] args) {
        for (double i = 0.0; i < 5; i += 0.15) {
            System.out.println(String.format("%.2f", i));
        }
    }
}
