package Tecnicos;

public class Notifiacao {
    //--------------atributos-----------------
    private String destinatario;
    private String mensagem;


    //-----------------construtores----------------
    public Notifiacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public Notifiacao() {}

    //-----------------get------------------
    public String getMensagem() {
        return mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

}
