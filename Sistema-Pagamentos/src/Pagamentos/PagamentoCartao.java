package Pagamentos;

public class PagamentoCartao extends Pagamento{
    private String numeroCartao;

    //construtor


    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        super.processarPagamento();
        System.out.printf("Pagamento de R$ %.2f realizado no cartão final %.4s\n",
                getValor(),  numeroCartao.substring(numeroCartao.length() - 4));
    }
}
