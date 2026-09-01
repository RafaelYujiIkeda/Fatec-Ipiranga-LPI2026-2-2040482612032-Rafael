import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de leituras: ");
        int quantidadeLeituras = sc.nextInt();

        double[] tabela = new double[quantidadeLeituras];

        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.print("Temperatura (°C): ");
            tabela[i] = sc.nextDouble();
        }

        System.out.println("--- Leituras Registradas ---");

        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.printf("Leitura [%d]: %.1f°C%n", i, tabela[i]);
        }

        System.out.println("-- Acesso Direto --");
        System.out.printf("Primeira leitura (índice 0): %.1f°C%n", tabela[0]);
        System.out.printf("Última leitura (índice %d): %.1f°C%n", quantidadeLeituras - 1, tabela[quantidadeLeituras - 1]);

        double maiorTemperatura = tabela[0];
        double menorTemperatura = tabela[0];

        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 1; i < quantidadeLeituras; i++) {

            if (tabela[i] > maiorTemperatura) {
                maiorTemperatura = tabela[i];
                indiceMaior = i;
            }

            if (tabela[i] < menorTemperatura) {
                menorTemperatura = tabela[i];
                indiceMenor = i;
            }
        }

        System.out.println("--- Busca Linear: Extremos ---");

        System.out.printf("Maior temperatura: %.1f°C (índice %d)%n", maiorTemperatura, indiceMaior);

        System.out.printf("Menor temperatura: %.1f°C (índice %d)%n", menorTemperatura, indiceMenor);

        System.out.print("Temperatura crítica de alerta (°C): ");
        double temperaturaCritica = sc.nextDouble();

        int indiceAlerta = -1;

        for (int i = 0; i < quantidadeLeituras; i++) {

            if (tabela[i] >= temperaturaCritica) {
                indiceAlerta = i;
                break;
            }
        }

        System.out.println("--- Busca Linear: Alerta ---");

        if (indiceAlerta != -1) {
            System.out.printf(
                "Alerta: temperatura crítica atingida na leitura de índice %d (%.1f°C).%n", indiceAlerta, tabela[indiceAlerta]
            );
        } else {
            System.out.println("Alerta: temperatura crítica não foi atingida.");
        }

        sc.close();
    }
}