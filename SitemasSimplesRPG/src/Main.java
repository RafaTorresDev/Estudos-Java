import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Personagem heroi = new Personagem("Rafael", 30, 16);
        Personagem inimgo = new Personagem("Hydra", 20, 8);

        System.out.println("SISTEMA DE RPG SIMPLES COMEÇANDO!!");
        heroi.quebraDeLinha();

        while(heroi.estarVivo() && inimgo.estarVivo()){
            System.out.println("Rafael está atacando...");
            Thread.sleep(1500);
            heroi.atacar(inimgo);
            Thread.sleep(1500);
            System.out.println("Hydra está atacando...");
            Thread.sleep(1500);
            inimgo.atacar(heroi);
            Thread.sleep(1500);
        }

        heroi.quebraDeLinha();
        heroi.exibirStatus();

        if(inimgo.vida <= 0){
            System.out.println("Vencedor Rafael!");
        }
        else{
            System.out.println("Vencedor Hydra");
        }
    }
}