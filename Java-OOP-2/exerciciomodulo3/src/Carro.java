public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void valoresPorAno(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + exibirMenorPreco());
        System.out.println("Maior Preço: " + exibirMaiorPreco());
    }

    public double exibirMaiorPreco() {
        double maiorPreco = precoAno3;

        if (maiorPreco < precoAno2) {
            maiorPreco = precoAno2;
        } else if (maiorPreco < precoAno3) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public double exibirMenorPreco() {
        double menorPreco = precoAno3;

        if (menorPreco > precoAno2) {
            menorPreco = precoAno2;
        } else if (menorPreco > precoAno3) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }
}
