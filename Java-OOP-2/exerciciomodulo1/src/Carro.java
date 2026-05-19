public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirCarro() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void idadeCarro(int anoAtual) {
        ano = anoAtual - ano;
    }

}
