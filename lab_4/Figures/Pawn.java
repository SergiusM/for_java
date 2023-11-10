package Figures;
import java.util.Scanner;

public class Pawn extends Figure {

    private boolean isFirstStep = true;

    public Pawn(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1) {
        if (isPromotion(row1)) {
            Figure promotedFigure = choosePromotionFigure();

            return false;
        }

        if (this.isFirstStep) {
            if (((((row + 2 == row1) || (row + 1 == row1)) && this.getColor() == 'w') ||
                    (((row - 2 == row1) || (row - 1 == row1)) && this.getColor() == 'b')) && (col == col1)) {
                this.isFirstStep = false;
                return true;
            }

        } else {
            if ((((row + 1 == row1) && (this.getColor() == 'w')) || ((row - 1 == row1) && (this.getColor() == 'b'))) && (col == col1)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean canAttack(int row, int col, int row1, int col1) {
        switch (this.getColor()) {
            case 'w':
                if (Math.abs(row - row1) == 1 && Math.abs(col - col1) == 1) {
                    return true;
                }
                ;
                break;
            case 'b':
                if (Math.abs(row - row1) == 1 && Math.abs(col - col1) == 1) {
                    return true;
                }
                ;
                break;
        }

        return false;
    }

    private boolean isPromotion(int row) {
        if (this.getColor() == 'w' && row == 7) {
            return true;
        } else if (this.getColor() == 'b' && row == 0) {
            return true;
        }
        return false;
    }

    private Figure choosePromotionFigure() {
        char color = this.getColor();
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую фигуру вы хотите выбрать? (Ферзь, Ладья, Слон, Конь)");
        String figureName = scan.nextLine();

        switch (figureName.toLowerCase()) {
            case "ферзь":
                return new Queen("Ферзь", color);
            case "ладья":
                return new Rook("Ладья", color);
            case "слон":
                return new Bishop("Слон", color);
            case "конь":
                return new Knight("Конь", color);
            default:
                return new Queen("Ферзь", color);
        }
    }
}