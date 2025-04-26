import java.util.*;

public class ConversorDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double distancia = scanner.nextDouble();

        System.out.println(" A distância de " + distancia + " corresponde a: ");

        double kilometro = distancia / 1000;
        double Hectometro = distancia / 100;
        double decametro = distancia / 10;
        double decimetro = distancia * 10;
        double cintimetro = distancia * 100;
        double milimetro = distancia * 1000;

        System.out.println(kilometro + "Km");
        System.out.println(Hectometro + "Hm");
        System.out.println(decametro + "Dam");
        System.out.println(decimetro + "dm");
        System.out.println(cintimetro + "cm");
        System.out.println(milimetro + "mm");
    }
}
