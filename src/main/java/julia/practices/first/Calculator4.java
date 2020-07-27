package julia.practices.first;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator4 {

    public static int add(String numbers) throws NegativeNumbersInString {
        if (numbers.length() == 0){
            return 0;
        } else { if(haveDelimiter(numbers)) {
            return addPositiveNumbers(numbers);
        }
            if (doesNumberNegative(numbers)) {
                String messageException = messageException(numbers);
                throw new NegativeNumbersInString(messageException);
            } else {
                return addPositiveNumbers(numbers);
            }
        }
    }

    public static int addPositiveNumbers(String numbers) {
        int result = 0;
        LinkedList<Integer> positiveNumbers = new LinkedList<>();
        Matcher finderNumbers = Pattern.compile("(-)?\\d+(\\d+)?").matcher(numbers);
        while (finderNumbers.find()) {
            int smallerThan1001 = Integer.parseInt(finderNumbers.group());
            if(smallerThan1001 <= 1000 && smallerThan1001 > 0) {
                positiveNumbers.add(smallerThan1001);
            }
        }
        for(Integer number: positiveNumbers){
            result += number;
        }
        return result;
    }

    public static boolean doesNumberNegative(String numbers) {
        Matcher matNegative = Pattern.compile("-\\d+").matcher(numbers);
        boolean doesNegative = matNegative.find();
        if (doesNegative) {
            return true;
        }else {
            return  false;
        }
    }

    public static String messageException(String numbers) {
        Matcher matNegative = Pattern.compile("-\\d+").matcher(numbers);
            String message = "the negative numbers: ";
            while (matNegative.find()) {
                message = message + matNegative.group();
            }
        return message;
    }

    public static boolean haveDelimiter(String numbers) {
        if(numbers.startsWith("//")) {
            return true;
        }
        return false;
    }
}
class NegativeNumbersInString extends Exception {
    public NegativeNumbersInString(String message) {
        super(message);
    }
}