import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); // Raise the digit to the power of the number of digits
            num /= 10;
        }

        return original == sum;
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length(); // Count the number of digits
    }
}
