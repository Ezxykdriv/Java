package academy.devdojo.maratonajava.javacore.Aula10IntroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double media;
    private double[] salarios = new double[3];

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

        for (double sal : salarios) {
            media += sal;
        }
        media /= salarios.length;
        System.out.println("A media salarial é: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}