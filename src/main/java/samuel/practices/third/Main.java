package samuel.practices.third;

import java.util.ArrayList;

class Main {
	public static void main(String[] args) {

        Queen queenWhite = new Queen(Figure.WHITE);
        Castle castleWhiteA = new Castle(Figure.WHITE);
        Castle castleWhiteB = new Castle(Figure.WHITE);
        
        Queen queenBlack = new Queen(Figure.BLACK);
        Castle castleBlackA = new Castle(Figure.BLACK);
        Castle castleBlackB = new Castle(Figure.BLACK);

        ArrayList<Figure> board = new ArrayList<Figure>();
        board.add(queenWhite);
        board.add(castleWhiteA);
        board.add(castleWhiteB);
        board.add(queenBlack);
        board.add(castleBlackA);
        board.add(castleBlackB);

        for (Figure figure : board) {
            figure.whoAmI();
        }

	}
}