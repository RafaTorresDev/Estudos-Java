package Entities;

public class PessoaJuridica extends Pessoa{
    //atributos
    private int funciQuanti;

    //construtores
    public PessoaJuridica(String nome, double rendaAnual, int funciQuanti) {
        super(nome, rendaAnual);
        this.funciQuanti = funciQuanti;
    }
    public PessoaJuridica(){super();}

    //get e set
    public int getFunciQuanti() {
        return funciQuanti;
    }
    public void setFunciQuanti(int funciQuanti) {
        this.funciQuanti = funciQuanti;
    }

    //métodos
    @Override
    public double calcularImposto() {
        if(funciQuanti > 10){
            return getRendaAnual() * 0.14;
        }
        else {
            return getRendaAnual() * 0.16;
        }
    }

    @Override
    public String info(){
        return String.format("Name: %s\nAnual income: %.2f\nNumber of employees: %d",
                getNome(), getRendaAnual(), getFunciQuanti());
    }
}
