package com.mycompany.isabela.vitoria.c2;

public class Pedido {
    private Integer codigo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorComDesconto;
    private Double valorTotal;
    private Boolean itemPromoconal;
    
    public Pedido(){
        this.codigo = 000;
        this.quantidade = 00;
        this.valorUnitario = 0.00;
        this.valorComDesconto = 0.00;
        this.valorTotal = 0.00;
        this.itemPromoconal = false;
    }
    public void calcularValorTotal(){
        this.valorTotal = this.valorUnitario * this.quantidade;
    }

    /*@Override
    public String toString() {
        return (String.format(""));
    }*/

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", produto=" + produto + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + ", valorComDesconto=" + valorComDesconto + ", valorTotal=" + valorTotal + ", itemPromoconal=" + itemPromoconal + '}';
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Boolean getItemPromoconal() {
        return itemPromoconal;
    }

    public void setItemPromoconal(Boolean itemPromoconal) {
        this.itemPromoconal = itemPromoconal;
    }
}
