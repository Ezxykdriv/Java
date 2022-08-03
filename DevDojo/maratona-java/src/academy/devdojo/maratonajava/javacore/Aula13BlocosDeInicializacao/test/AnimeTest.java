package academy.devdojo.maratonajava.javacore.Aula13BlocosDeInicializacao.test;

import academy.devdojo.maratonajava.javacore.Aula13BlocosDeInicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}