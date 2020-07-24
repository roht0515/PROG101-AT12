package angela;

public class Calculator4 {
    private static final int LIMITE = 1000;
    private static final int POS_SUB_STRING_INI = 3;
    private static final int POS_SUB_STRING_FIN = 4;

    public Calculator4() {
    }

    public static boolean isInt(final String number) {
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isPositive(final int number) throws Exception {
        if (number >= 0) {
            return true;
        } else {
            throw new ArithmeticException("The number is negative, number is: " + number);
        }
    }

    public static String searchDelimeter(final String numbers) {
        String result = "[";
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '[') {
                result += numbers.charAt(i + 1);
            }
            if (numbers.charAt(i) == 'n') {
                return result + "]";
            }
        }
        return result;
    }

    public static int add(final String numbers) throws Exception {
        int result = 0;
        int number = 0;
        String exceptionMessage = "The number is negative, number is:";
        if (numbers.isEmpty()) {
            return result;
        } else {
            String[] numbersInt;
            String delimiter = "";
            if (numbers.matches("[//]+.*") || numbers.matches("//.*" + "\n.*")) {
                if (numbers.matches("//" + ".*" + "\n.*")) {
                    delimiter = numbers.substring(2, POS_SUB_STRING_INI);
                    String numbersNew = numbers.substring(POS_SUB_STRING_FIN);
                    numbersInt = numbersNew.split(delimiter);
                } else {
                    delimiter = searchDelimeter(numbers);
                    String numbersNew;
                    numbersNew = numbers.substring(numbers.indexOf("n") + 1);
                    numbersInt = numbersNew.split(delimiter);
                }
            } else {
                numbersInt = numbers.split("[\\\n,]");
            }
            for (int i = 0; i < numbersInt.length; i++) {
                if (isInt(numbersInt[i])) {
                    number = Integer.parseInt(numbersInt[i]);
                    try {
                        if (isPositive(number)) {
                            if (number <= LIMITE) {
                                result += number;
                            }
                        }
                    } catch (ArithmeticException e) {
                        exceptionMessage += "" + number;

                    }
                }
            }
            if (exceptionMessage != "The number is negative, number is:") {
                System.out.println(exceptionMessage);
                throw new ArithmeticException(exceptionMessage);
            }
        }
        return result;
    }
}
