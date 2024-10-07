import java.util.Scanner;
import java.util.Locale;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float PI = 3.14159;
        float triangulo = a * c / 2;
        float circulo = c * PI;
        float trapezio = (a + b) * c / 2;
        float quadrado = b * b;
        


        System.out.printf(Locale.US, "Trângulo = %.3f", triangulo);


    

        scanner.close();

    }

}