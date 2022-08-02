package academy.devdojo.maratonajava.javacore.Aula10IntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.Aula10IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        //parametros
        calculadora.multiplicaDoisNumeros(10, 20.5f);

        //retorno
        double result =  calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("-----------------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);

        //Parâmetros tipo primitivo
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro CalculadoraTest");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

        //Parâmetros tipo referência
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
