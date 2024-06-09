import java.util.Scanner;

public class MainException {
    private static int[] numbers = new int[10];

    public static void main(String[] args) {
        try {
            fillArray();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    private static void fillArray() throws NegativeNumberException {
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}
