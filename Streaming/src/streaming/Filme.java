package streaming;

public class Filme extends Conteudo implements Avaliar{
    private String genero;

    public Filme(String titulo, int duracao, String genero) {
        super(titulo, duracao);
        this.genero = genero;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Reproduzin filme do genero " + genero + " ...");
    }

    @Override
    public void avaliar(int nota) {
    }
}
