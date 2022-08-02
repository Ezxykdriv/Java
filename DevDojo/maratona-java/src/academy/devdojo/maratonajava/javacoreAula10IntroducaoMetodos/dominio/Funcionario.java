package academy.devdojo.maratonajava.javacoreAula10IntroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprima() {
        if (salarios == null) {
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double sal : salarios) {
            System.out.println("salario " + sal);
        }

        media();
    }

    public void media() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double sal : salarios) {
            media += sal;
        }
        media /= salarios.length;
        System.out.println("A media salarial é: " + media);
    }
}