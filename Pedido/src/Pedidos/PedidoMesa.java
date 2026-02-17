package Pedidos;

public class PedidoMesa extends Pedido{
        private int numeroMesa;

        //construtores
    public PedidoMesa(int numeroMesa){
        this.numeroMesa = numeroMesa;
    }
    public PedidoMesa(){}

    //getter
    public int getNumeroMesa() {
        return numeroMesa;
    }

    @Override
    public double calcularItemTotal() {
        double total = super.calcularItemTotal();
        if(total > 200){
            total *= 0.9;

        }
        return total;
    }
}
