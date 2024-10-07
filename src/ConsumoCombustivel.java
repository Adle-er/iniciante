import java.util.Scanner;
import java.util.Locale;

public class ConsumoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int x;
        float y;

        x = scanner.nextInt();        
        y = scanner.nextFloat();

        scanner.close();

        float distanciaPercorrida = x / y;

        System.out.printf(Locale.US, "%.3f km/ l", distanciaPercorrida);
        System.out.println();

    }
}