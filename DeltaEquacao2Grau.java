import java.util.*;
import java.math.*;
public class DeltaEquacao2Grau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descobrir delta da equação do segundo grau!");
        System.out.println("Digite a:");
        double a = scanner.nextDouble();
        System.out.println("Digite b:");
        double b = scanner.nextDouble();
        System.out.println("Digite c:");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4*a*c;

        System.out.println("O delta da equação é: " + delta);

    }
}
