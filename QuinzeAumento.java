import java.util.*;

public class QuinzeAumento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");

        double salario = scanner.nextDouble();

        double aumento = salario * 1.15;

        System.out.println("valor do salario com aumento: " + aumento);
    }
}
