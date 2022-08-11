package academy.devdojo.maratonajava.javacore.Aula19Enumeracao.dominio;

public class Cliente {
    private String nome;
    private String tipoCliente;
    private String tipoPagamento;

    public Cliente(String nome, String tipoCliente, String tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                '}';
    }
}
