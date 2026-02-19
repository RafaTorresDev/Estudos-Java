package Tecnicos;

public class NotificacaoSMS extends Notifiacao implements Enviavel{
    //-----------atributo----------------
    private String operadora;
    private double custo;

    //------------------construtores-------------------
    public NotificacaoSMS(String destinatario, String mensagem, double custo, String operadora) {
        super(destinatario, mensagem);
        this.custo = custo;
        this.operadora = operadora;
    }
    public NotificacaoSMS(){}

    //-------------------get e set---------------------
    public double getCusto() {
        return custo;
    }
    public String getOperadora() {
        return operadora;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    //---------------------atributos---------------------
    @Override
    public void enviar() {
        System.out.println("SMS eviando para " + getDestinatario());
    }
    @Override
    public double calcularCustos() {
        return 0.25;
    }
}
