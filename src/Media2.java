import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double media = (A * 0.2 + B * 0.3 + C * 0.5) / (0.2 + 0.3 + 0.5);

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
        
    }
}