import java.util.*;
public class SomaInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite outro valor: ");
        int numero2 =scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é igual a " + soma);
    }
}
