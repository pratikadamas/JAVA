public class pratik {
    public static void main(String[] args) {
        // Variables
        int a = 5, b = 10, c = 15;
        boolean condition1, condition2;

        // Logical AND (&&)
        condition1 = (a < b);  // true
        condition2 = (b < c);  // true
        if (condition1 && condition2) {
            System.out.println("Both conditions are true (Logical AND).");
        }

        // Logical OR (||)
        condition1 = (a > b);  // false
        condition2 = (b < c);  // true
        if (condition1 || condition2) {
            System.out.println("At least one condition is true (Logical OR).");
        }

        // Logical NOT (!)
        boolean isTrue = true;
        System.out.println("Original: " + isTrue);
        System.out.println("Negated: " + !isTrue); // Outputs the opposite of isTrue

        // Bitwise AND (&)
        condition1 = (a > b);  // false
        condition2 = (b < c);  // true
        if (condition1 & condition2) { // Both are evaluated
            System.out.println("This won't print because one condition is false (Bitwise AND).");
        }

        // Bitwise OR (|)
        if (condition1 | condition2) { // Both are evaluated
            System.out.println("One condition is true (Bitwise OR).");
        }

        // Logical XOR (^)
        boolean x = true, y = false;
        if (x ^ y) {
            System.out.println("Exactly one condition is true (Logical XOR).");
        }
    }
}
