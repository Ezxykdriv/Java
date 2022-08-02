package academy.devdojo.maratonajava.javacore.Aula11SobrecargaDeMetodos.test;

import academy.devdojo.maratonajava.javacore.Aula11SobrecargaDeMetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();
    }
}
