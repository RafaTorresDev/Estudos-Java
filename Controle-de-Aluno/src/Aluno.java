public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    //construtores
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        if(nota1 >= 0 && nota1 <= 10 ){
            this.nota1 = nota1;
        }
        else{
            this.nota1 = 0;
        }
        if(this.nota2 >= 0 && this.nota2 <= 10 ){
            this.nota2 = nota2;
        }
        else{
            this.nota2 = 0;
        }
    }
    public Aluno(){}

    //métodos
    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
    public void atualizarNota1(double novaNota){
        if(novaNota >= 0 && novaNota <= 10 ){
            nota1 = novaNota;
        }
        else{
            System.out.println("erro");
        }
    }
    public void atualizarNota2(double novaNota){
        if(novaNota >= 0 && novaNota <= 10 ){
            nota2 = novaNota;
        }
        else{
            System.out.println("erro");
        }
    }
    public void exibirStatus(){
        System.out.printf("Aluno: %s\nNota 1: %.2f\nNota 2: %.2f\n", nome, nota1, nota2);
        if(calcularMedia() > 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
