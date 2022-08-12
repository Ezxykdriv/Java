package academy.devdojo.maratonajava.javacore.Aula20ClassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.Aula20ClassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Aula20ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 5000);
        System.out.println(desenvolvedor);
    }
}
