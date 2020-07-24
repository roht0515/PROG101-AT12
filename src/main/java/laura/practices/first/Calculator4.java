package laura.practices.first;

public class Calculator4 {

    public static int add(String numbers) {
        if (numbers.length() == 0){
            return 0;
        }
        int result = 0;
        String [] numbersArray = numbers.split("[,\\s]");
        for (String s : numbersArray){
            if (s.length() != 0){
                if (Integer.parseInt(s)> 0){
                    result = result + Integer.parseInt(s);
                } else {
                    break;
                }
            }
        }
        return result;
    }
    public boolean isNegativeNumber(int number) throws NumberFormatException{
        if (number< 0){
            return true;
        } else {
            throw new NumberFormatException("negatives not allowed: "+number);
        }
    }
}
