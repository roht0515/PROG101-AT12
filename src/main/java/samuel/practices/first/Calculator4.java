package samuel.practices.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator4 {

    private String erros;

    public Calculator4() {
        erros = "";
    }

    /**
     * @return The sum of numbers
     */
    public int add(final String numbers) {
        int result = 0;

        if (numbers.length() == 0) {
            return result;
        }

        if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
            result =  delimiterCustom(numbers);
        } else {
            result = onlyNumbers(numbers);
        }


        return result;
    }
    /**
     * @return ArithmeticException in case of the errors
     */
    public boolean isValid() {
        if (erros.length() > 0) {
            throw new ArithmeticException(erros);
        }
        return true;
    }

    private int onlyNumbers(final String numbers) {
        int result = 0;
        String reg = "[-0-9]*\\d";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(numbers);
        int number =  0;

        while (m.find()) {
            number = Integer.parseInt(m.group());
            if (isNumberPositive(number)) {
                result += number;
            }
        }

        return result;
    }

    private int delimiterCustom(final String numbers) {
        int result = 0;
        int beginDelimiter = 2;
        int endDelimiter = endDelimiter(numbers);

        String delimiter = getDelimiter(numbers, beginDelimiter, endDelimiter);

        String numberClean = numbers.substring(endDelimiter + 1, numbers.length());
        String[] numberArray = numberClean.split(delimiter);

        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = Integer.parseInt(numberArray[i]);
            if (isNumberPositive(number)) {
                result += number;
            }
        }
        return result;
    }

    private String getDelimiter(final String numbers, final int beginDelimiter, final int newlinePosition) {
        String delimiter = numbers.substring(beginDelimiter, newlinePosition);

        if (delimiter.charAt(0) == '.') {
            return "\\" + delimiter;
        }

        return delimiter;
    }

    private int endDelimiter(final String numbers) {
        int end = 0;
        for (int i = 2; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '\n') {
                end = i;
                break;
            }
        }
        return end;
    }

    private boolean isNumberPositive(final int number) {

        if (number > 0) {
            return true;
        } else {
            addException(number);
            return false;
        }
    }

    private void addException(final int number) {
        if (this.erros.length() == 0) {
            this.erros =  "The number is negative: " + number;
        } else {
            this.erros =  this.erros + "\n" + "The number is negative: " + number;
        }
    }
}
