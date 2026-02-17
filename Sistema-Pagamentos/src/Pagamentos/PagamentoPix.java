package Pagamentos;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    //contrutor


    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;

    }

    @Override
    public void processarPagamento() {
        super.processarPagamento();
        System.out.printf("Pagamento de R$ %.2f realizado via Pix para chave %s\n", getValor(), chavePix);
    }
}
