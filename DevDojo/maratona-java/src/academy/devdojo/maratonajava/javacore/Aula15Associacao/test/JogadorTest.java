package academy.devdojo.maratonajava.javacore.Aula15Associacao.test;

import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
        Time time = new Time("Seleção Brasilseira");
        jogador1.setTime(time);
        jogador1.imprime();

        time.setJogadores(jogadores);
        System.out.println("---------Jogador--------");
        jogador1.imprime();
        System.out.println("---------Time--------");
        time.imprime();
    }
}