import java.util.Scanner;
import java.util.Locale;

public class CalculoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int codPeca1 = scanner.nextInt();
        int quantPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();
        int codPeca2 = scanner.nextInt();
        int quantPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();
        
        double valorTotal = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);

        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f%n", valorTotal);

        scanner.close();

    }

}