package Pagamentos;

public class PagamentoBoleto extends Pagamento{
    private String codigoBarras;

    //construtor
    public PagamentoBoleto(double valor, String codigoBarras) {
        super(valor);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        super.processarPagamento();
        System.out.printf("Boleto %s gerado no valor de R$ %.2f\n", codigoBarras, getValor());
    }
}
