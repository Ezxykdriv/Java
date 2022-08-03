package academy.devdojo.maratonajava.javacore.Aula11SobrecargaDeMetodos.test;

import academy.devdojo.maratonajava.javacore.Aula11SobrecargaDeMetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "ação");
        anime.imprime();
    }
}