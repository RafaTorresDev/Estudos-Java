package Entities;

public abstract class Pessoa {
    //atributos
    private String nome;
    private double rendaAnual;

    //construtores
    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    public Pessoa(){}

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    //métodos
    public abstract double calcularImposto();

    public abstract String info();
}
