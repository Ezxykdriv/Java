package academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.test;

import academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
