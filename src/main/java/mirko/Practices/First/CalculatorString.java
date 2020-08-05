import java.util.ArrayList;
public class CalculatorString {
    static final int A_THOUSAND = 1000;
    private String cons;

    public CalculatorString() {
        cons = "";
    }

    public static int add(final String string) throws NotAllowNegativeNumbers {
        String input = string;
        int result = 0;
        if (input.length() > 2) {
            if ((input.charAt(0) == '/') && (input.charAt(1) == '/')) {
                input = generateNewInput(input);
            }
        }
        ArrayList<Integer> integersArray = getNumbersOfString(input);
        String errorMessage = "Negatives not allowed: ";
        for (int integ : integersArray) {
            if (integ < 0) {
                errorMessage += (integ + " ");
            } else {
                if (!isGreaterThan1000(integ)) {
                    result += integ;
                }
            }
        }
        if (errorMessage !=  "Negatives not allowed: ") {
            throw new NotAllowNegativeNumbers(errorMessage.trim());
        } else {
            return result;
        }
    }

    private static ArrayList<Integer> getNumbersOfString(final String string) {
        String input = string;
        input = input.replace('\n', ',');
        String[] stringsArray = input.split(",");
        ArrayList<Integer> integersArray = new ArrayList<Integer>();
        for (String str : stringsArray) {
            try {
                integersArray.add(Integer.parseInt(str.trim()));
            } catch (Exception e) {
                integersArray.add(0);
            }
        }
        return integersArray;
    }

    private static String generateNewInput(final String string) {
        String input = string;
        if (input.charAt(2) != '[') {
            char delimiter = input.charAt(2);
            input = input.substring(input.indexOf('\n'), input.length());
            input = input.replace(delimiter, ',');
        } else {
            ArrayList<String> delimitersArray = new ArrayList<String>();
            delimitersArray = searchDelimiters(input);
            input = input.substring(input.indexOf('\n'), input.length());
            for (String delimiter : delimitersArray) {
                input = input.replace(delimiter, ",");
            }
        }
        return input;
    }

    private static boolean isGreaterThan1000(final int number) {
        return (number > A_THOUSAND);
    }

    private static ArrayList<String> searchDelimiters(final String string) {
        String input = string;
        ArrayList<String> delimitersArray = new ArrayList<String>();
        for (int i = 2; i < input.length(); i++) {
            String newDelimiter = "";
            if (input.charAt(i) != '\n') {
                if (input.charAt(i) == '[') {
                    for (int j = i + 1; j < input.length(); j++) {
                        if (input.charAt(j) != ']') {
                            newDelimiter += input.charAt(j);
                        } else {
                            i = j;
                            break;
                        }
                    }
                    if (newDelimiter != "") {
                        delimitersArray.add(newDelimiter);
                    }
                }
            } else {
                break;
            }
        }
        return delimitersArray;
    }
}
class NotAllowNegativeNumbers extends Exception {
    NotAllowNegativeNumbers(final String errorMessage) {
        super(errorMessage);
    }
}
