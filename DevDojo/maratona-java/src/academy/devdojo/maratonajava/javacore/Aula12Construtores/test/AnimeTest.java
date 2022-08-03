package academy.devdojo.maratonajava.javacore.Aula12Construtores.test;

import academy.devdojo.maratonajava.javacore.Aula12Construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu ", "TV", 12, "ação");
        anime.imprime();
    }
}