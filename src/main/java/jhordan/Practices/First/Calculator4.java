package jhordan.Practices.First;

final class  Calculator4 {
    static final int THOUSAND = 1000;
    static final int THREE = 3;
    static final int FOUR = 4;
    private Calculator4() { }
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

    public static boolean isPositive(final int num)  {
        boolean result = false;
        if (num >= 0) {
          result = true;
        }
        return result;
    }

    public static boolean isBiggerThanOneThousand(final int num)  {
        boolean result = false;
        if (num >= THOUSAND) {
            result = true;
        }
        return result;
    }

    public static boolean isNumber(final String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return  false;
        }
    }
    public static int add(final String numbers)throws  Exception {
        int result = 0;
        if (numbers.isEmpty()) {
            return result;
        } else {
            String[] numbersArray;
            String sign = "";
            if (numbers.matches("[//]+.*") || numbers.matches("//.*" + "\n.*")) {
                if (numbers.matches("//" + ".*" + "\n.*")) {
                    sign = numbers.substring(2, THREE);
                    String numbersNew = numbers.substring(FOUR);
                    numbersArray = numbersNew.split(sign);
                } else {
                    sign = getDelimiter(numbers);
                    String numbersNew;
                    numbersNew = numbers.substring(numbers.indexOf("n") + 1);
                    sign.trim();
                    numbersArray = numbersNew.split(sign);
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
