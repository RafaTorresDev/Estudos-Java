public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salario){
        super(salario, nome);
    }

    @Override
    public double bonusSalario(){
        return getSalario() * 0.5;
    }
}
