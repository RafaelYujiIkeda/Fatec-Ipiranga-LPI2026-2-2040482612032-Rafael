import java.util.Scanner;

public class LPI-Atividade-N2-2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int quantidadeVendas = 0;
        double valorVenda = 0;
        double totalVendido = 0;

        System.out.print("Valor de venda (ou 0 para encerrar): ");
        valorVenda = sc.nextDouble();

        totalVendido = totalVendido + valorVenda;

        if (valorVenda == 0) {
            System.out.print ("Nenhuma venda registrada nesta sessão de caixa.");

        } else {

        while (valorVenda != 0.00) {

            System.out.print("Valor de venda (ou 0 para encerrar): ");
            valorVenda = sc.nextDouble();

            totalVendido = totalVendido + valorVenda;

            quantidadeVendas++;
        }

        double mediaVenda = totalVendido / quantidadeVendas;

        System.out.printf("Total vendido no turno: R$ %.2f\n", totalVendido);
        System.out.println("Quantidade de vendas: " + quantidadeVendas);
        System.out.printf("Valor médio por venda: R$ %.2f\n", mediaVenda);
        
        sc.close();
        }
    }
}
