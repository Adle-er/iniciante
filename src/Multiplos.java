import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if ( (A + B) % 2 == 0 ) {
            System.out.println("São múltiplos");          
        } else {
            System.out.println("Não são multiplos");
        }
        scanner.close();
    }

}