import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Estoque inicial: ");
        int estoque = sc.nextInt();

        System.out.print("Quantidade de entrada: ");
        int qtdEntrada = sc.nextInt();

        System.out.print("Quantidade de saída 1: ");
        int qtdSaida1 = sc.nextInt();

        System.out.print("Quantidade de saída 2: ");
        int qtdSaida2 = sc.nextInt();

        System.out.print("Estoque mínimo: ");
        int estoqueMinimo = sc.nextInt();

        System.out.println("Tamanho do lote (caixa): ");
        int tamanhoLote = sc.nextInt();

        System.out.println("Estoque inicial: " + estoque + " unidades.");

        estoque += qtdEntrada;

        System.out.println("Após entrada (+" + qtdEntrada + "): " + estoque + " unidades.");

        estoque -= qtdSaida1;

        System.out.println("Após saída (-" + qtdSaida1 + "): " + estoque + " unidades.");

        estoque -= qtdSaida2;

        System.out.println("Após outra saída (-" + qtdSaida2 + "): " + estoque + " unidades.");

        System.out.println("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ")? " + (estoque < estoqueMinimo));

        int resto = estoque % tamanhoLote;

        System.out.println("Unidades fora da caixas fechadas de " + tamanhoLote + ": " + resto);

        System.out.println("O estoque está perfeitamente fracionado em caixas completa? " + (resto == 0));

        sc.close();
    }
}
