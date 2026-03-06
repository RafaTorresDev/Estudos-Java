package Entities;

import javax.xml.namespace.QName;

public class PessoaFisica extends Pessoa{
    //atributos
    private double gastoSaude;

    //construtores
    public PessoaFisica() {
        super();
    }
    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    //get e set
    public double getGastoSaude() {
        return gastoSaude;
    }
    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    //métodos
    @Override
    public double calcularImposto() {
        if(getRendaAnual() <= 20000.0){
            if(gastoSaude > 0){
                return  (getRendaAnual() * 0.15) - (gastoSaude * 0.50);
            }
            else {
                return getRendaAnual() * 0.15;
            }
        }
        else {
            return getRendaAnual() * 0.25;
        }
    }
    @Override
    public String info(){
        return String.format("Name: %s\nAnual income: %.2f\nHealth expenditures: %.2f",
                getNome(), getRendaAnual(), getGastoSaude());


    }
}
