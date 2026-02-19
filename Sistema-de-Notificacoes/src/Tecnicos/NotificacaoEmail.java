package Tecnicos;

public class NotificacaoEmail extends Notifiacao implements Enviavel{
    //--------------atributo----------------------
    private String assunto;
    private double custo;

    //--------------------construtores-----------------
    public NotificacaoEmail(String destinatario, String mensagem, double custo, String assunto) {
        super(destinatario, mensagem);
        this.custo = custo;
        this.assunto = assunto;
    }
    public NotificacaoEmail(){}

    //-------------------get e set----------------
    public double getCusto() {
        return custo;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    //------------------metódos---------------------
    @Override
    public void enviar() {
        System.out.println("Email enviado para o "+ getDestinatario());
    }
    @Override
    public double calcularCustos() {
        return 0.10;
    }
}

