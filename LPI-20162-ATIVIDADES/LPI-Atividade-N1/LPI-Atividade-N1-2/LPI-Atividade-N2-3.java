import java.util.Scanner;

public class Main {
    public static final int codigoCorreto = 1234;
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int tentativas = 0;

        System.out.print("Informe o PIN de acesso: ");
        int pinDigitado = sc.nextInt();
        tentativas++;

        while (pinDigitado != codigoCorreto) {

            System.out.println("PIN Incorreto! Tente novamente.");
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = sc.nextInt();

            tentativas++;
        }
        System.out.print("Acesso condedido! Você utilizou " + tentativas + " tentativa(s).");
        sc.close();
    }
}
