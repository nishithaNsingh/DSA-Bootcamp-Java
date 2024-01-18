import java.util.Scanner;

public class EnterX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (enter 'x' to finish):");

        while (true) {
            String input = scanner.next();

            // Check if the input is 'x' to exit the loop
            if (input.equals("x")) {
                break;
            }

            // Try to parse the input as an integer
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to finish.");
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);
        scanner.close();
    }
}
