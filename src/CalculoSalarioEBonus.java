import java.util.Scanner;
import java.util.Locale;

public class CalculoSalarioEBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String nomeVendedor = scanner.nextLine();  
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double bonus = totalVendas * 0.15;
        double remuneracao = salarioFixo + bonus;   

        System.out.println(nomeVendedor);
        System.out.printf("TOTAL = R$ %.2f", remuneracao);
        System.out.println();

        scanner.close();

    }

}