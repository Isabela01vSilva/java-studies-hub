public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 2;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Saldo atual, após cobrança de tarifa: R$" + saldo + " Valor da tarifa: R$" + tarifaMensal);
    }
}
