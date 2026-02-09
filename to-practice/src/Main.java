import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        ContaBancaria ct = new ContaBancaria();
        ct.titular = "Rafael";
        ct.saldo = 100.00;

        ct.exibirSaldo();
        ct.depositar(50);
        ct.sacar(30);
        ct.exibirSaldo();
    }
}