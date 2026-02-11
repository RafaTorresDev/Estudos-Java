public class Main{
    public static void main(String[] args){
        Aluno a = new Aluno("Rafael", 7.5, 8);

        a.exibirStatus();
        a.atualizarNota1(3);
        a.atualizarNota2(1);
        a.exibirStatus();
    }
}