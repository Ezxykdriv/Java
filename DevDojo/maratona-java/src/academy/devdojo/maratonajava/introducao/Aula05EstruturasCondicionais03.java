package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6000;

        //Operador ternário -> (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 reais" : "Ainda não tenho condições, mas terei!";

        System.out.println(resultado);
    }
}
