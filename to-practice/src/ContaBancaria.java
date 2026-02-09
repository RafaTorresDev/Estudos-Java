public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor){
        saldo += valor;
    }
    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
        else{
            System.out.print("Saldo insuficiente!");
        }
    }
    void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
