package Figures;

public class Rook extends Figure {
    public Rook(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1) {
        if (row == row1 || col == col1) {
            int startRow = Math.min(row, row1);
            int endRow = Math.max(row, row1);
            int startCol = Math.min(col, col1);
            int endCol = Math.max(col, col1);

            for (int i = startRow + 1; i < endRow; i++) {
                if (hasFigure(i, col)) {
                    return false;
                }
            }
            for (int j = startCol + 1; j < endCol; j++) {
                if (hasFigure(row, j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean canAttack(int row, int col, int row1, int col1) {
        return this.canMove(row, col, row1, col1);
    }

    private boolean hasFigure(int row, int col) {
        return false;
    }
}