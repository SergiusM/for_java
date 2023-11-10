package Figures;

public class Bishop extends Figure {
    public Bishop(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1) {
        int rowDirection = Integer.compare(row1, row);
        int colDirection = Integer.compare(col1, col);


        if (Math.abs(row - row1) == Math.abs(col - col1)) {
            int currentRow = row + rowDirection;
            int currentCol = col + colDirection;
            while (currentRow != row1 && currentCol != col1) {


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