package streaming;

public class Conteudo {
    //-----------atributos-------------
    private String titulo;
    private int duracao;

    //------------construtores----------------
    public Conteudo(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
    //-----------getters---------------
    public String getTitulo() {
        return titulo;
    }
    public int getDurcao() {
        return duracao;
    }
    //---------metodos---------------

    public void reproduzir(){
        System.out.println("Reproduzindo conteúdo " + titulo + " que tem a duração de " + duracao + " minutos");
    }

}
