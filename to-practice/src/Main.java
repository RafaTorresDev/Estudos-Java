public class Main {
    public static void main(String[] args) {

        int[] numero = {5, 3, 67, 8, 1, 13, 56, 7, 53};
        int somapar = 0;
        int somaimpar = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                somapar += numero[i]; //somapar = somapar + numero[i]
            } else if (numero[i] % 2 == 1) {
                somaimpar += numero[i];
            }
        }
        System.out.println("Soma dos numeros pares: " + somapar);
        System.out.println("Soma dos numeros impares: " + somaimpar);

    }
}