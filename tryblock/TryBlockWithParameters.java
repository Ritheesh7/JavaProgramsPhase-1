package tryblock;

public class TryBlockWithParameters {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get numerator and denominator from user input
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = divide(numerator, denominator);

            // Display the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception (division by zero)
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close resources or perform cleanup
            scanner.close();
        }
    }

    // Method to perform division
    private static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException for division by zero
            throw new ArithmeticException("Division by zero");
        }

        // Return the result of division
        return numerator / denominator;
    }
}
