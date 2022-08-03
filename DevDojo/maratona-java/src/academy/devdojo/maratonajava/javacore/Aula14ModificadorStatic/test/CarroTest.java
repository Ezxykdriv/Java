package academy.devdojo.maratonajava.javacore.Aula14ModificadorStatic.test;

import academy.devdojo.maratonajava.javacore.Aula14ModificadorStatic.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}