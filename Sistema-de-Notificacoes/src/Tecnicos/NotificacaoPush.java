package Tecnicos;

public class NotificacaoPush extends Notifiacao implements Enviavel {
    //------------atributo------------
    private String aplicativo;
    private double custo;

    //--------------cosntrutores----------

    public NotificacaoPush(String destinatario, String mensagem, String aplicativo, double custo) {
        super(destinatario, mensagem);
        this.aplicativo = aplicativo;
        this.custo = custo;
    }
    public NotificacaoPush(){}

    //------------------get e set------------------
    public String getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(String aplicativo) {
        this.aplicativo = aplicativo;
    }

    public double getCusto() {
        return custo;
    }

    //----------------------metódos--------------------
    @Override
    public void enviar() {
        System.out.println("PUSH enviado para " + getDestinatario());
    }
    @Override
    public double calcularCustos() {
        return 0.05;
    }
}
