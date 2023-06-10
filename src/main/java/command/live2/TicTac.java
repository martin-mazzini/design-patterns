package command.live2;

public class TicTac {
    private char[][] board;

    public TicTac() {
        board = new char[3][3];
        initializeBoard();
    }

    // Set/Reset the board back to all empty values.
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current board
    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
        System.out.println();
        System.out.println();
    }

    // Places a mark at the cell specified by row and col with the mark of the provided player.
    public boolean placeMark(int row, int col, char playerMark) {
        // Check if the row and column are in bounds
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = playerMark;
                    return true;
                }
            }
        }
        return false;
    }
}



