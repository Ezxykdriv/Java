package academy.devdojo.maratonajava.javacore.Aula10IntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.Aula10IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kuririn");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{2500, 3500, 4500});

        funcionario.imprima();
    }
}