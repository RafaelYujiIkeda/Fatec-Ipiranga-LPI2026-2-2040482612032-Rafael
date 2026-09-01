import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer idade = null;

        System.out.println("Tentando realizar operação aritmética com Integer nulo...");

        try {

            int proximoAno = idade + 1;

            System.out.println("Idade no próximo ano: " + proximoAno);

        } catch (NullPointerException e) {

            System.out.println("Erro capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null)");

            System.out.println("Detalhe da exceção: " + e.getClass().getName());
        }

        System.out.print("Informe uma idade válida: ");
        int novaIdade = sc.nextInt();

        System.out.println("Reatribuindo valor válido para a variável...");

        idade = novaIdade;

        int proximoAno = idade + 1;

        System.out.println("Operação bem-sucedida! Idade atual: " + idade + " | Idade no próximo ano: " + proximoAno);

        sc.close();
    }
}