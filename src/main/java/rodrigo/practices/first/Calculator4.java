package rodrigo.practices.first;
public class Calculator4 {
    private static final int MAX_NUMBER = 1000;
    public static int add(final String numbers) {
        try {
            if (numbers.length() == 0) {
                return 0;
            }
            String[] numbersArray = numbers.split(",");
            int result = 0;
            for (int i = 0; i < numbersArray.length; i++) {
                if (!numbersArray[i].trim().isEmpty()) {
                    if (Integer.parseInt(numbersArray[i]) <= MAX_NUMBER) {
                        result += Integer.parseInt(numbersArray[i].trim());
                    }
                }
            }
            return result;
        } catch (Exception e) {
            throw new ArithmeticException("Error, ingreso un valor invalido");
        }
    }
    public static int add(final String numbers, final String delimiter) {
        int result = 0;
        String[] numbersArray = numbers.split(delimiter);
        for (int i = 0; i < numbersArray.length; i++) {
            if (!numbersArray[i].trim().isEmpty()) {
                result += Integer.parseInt(numbersArray[i].trim());
            }
        }
        return result;
    }
}
