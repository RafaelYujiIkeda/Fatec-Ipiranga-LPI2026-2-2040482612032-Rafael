/*-----------------------------------------------------------*
 * Disciplina: Linguagem de Programacao I                    *
 *             Prof. Verissimo                               *
 *-----------------------------------------------------------*
 * Objetivo do Programa: Representar um tabuleiro de xadrez  *
 *                       em matriz multidimensional e simular*
 *                       as movimentacoes do Xeque Pastor.   *
 * Data - 03/09/2026                                         *
 * Autor: Rafael Yuji Ikeda                                  *
 *-----------------------------------------------------------*/

public class Main {

    private static final int TAMANHO_TABULEIRO = 8;
    private static final String VAZIO = "   ";
    private static final String ORIGEM = "...";

    public static void main(String[] args) {

        String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        inicializarTabuleiro(tabuleiro);
        exibirPosicaoInicial(tabuleiro);
        executarSequenciaXequePastor(tabuleiro);
    }

    private static void inicializarTabuleiro(String[][] tabuleiro) {

        String[] pretasFileira8 = {"tP1", "cP2", "bP3", "dP4", "rP5", "bP6", "cP7", "tP8"};

        String[] peoesPretos = {"PP1", "PP2", "PP3", "PP4", "PP5", "PP6", "PP7", "PP8"};

        String[] peoesBrancos = {"PB1", "PB2", "PB3", "PB4", "PB5", "PB6", "PB7", "PB8"};

        String[] brancasFileira1 = {"TB1", "CB2", "BB3", "DB4", "RB5", "BB6", "CB7", "TB8"};

        for (int c = 0; c < TAMANHO_TABULEIRO; c++) {
            tabuleiro[0][c] = pretasFileira8[c];
            tabuleiro[1][c] = peoesPretos[c];
            tabuleiro[6][c] = peoesBrancos[c];
            tabuleiro[7][c] = brancasFileira1[c];

            for (int l = 2; l <= 5; l++) {
                tabuleiro[l][c] = VAZIO;
            }
        }
    }

    private static void exibirPosicaoInicial(String[][] tabuleiro) {
        System.out.println("------------------------------------------------");
        System.out.println("             Posicao Incial do tabuleiro");
        System.out.println("------------------------------------------------");
        System.out.println(" -a- -b- -c- -d- -e- -f- -g- -h-");
        imprimirEstadoAtual(tabuleiro);
        System.out.println();
    }

    private static void executarSequenciaXequePastor(String[][] tabuleiro) {

        System.out.println("Jogada #1\n");

        moverPeca(tabuleiro, 6, 4, 4, 4, "---------Brancas jogam e4---------");

        moverPeca(tabuleiro, 1, 4, 3, 4, "---------Pretas jogam e5---------");


        System.out.println("Jogada #2\n");

        moverPeca(tabuleiro, 7, 5, 4, 2, "---------Brancas jogam Bc4---------");

        moverPeca(tabuleiro, 0, 1, 2, 2, "---------Pretas jogam Cc6---------");

        System.out.println("Jogada #3\n");

        moverPeca(tabuleiro, 7, 3, 3, 7, "---------Brancas jogam Dh5---------");

        moverPeca(tabuleiro, 0, 6, 2, 5, "---------Pretas jogam Cf6---------");

        System.out.println("Jogada #4 (Xeque Mate)\n");

        moverPeca(tabuleiro, 3, 7, 1, 5, "---------Brancas capturam Peao PP6 em f7 e Xeque MATE (Dxf7#)---------");
    }

    private static void moverPeca(String[][] tabuleiro, int linhaOrigem, int colOrigem, int linhaDestino, int colDestino, String mensagem) {
        System.out.println(mensagem);

        tabuleiro[linhaDestino][colDestino] = tabuleiro[linhaOrigem][colOrigem];
        tabuleiro[linhaOrigem][colOrigem] = ORIGEM;

        imprimirEstadoAtual(tabuleiro);
        System.out.println();
    }

    private static void imprimirEstadoAtual(String[][] tabuleiro) {
        for (int l = 0; l < TAMANHO_TABULEIRO; l++) {

            System.out.print((TAMANHO_TABULEIRO - l));

            for (int c = 0; c < TAMANHO_TABULEIRO; c++) {
                if (tabuleiro[l][c].equals(VAZIO)) {
                    System.out.print("    ");
                } else {
                    System.out.print(" " + tabuleiro[l][c]);
                }
            }
            System.out.println();
        }
    }
}