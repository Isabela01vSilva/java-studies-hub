package com.mycompany.isabela.vitoria.c2;

public class Loja {
    private Double pedidosRealizados;
    private Double descontosAplicados;
    
    public void aplicarDesconto(Pedido pedido){
        double valorPedido = pedido.getValorTotal();
        descontosAplicados = descontosAplicados +1;
        double valorTotal = valorPedido-(valorPedido * 0.05);
        pedido.setValorTotal(valorTotal);
    }
    public void finalizarPedido(Pedido pedido){
        pedidosRealizados = pedidosRealizados +1;
        System.out.println(pedido.toString());
    }

    @Override
    public String toString() {
        return ("Loja"+ "\n pedidosRealizados"+ pedidosRealizados + "\n DescontosAplicados:" + descontosAplicados); 
    }
    
}