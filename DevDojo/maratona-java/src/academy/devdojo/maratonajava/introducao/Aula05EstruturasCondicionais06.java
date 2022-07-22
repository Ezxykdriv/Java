package academy.devdojo.maratonajava.introducao;
//Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
//considerando 1 como Domingo
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
