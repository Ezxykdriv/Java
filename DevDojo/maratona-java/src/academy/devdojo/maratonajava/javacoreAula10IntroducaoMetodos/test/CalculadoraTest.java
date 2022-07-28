package academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        calculadora.multiplicaDoisNumeros(10, 20);

    }
}
