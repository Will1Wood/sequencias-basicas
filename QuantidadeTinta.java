import java.util.*;

public class QuantidadeTinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();
        System.out.println("Digite a largura");
        double largura = scanner.nextDouble();

        double area = altura * largura;

        double tinta = area / 2;

        System.out.println("Área: " + area + "m^2");
        System.out.println("Tinta: " + tinta + "m^2");
    }

    
}
