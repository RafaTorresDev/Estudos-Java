import Tecnicos.Enviavel;
import Tecnicos.NotificacaoEmail;
import Tecnicos.NotificacaoPush;
import Tecnicos.NotificacaoSMS;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Enviavel> notificacoes = List.of(
                new NotificacaoEmail("joao@gmail.com", "cada meu pix", 0.10, "PIX"),
                new NotificacaoSMS("LeleS2", "te amo bb", 0.25, "Claro"),
                new NotificacaoPush("FernadinhoMEC", "Meu carro quebrou", "Tinder", 0.05)
        );

        for(Enviavel a: notificacoes){
            a.enviar();
            System.out.println("Custo " + a.calcularCustos());
        }

    }
}
