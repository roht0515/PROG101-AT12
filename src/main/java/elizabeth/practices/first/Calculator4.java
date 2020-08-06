package elizabeth.practices.first;

public final class Calculator4 {
    private static  final int LIMIT = 1000;

    private Calculator4() {
    }

    public static int add(final String numbers) throws Exception {
        int result = 0;
        String[] numbersArray = {""};
        final String delimiter = newDelimiter(numbers);
        final String subCadena = numbers.substring(numbers.indexOf("\n") + 1);
        String message = "Negatives not allowed: ";
        boolean isNegative = false;

        if (numbers.length() == 0) {
            return result;
        } else {
            if (numbers.startsWith("//")) {
                numbersArray = subCadena.split(delimiter);
            } else {
                numbersArray = numbers.split("\n|,");
            }
            for (int i = 0; i < numbersArray.length; i++) {
                if (isNumeric(numbersArray[i]) && isPositive(numbersArray[i])
                        && Integer.parseInt(numbersArray[i]) < LIMIT) {
                    result = result + Integer.parseInt(numbersArray[i]);
                } else {
                    if (isNumeric(numbersArray[i]) && !isPositive(numbersArray[i])) {
                        isNegative = true;
                        message += numbersArray[i] + ",";
                    }
                }
            }
        }
        if (isNegative) {
            throw new ArithmeticException(message);
        } else {
            return result;
        }
    }

    public static boolean isNumeric(final String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static String newDelimiter(final String cad) {
        String delimeter = "";
        String newCad = "";

        final int pos = cad.indexOf("\n");
        if (cad.startsWith("//")) {
            newCad = cad.substring(2, pos);
            delimeter = valueOfBrackets(newCad);
        }
        return delimeter;
    }

    public static String extraer(final String subcad) {
        final String ini = "[";
        String result = "";

        if (subcad.startsWith(ini) && subcad.endsWith("]")) {
            for (int i = 1; i < subcad.length() - 1; i++) {
                result += String.valueOf(subcad.charAt(i));
            }
        } else {
            for (int i = 0; i < subcad.length(); i++) {
                result += String.valueOf(subcad.charAt(i));
            }
        }
        return result;
    }

    public static String valueOfBrackets(final String cad) {
        String result = "";
        String aux = " ";

        final int tam = cad.length();
        if (cad.startsWith("[")) {
            for (int i = 0; i <= tam; i++) {
                final int ini = cad.indexOf("[", i);
                final int end = cad.indexOf("]", i);
                if (ini != -1 && end != -1) {
                    aux = cad.substring(ini, end) + "]";
                    result += "|" + "\\" + extraer(aux);
                    i = end;
                }
            }
            return result.substring(1);
        } else {
            return "\\" + cad;
        }
    }

    public static boolean isPositive(final String num) {
        return (Integer.parseInt(num) >= 0);
    }
}

