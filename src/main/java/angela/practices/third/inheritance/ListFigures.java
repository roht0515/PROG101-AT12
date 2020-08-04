package angela.practices.third.inheritance;

import java.util.*;
public class ListFigures {
    List <Figure> listFigures;
    public ListFigures(){
        listFigures = new ArrayList <Figure>();
    }
    public void addFigure(Figure figure){
        listFigures.add(figure);
    }
    public List<Figure> getList(){
        return listFigures;
    }
    public void listFigures(){
        for (Figure figure: listFigures) {
            figure.whoAmI();
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        ListFigures list = new ListFigures();
        Queen queen1 = new Queen(1);
        Queen queen2 = new Queen(2);
        Castle castle1 = new Castle(1);
        Castle castle2 = new Castle(1);
        Castle castle3 = new Castle(2);
        Castle castle4 = new Castle(2);
        list.addFigure(queen1);
        list.addFigure(queen2);
        list.addFigure(castle1);
        list.addFigure(castle2);
        list.addFigure(castle3);
        list.addFigure(castle4);
        list.listFigures();
    }
}
