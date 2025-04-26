import java.util.*;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Sálario: ");
        double salario = scanner.nextDouble();

        System.out.println("O funcionário " + nome + " tem um salário de R$" + salario + " em junho.");
    }
}
