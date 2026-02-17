import Pagamentos.Pagamento;
import Pagamentos.PagamentoBoleto;
import Pagamentos.PagamentoCartao;
import Pagamentos.PagamentoPix;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Pagamento> pag = List.of(
                new PagamentoCartao(150, "116161616237213478161616"),
                new PagamentoBoleto(200, "99999.88888"),
                new PagamentoPix(20, "rafinhas2@gmail.com")
        );

        for(Pagamento p : pag){
            p.processarPagamento();
        }
    }
}