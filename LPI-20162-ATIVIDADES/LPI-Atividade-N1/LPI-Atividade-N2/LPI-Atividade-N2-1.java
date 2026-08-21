import java.util.Scanner;

public class LPI-Atividade-N2-1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = sc.nextInt();

        double soma = 0;
        double maiorNota = 0;

        for (int i = 0; i < quantidadeAlunos; i++){
        System.out.print("Nota do aluno: ");
        double nota = sc.nextDouble();

        while (nota <= 0){
            System.out.print("Número inválido, tente novamente: ");
            nota = sc.nextDouble();
        }

        soma = soma + nota;

        if (nota > maiorNota) {
            maiorNota = nota;
        }

        }

        System.out.println("Soma total das notas: " + soma);

        double media = soma / quantidadeAlunos;

        System.out.printf("Média da turma: %.2f\n", media);

        System.out.printf("Maior nota da turma: %.2f\n", maiorNota);

        sc.close();


    }
}