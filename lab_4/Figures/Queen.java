package Figures;

public class Queen extends Figure {
    public Queen(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1) {
        int rowDirection = Integer.compare(row1, row);
        int colDirection = Integer.compare(col1, col);

        // Check if the move is along a straight line (horizontal, vertical, or diagonal)
        if ((row == row1 && col != col1) || (row != row1 && col == col1) || (Math.abs(row - row1) == Math.abs(col - col1))) {
            // Check for obstacles along the path
            int currentRow = row + rowDirection;
            int currentCol = col + colDirection;
            while (currentRow != row1 || currentCol != col1) {
                // Check if the current square is occupied
                if (currentRow >= 0 && currentRow < 8 && currentCol >= 0 && currentCol < 8) {
                    // Obstacle found, cannot move
                    return false;
                }
                currentRow += rowDirection;
                currentCol += colDirection;
            }
            return true;
        }

        return false;
    }

    @Override
    public boolean canAttack(int row, int col, int row1, int col1) {
        return this.canMove(row, col, row1, col1);
    }
}