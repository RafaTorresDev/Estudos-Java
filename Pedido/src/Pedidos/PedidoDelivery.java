package Pedidos;

public class PedidoDelivery extends Pedido{
    private double taxaEntrega;

    //construtor
    public PedidoDelivery(double taxaEntrega){
        this.taxaEntrega = taxaEntrega;
    }
    public PedidoDelivery(){}

    //getter


    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    @Override
    public double calcularItemTotal() {
        return super.calcularItemTotal();


    }

    public double calcularItemTotal() {
        double total = super.calcularItemTotal();
        return total + taxaEntrega;
    }
}
