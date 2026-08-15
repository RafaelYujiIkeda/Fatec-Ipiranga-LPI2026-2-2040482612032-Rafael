import java.util.Scanner;

public class Main {

    static final String INSTITUICAO = "FATEC Ipiranga";
    static final int PRAZO_MAXIMO = 14;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        int diasEmprestimo = sc.nextInt();

        final int prazoCalculado = diasEmprestimo;

        System.out.println("Instituição: " + INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO + " dias");
        System.out.println("Dias calculados para devolução: " + prazoCalculado);

        sc.close();
    }
}