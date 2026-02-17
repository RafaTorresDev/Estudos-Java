package Pagamentos;

public class Pagamento {
    private double valor;

    //construtores
    public Pagamento(double valor) {
        this.valor = valor;
    }

    public Pagamento() {
    }

    //get
    public double getValor() {
        return valor;
    }

    //metódos
    public void processarPagamento(){
        System.out.printf("Processando pagamento...", valor);
    }
}
