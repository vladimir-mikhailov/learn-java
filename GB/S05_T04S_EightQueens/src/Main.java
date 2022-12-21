import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[][] board = getBoard();

        int queens = 0;
        while (queens < 8) {
            if (!checkBoard(board)) {
                board = getBoard();
                queens = 0;
            } else {
                addQueen(board);
                queens++;
            }
        }

        printBoard(board);
    }

    private static char[][] getBoard() {
        char[][] board = new char[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = (i + j + 1) % 2 == 0 ? 'B' : 'W';
            }
        }
        return board;
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public static void addQueen(char[][] board) {
        int i = (int) (8 * Math.random());
        int j = (int) (8 * Math.random());
        if (board[i][j] != 'Q' && board[i][j] != '-') {
            board[i][j] = 'Q';
        } else addQueen(board);
    }

    public static boolean checkBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    disableCells(i, j, board);
                }
            }

        }
        for (char[] chars : board) {
            for (char c : chars) {
                if (c != 'Q' && c != '-') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void disableCells(int i, int j, char[][] board) {
        for (int k = 0; k < board.length; k++) {
            if (board[i][k] != 'Q') board[i][k] = '-';
            if (board[k][j] != 'Q') board[k][j] = '-';
        }
        int d11 = i;
        int d12 = j;
        while (d11 > 0 && d12 > 0) {
            d11--;
            d12--;
            if (board[d11][d12] != 'Q') board[d11][d12] = '-';
        }

        int d21 = i;
        int d22 = j;
        while (d21 < 7 && d22 < 7) {
            d21++;
            d22++;
            if (board[d21][d22] != 'Q') board[d21][d22] = '-';
        }

        int d31 = i;
        int d32 = j;
        while (d31 < 7 && d32 > 0) {
            d31++;
            d32--;
            if (board[d31][d32] != 'Q') board[d31][d32] = '-';
        }

        int d41 = i;
        int d42 = j;
        while (d41 > 0 && d42 < 7) {
            d41--;
            d42++;
            if (board[d41][d42] != 'Q') board[d41][d42] = '-';
        }


    }
}
