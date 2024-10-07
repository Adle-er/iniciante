import java.util.Scanner;
import java.util.Locale;

public class Maior {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = scanner.nextInt();

        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        int maiorGeral = (maiorAB + s + Math.abs(maiorAB - s)) / 2;

        System.out.println(maiorGeral + " eh o maior");

        scanner.close();

    }

}