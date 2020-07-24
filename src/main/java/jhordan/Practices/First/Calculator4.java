
public class Calculator4 {



    public static String getDelimiter(final String numbers) {
        String result = "[";
        for (int count = 0; count < numbers.length(); count++) {
            if (numbers.charAt(count) == '[') {
                result += numbers.charAt(count + 1);
            }
            if (numbers.charAt(count) == 'n') {
                return result + "]";
            }
        }
        return result;
    }

    public static boolean isPositive(int num)  {
        boolean result = false;
        if (num >= 0) {
          return result = true;
        }
        return result;
    }

    public static boolean isBiggerThanOneThousand(int num)  {
        boolean result = false;
        if (num >= 1000) {
            return result = true;
        }
        return result;
    }

    public static boolean isNumber(String text) {
        try {
            Integer.parseInt(text);
            return true;
        }
        catch (NumberFormatException e) {
            return  false;
        }
    }
    
    public static int add(String numbers)throws  Exception{
        int result = 0;
        if (numbers.isEmpty()) {
            return result;
        } else {
            String[] numbersArray;
            String Sign = "";
            if (numbers.matches("[//]+.*") || numbers.matches("//.*" + "\n.*")) {
                if (numbers.matches("//" + ".*" + "\n.*")) {
                    Sign = numbers.substring(2, 3);
                    String numbersNew = numbers.substring(4);
                    numbersArray = numbersNew.split(Sign);
                } else {
                    Sign = getDelimiter(numbers);
                    String numbersNew;
                    numbersNew = numbers.substring(numbers.indexOf("n") + 1);
                    Sign.trim();
                    numbersArray = numbersNew.split(Sign);
                }
            } else {
                numbersArray = numbers.split("[\\\n,]");
            }
            for (int i = 0; i < numbersArray.length; i++) {
                if (isPositive(Integer.parseInt(numbersArray[i]))) {
                    if (!isBiggerThanOneThousand(Integer.parseInt(numbersArray[i]))) {
                        result = result + Integer.parseInt(numbersArray[i]);
                    }
                } else {
                    throw new Exception("the number is negative" + numbersArray[i]);
                }
            }
        }
        return result;
    }


}
