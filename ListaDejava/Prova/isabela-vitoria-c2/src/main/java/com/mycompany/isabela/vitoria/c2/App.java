package com.mycompany.isabela.vitoria.c2;

public class App {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        
        pedido1.setCodigo(12345);
        pedido1.setProduto("Escova de dente");
        pedido1.setQuantidade(2);
        pedido1.setValorUnitario(10.50);
        pedido1.setValorComDesconto(0.00);
        pedido1.setValorTotal(25.56);
        pedido1.setItemPromoconal(false);
        
        pedido2.setCodigo(12985);
        pedido2.setProduto("Escova de dente de cavalo");
        pedido2.setQuantidade(8);
        pedido2.setValorUnitario(16.50);
        pedido2.setValorComDesconto(5.00);
        pedido2.setValorTotal(12.20);
        pedido2.setItemPromoconal(true);
        
        pedido3.setCodigo(19985);
        pedido3.setProduto("Escova  de cavalo");
        pedido3.setQuantidade(18);
        pedido3.setValorUnitario(86.50);
        pedido3.setValorComDesconto(5.00);
        pedido3.setValorTotal(12.20);
        pedido3.setItemPromoconal(true);
        
        Loja loja1 = new Loja();
        
        loja1.aplicarDesconto(pedido2);
        loja1.aplicarDesconto(pedido3);
        
        loja1.finalizarPedido(pedido1);
        loja1.finalizarPedido(pedido2);
        loja1.finalizarPedido(pedido3);
        
        System.out.println(loja1.toString());
    }
}
