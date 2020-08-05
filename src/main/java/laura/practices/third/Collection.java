package laura.practices.third;

import java.util.ArrayList;

public class Collection{

    private ArrayList<Figure> figureArray;
    private static final int CANT_QUEEN = 2;
    private static final int CANT_CASTLE = 4;

    public Collection(){
        figureArray = new ArrayList<>();
    }

    public void addFigure() {
        int queen = 0;
        int castle = 0;
        if (figureArray.size()<6){
            for (Figure figure : figureArray) {
                if (figure instanceof Queen && queen<CANT_QUEEN) {
                    figureArray.add(figure);
                    queen ++; 
                } else{
                    if (figure instanceof Castle & queen<CANT_CASTLE) {
                        figureArray.add(figure);
                        castle ++;
                    }
                }
            }
        }
    }
    
}