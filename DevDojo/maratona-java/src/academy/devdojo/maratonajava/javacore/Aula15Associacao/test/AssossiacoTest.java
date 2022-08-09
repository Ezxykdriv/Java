package academy.devdojo.maratonajava.javacore.Aula15Associacao.test;

import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Aula15Associacao.dominio.Seminario;

public class AssossiacoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminário = {aluno};

        Seminario seminario = new Seminario("Onde achar o One Piece", alunosParaSeminário, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
