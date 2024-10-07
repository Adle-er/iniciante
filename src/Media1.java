import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double media = (A * 0.35 + B * 0.75) / (0.35 + 0.75);

        scanner.close();

        System.out.printf("MEDIA = %.5f%n" , media);
    }
}
