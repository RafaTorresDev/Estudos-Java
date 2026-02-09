public class Main{
    public static void main(String[] args) throws InterruptedException {
        Personagem personagem1 = new Personagem();

        personagem1.nome = "Rafael";
        personagem1.vida = 25;
        personagem1.ataque = 16;

        personagem1.exibirStatus();
        personagem1.quebraDeLinha();
        personagem1.atacar("Hydra", 10);
        personagem1.quebraDeLinha();
        personagem1.tomarDano(20,"Hydra");
        personagem1.quebraDeLinha();
        personagem1.exibirStatus();
        personagem1.quebraDeLinha();
        personagem1.tomarDano(5, "Hydra");


    }
}