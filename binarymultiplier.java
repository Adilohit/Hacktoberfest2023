import java.util.Scanner;

public class BinaryMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two 4-bit binary numbers
        System.out.print("Enter the first 4-bit binary number: ");
        String binaryNum1 = scanner.next();
        System.out.print("Enter the second 4-bit binary number: ");
        String binaryNum2 = scanner.next();

        // Check if the input strings are exactly 4 characters long
        if (binaryNum1.length() != 4 || binaryNum2.length() != 4) {
            System.out.println("Please enter 4-bit binary numbers.");
            return;
        }

        // Convert the binary strings to integers
        int num1 = Integer.parseInt(binaryNum1, 2);
        int num2 = Integer.parseInt(binaryNum2, 2);

        // Perform the binary multiplication
        int result = num1 * num2;

        // Convert the result back to a 4-bit binary string
        String binaryResult = Integer.toBinaryString(result);

        // Pad with leading zeros if necessary
        while (binaryResult.length() < 4) {
            binaryResult = "0" + binaryResult;
        }

        // Display the result
        System.out.println("Binary Result: " + binaryResult);
        System.out.println("Decimal Result: " + result);

        scanner.close();
    }
}
