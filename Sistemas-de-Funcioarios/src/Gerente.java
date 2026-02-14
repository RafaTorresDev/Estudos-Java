public class Gerente  extends Funcionario{

    public Gerente(String nome, double salario){
        super(salario, nome);
    }

    @Override
    public double bonusSalario(){
        return getSalario() * 0.30;
    }
}
