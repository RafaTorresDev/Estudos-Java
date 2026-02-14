public abstract class Funcionario {

    private String nome;
    private double salario;


    public Funcionario(){}
    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calcularBonus() {
        double percentual = 0;
        return salario * percentual;
    }

    public void exibirDados() {
        System.out.println(nome + " - Salário: " + salario);
    }

    public abstract double bonusSalario();
}




