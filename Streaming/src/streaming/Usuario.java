package streaming;

public class Usuario {
    //-----------atributos------------
    private String nome;
    private String plano;

    //----------construtores-------------
    public Usuario(String nome, String plano) {
        this.nome = nome;
        this.plano = plano;
    }

    //-------------getters-------------
    public String getPlano() {
        return plano;
    }

    public String getNome() {
        return nome;
    }
    //--------metodos------------
    public void assistir(Conteudo conteudo){
        conteudo.reproduzir();
    }
    public void infoPerfil(){
        System.out.printf(" Nome: %s \n Plano: %s", nome, plano);
    }

}
