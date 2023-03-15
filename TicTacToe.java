import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            getInput();
            updateBoard();
            printBoard();

            // if (isGameOver()) {
            //     break;
            // }

          //  switchPlayer();
        }
    }

    private static void initializeBoard() {
        // Initialize all elements of the board to a space character.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void getInput() {
        int row;
        int col;

        while (true) {
            System.out.print("Enter row (0, 1, 2) for player " + currentPlayer + ": ");
            row = scanner.nextInt();
            System.out.print("Enter column (0, 1, 2) for player " + currentPlayer + ": ");
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        board[row][col] = currentPlayer;
    }

    private static void updateBoard() {
        // Check rows for a win.
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }
        }

        // Check columns for a win.
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }
        }

    }
} 