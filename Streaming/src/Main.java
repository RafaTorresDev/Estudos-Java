import streaming.Conteudo;
import streaming.Filme;
import streaming.Serie;
import streaming.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Rafael", "Vitalicio");
        Filme filme = new Filme("Interestelar", 169, "Ficção");
        Serie serie = new Serie("Welcome to the Derry", 200, 2);

        List<Conteudo> conteudo = List.of(filme, serie);

        for(Conteudo c : conteudo){
            usuario.assistir(c);
        }

        filme.avaliar(10);
        serie.avaliar(8);

        usuario.infoPerfil();

    }
}
