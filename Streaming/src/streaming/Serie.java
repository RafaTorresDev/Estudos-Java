package streaming;

public class Serie extends Conteudo implements Avaliar{
    private int numeroTemporada;

    public Serie(String titulo, int duracao, int numeroTemporada) {
        super(titulo, duracao);
        this.numeroTemporada = numeroTemporada;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Reproduzindo a temporada " + numeroTemporada + " ...");
    }
    @Override
    public void avaliar(int nota) {

    }
}
