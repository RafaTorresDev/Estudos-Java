public class CalculoIMCC {
    public CalculoIMCC(double imc) {
    }

    public static String classificarIMC(double imc){
        if(imc < 18.5){
            return "Magreza";
        }
        else if(imc >= 18.6 && imc <= 24.9){
            return "Peso ideal(parabéns)";
        }
        else if(imc >= 25.0 && imc <= 29.9){
            return "Levemente acima do peso";
        }
        else if(imc >= 30.0 && imc <= 34.9){
            return "Obesidade Grau I";
        }
        else if(imc >= 35.0 && imc <= 39.9){
            return "Obesidade Grau II (severa)";
        }
        else{
            return "Obesidade Grau II (grave)";
        }
    }
}
