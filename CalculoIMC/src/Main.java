import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("===============");
        System.out.println("CALCULADORA IMC" );
        System.out.println("===============");

        Thread.sleep(1000);

        System.out.println("Escreva sua altura (m): ");
        double altura = sc.nextDouble();
        System.out.println("Escreva seu peso (kg): ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        Thread.sleep(2000);

        String resultado = CalculoIMCC.classificarIMC(imc);

        System.out.printf("IMC: %.2f -> %s%n", imc, resultado);

    }
}