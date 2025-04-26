import java.util.*;

public class CincoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");

        double valor = scanner.nextDouble();

        double desconto = valor - (valor * 1.05 - valor);

        System.out.println("O valor promocional com desconto é: " + desconto);
    }
}
