import java.util.Scanner;

public class HorasJogadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int duracaoDia = 24;
        int horasJogadas =  duracaoDia - (horaInicial - horaFinal);

        System.out.println("O JOGO DUROU " + horasJogadas + " HORA(S)");
        
        scanner.close();
    }

}