package academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Kuririn";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{2500, 3500, 4500};

        funcionario.imprima();
    }
}