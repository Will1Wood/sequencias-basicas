import java.util.*;

public class NumDobroTercaparte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double tercaparte = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + tercaparte);
    }
}
