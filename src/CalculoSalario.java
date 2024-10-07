import java.util.Scanner;
import java.util.Locale;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();        
        double valorHora = scanner.nextDouble();
        double salario = horasTrabalhadas * valorHora;     

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
        System.out.println();


        scanner.close();

    }

}