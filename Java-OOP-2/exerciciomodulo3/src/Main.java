public class Main {
    public static void main(String[] args) {

        //1
        Carro carro = new Carro();
        carro.definirModelo("Sedan");
        carro.valoresPorAno(3000, 6000, 5000);
        carro.exibirInfo();

        //2
        Gato gato = new Gato();
        gato.cadastrarAnimal("Manga", "Pequeno", "Preto", "De rua");
        gato.exibirAnimal();
        gato.emitirSom();
        gato.arranharMoveis();

        //3
        System.out.println("********");
        ContaCorrente conta = new ContaCorrente();
        conta.consultarSaldo();
        conta.depositar(500);
        conta.sacar(1500);
        conta.cobrarTarifaMensal();

        //4
        System.out.println("********");
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEPrimo(10);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}