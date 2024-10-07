import java.util.Scanner;
import java.util.Locale;

public class Esfera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        float R = scanner.nextFloat();
        double PI = 3.14159;
        double volumeEsfera = (4/3.0) * PI * Math.pow(R, 3);

        System.out.printf(Locale.US, "VOLUME = %.3f", volumeEsfera); 
        System.out.println();

        scanner.close();

    }

}