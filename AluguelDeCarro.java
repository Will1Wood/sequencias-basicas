import java.util.*;
public class AluguelDeCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de kilometros: ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite a quantidade dias: ");
        double dias = scanner.nextDouble();

        double total = 90 * dias + 0.20 * distancia;

        System.out.println("O total a pagar pelo aluguel do carro é: " + total);
    }
}
