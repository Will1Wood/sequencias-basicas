import java.util.*;

public class SalarioDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias: ");
        double dias = scanner.nextDouble();

        double horas = 8;
        double valorHora = 25;

        double total = dias * horas * valorHora;

        System.out.println("O salario será : " + total);
    }
}
