package elizabeth.practices.first;

import java.util.ArrayList;

public class Calculator4 {
    public static int add(String numbers) throws Exception {
        int result = 0;
        String[] numbersArray = {""};
        String delimiter = newDelimiter(numbers);
        String subCadena = numbers.substring(numbers.indexOf("\n")+1);
        String message = "Negatives not allowed: ";
        boolean isNegative = false;

        if (numbers.length() == 0) {
            return result;
        } else {
            if (numbers.startsWith("//")) {
                numbersArray = subCadena.split(delimiter);
            }else {
                numbersArray = numbers.split("\n|,");
            }
            for(int i = 0; i < numbersArray.length; i++){
                if (isNumeric(numbersArray[i]) && isPositive(numbersArray[i]) && Integer.parseInt(numbersArray[i] ) < 1000) {
                    result = result + Integer.parseInt(numbersArray[i]);
                }else{
                    if (isNumeric(numbersArray[i]) && !isPositive(numbersArray[i])) {
                        isNegative = true;
                        message += numbersArray[i]+",";
                    }
                }
            }
        }
        if (isNegative) {
            throw new ArithmeticException(message);
        }else {
            return result;
        }
    }

    public static boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static String newDelimiter(String cad) {
        String delimeter = "";
        String newCad = "";

        int pos = cad.indexOf("\n");
        if(cad.startsWith("//") ) {
            newCad = cad.substring(2,pos);
            delimeter = valueOfBrackets(newCad);
        }
        return delimeter;
    }

    public static String extraer(String subcad) {
        String ini = "[";
        String end = "]";
        String result = "";
        String aux = "";

        if (subcad.startsWith(ini) && subcad.endsWith("]")){
            for (int i = 1; i < subcad.length()-1; i++) {
                result += String.valueOf(subcad.charAt(i));
            }
        } else {
            for (int i = 0; i < subcad.length(); i++) {
                result += String.valueOf(subcad.charAt(i));
            }
        }
        return result;
    }
    public static String valueOfBrackets(String cad) {
        String result = "";
        String aux = " ";

        int tam = cad.length();
        if (cad.startsWith("[")) {
            for (int i = 0; i <= tam; i++) {
                int ini = cad.indexOf("[", i);
                int end = cad.indexOf("]", i);
                if (ini != -1 && end != -1) {
                    aux = cad.substring(ini, end) + "]";
                    result += "|" + "\\"+extraer(aux);
                    i = end;
                }
            }
            return result.substring(1);
        } else {
            return "\\"+cad;
        }
    }

    public static boolean isPositive(String num) {
        return (Integer.parseInt(num) >=0 );
    }
}

