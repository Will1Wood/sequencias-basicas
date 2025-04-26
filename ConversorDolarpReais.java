import java.util.*;

public class ConversorDolarpReais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dinheiro em reais: ");
        double dinheiro = scanner.nextDouble();

        double dolar = dinheiro / 3.45;

        System.out.println("Quantide de dolares que pode ser comprado é: " + dolar);
    }
}
