public class Personagem {
    String nome;
    int vida;
    int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Personagem(){}


    void atacar(Personagem inimigo){
        inimigo.vida -= this.ataque;
        System.out.println(nome + " atacou " + inimigo.nome + " e causou " + ataque + " de dano");
    }


    void tomarDano(int dano, String inimigo){
        if(vida > dano){
            vida -= dano;
            System.out.println(inimigo + " atacou " + nome + " e causou " + dano + " de dano");
        }
        else{
            System.out.println(nome + " morreu");
            System.out.println("GAME OVER");
        }
    }

    void exibirStatus(){
        System.out.println("nome: " + nome);
        System.out.println("Vida atual: " + vida);
        System.out.println("Força atual: " + ataque);
    }
    boolean estarVivo(){
        if(vida > 0){
            return true;
        }
        else{
            return false;
        }
    }

    void quebraDeLinha() throws InterruptedException {
        System.out.println("==================================");
        Thread.sleep(1500);
    }



}
