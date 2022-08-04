package academy.devdojo.maratonajava.javacore.Aula15Associacao.test;

import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
