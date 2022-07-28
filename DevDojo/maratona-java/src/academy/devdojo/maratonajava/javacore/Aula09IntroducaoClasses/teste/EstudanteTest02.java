package academy.devdojo.maratonajava.javacore.Aula09IntroducaoClasses.teste;

import academy.devdojo.maratonajava.javacore.Aula09IntroducaoClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante2.nome = "Sanji";
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
    }
}
