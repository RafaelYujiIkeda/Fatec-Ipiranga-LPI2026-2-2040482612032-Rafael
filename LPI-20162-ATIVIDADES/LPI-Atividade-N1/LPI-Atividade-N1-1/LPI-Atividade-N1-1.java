import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Idade do aluno: ");
        byte idade = sc.nextByte();
        
        System.out.println("Número de faltas: ");
        short faltas = sc.nextShort();

        System.out.println("Matrícula ID: ");
        int matriculaId = sc.nextInt();

        System.out.println("Código Nacional do Estudante: ");
        long codigoNacional = sc.nextLong();

        System.out.println("Nota do Trabalho: ");
        float notaTrabalho = sc.nextFloat();

        System.out.println("Nota da Prova Final: ");
        double notaProvaFinal = sc.nextDouble();

        System.out.println("Conceito Final do Aluno: ");
        char conceitoFinal = sc.next().charAt(0);

        System.out.println("Aluno está Aprovado (true/false): ");
        boolean aprovado = sc.nextBoolean();

        System.out.println("--- Dados do Aluno Fictício --- ");
        System.out.println("Idade do Aluno: " + idade + " anos");
        System.out.println("Número de faltas: " + faltas);
        System.out.println("Matrícula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.printf("Nota do Trabalho: %f\n", notaTrabalho);
        System.out.printf("Nota da Prova Final: %f\n", notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está Aprovado? " + aprovado);
        sc.close();
    }
}
