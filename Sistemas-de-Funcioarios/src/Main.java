import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = List.of(
                new Funcionario(2000, "João") {
                    @Override
                    public double bonusSalario() {
                        return 0;
                    }
                },
                new Gerente("Maria", 5000),
                new Estagiario("Pedro", 1200)
        );

        for (Funcionario f : funcionarios) {
            f.exibirDados();
            System.out.println("Bônus: " + f.calcularBonus());
            System.out.println("-------------");
        }
    }
}
