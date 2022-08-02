package academy.devdojo.maratonajava.javacore.Aula11SobrecargaDeMetodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
