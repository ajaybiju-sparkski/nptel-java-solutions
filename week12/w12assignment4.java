public class W12_P4 {

public int BOARD_START_INDEX = 0;
public int BOARD_SIZE = 9;
public int NO_VALUE = 0;
public int MIN_VALUE = 1;
public int MAX_VALUE = 9;
public int SUBSECTION_SIZE = 3;
 
private boolean solveSudoku(int[][] board) {
  return solve(board);
}
private boolean solve(int[][] board) {
    for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
        for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
            if (board[row][column] == NO_VALUE) {
                for (int k = MIN_VALUE; k <= MAX_VALUE; k++) {
                    board[row][column] = k;
                    if (isValid(board, row, column) && solve(board)) {
                        return true;
                    }
                    board[row][column] = NO_VALUE;
                }
                return false;
            }
        }
    }
    return true;
}
private boolean isValid(int[][] board, int row, int column) {
    return (rowConstraint(board, row)
      && columnConstraint(board, column) 
      && subsectionConstraint(board, row, column));
}
private boolean rowConstraint(int[][] board, int row) {
    boolean[] constraint = new boolean[BOARD_SIZE];
    for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
        if (!checkConstraint(board, row, constraint, column)) {
            return false;
        }
    }
    return true;
}
private boolean columnConstraint(int[][] board, int column) {
    boolean[] constraint = new boolean[BOARD_SIZE];
    for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
        if (!checkConstraint(board, row, constraint, column)) {
            return false;
        }
    }
    return true;
}
private boolean subsectionConstraint(int[][] board, int row, int column) {
    boolean[] constraint = new boolean[BOARD_SIZE];
    int subsectionRowStart = (row / SUBSECTION_SIZE) * SUBSECTION_SIZE;
    int subsectionRowEnd = subsectionRowStart + SUBSECTION_SIZE;
 
    int subsectionColumnStart = (column / SUBSECTION_SIZE) * SUBSECTION_SIZE;
    int subsectionColumnEnd = subsectionColumnStart + SUBSECTION_SIZE;
 
    for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
        for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
            if (!checkConstraint(board, r, constraint, c)) return false;
        }
    }
    return true;
}
boolean checkConstraint(
  int[][] board, 
  int row, 
  boolean[] constraint, 
  int column) {
    if (board[row][column] != NO_VALUE) {
        if (!constraint[board[row][column] - 1]) {
            constraint[board[row][column] - 1] = true;
        } else {
            return false;
        }
    }
    return true;
}
private void printBoard(int[][] board) {
    for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
        for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
            System.out.print(board[row][column]);
        }
      if ( row != BOARD_SIZE-1 )
        System.out.println();
    }
}

public static void main(String[] args) {
        W12_P4 solver = new W12_P4();
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        //System.out.println("Sudoku board before solving:");
        //solver.printBoard(board);

        if (solver.solveSudoku(board)) {
            //System.out.println("\nSudoku board after solving:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
