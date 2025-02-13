import java.util.Scanner;

public class PrimeNumber {
    private int number;

    // Constructor to initialize the number and check for prime
    public PrimeNumber(int num) {
        this.number = num;
        if (isPrime()) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if the number is prime
    private boolean isPrime() {
        if (number < 2) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Optimized check
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        new PrimeNumber(num); // Object creation triggers constructor
    }
}
