package academy.devdojo.maratonajava.javacore.Aula09IntroducaoClasses.teste;

import academy.devdojo.maratonajava.javacore.Aula09IntroducaoClasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
