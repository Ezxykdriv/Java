package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        int idade = 13;
        String categoria = "";

        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Junevil";
        }else {
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}
