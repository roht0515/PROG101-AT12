package angela.practices.third;

public class Square extends Rectangle {
    private int side;
    public Square(int side) {
        super(side,side);
        this.side = side;
    }

    public void drawTxt() {
        String result = "";
        for(int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++){
                result += "* ";
            }
            System.out.println(result);
            result = "";
        }
    }
}
