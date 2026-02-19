public class Ciruclo implements Forma{
    private double raio;

    public Ciruclo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.1415 * (raio * raio);
    }
}
