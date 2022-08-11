package academy.devdojo.maratonajava.javacore.Aula18ModificadorFinal.test;

import academy.devdojo.maratonajava.javacore.Aula18ModificadorFinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Aula18ModificadorFinal.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
