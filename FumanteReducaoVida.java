import java.util.*;
public class FumanteReducaoVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantidade de cigarros fumado por dia:");
        int cigarrosPorDia = scanner.nextInt();

        System.out.println("Quantidade de anos como fumante:");
        int anosDeFumante = scanner.nextInt();

        int diasPerdidoVida = ((cigarrosPorDia * 10)*(anosDeFumante*365))/1440;

        System.out.println("A quantidade de dias perdidos de vida é: " + diasPerdidoVida);


    }
}
