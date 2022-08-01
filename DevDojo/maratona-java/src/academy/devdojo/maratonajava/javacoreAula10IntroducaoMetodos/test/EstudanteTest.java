package academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midorya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.sexo);
        System.out.println(estudante1.idade);
        System.out.println("--------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
