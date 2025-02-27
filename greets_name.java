
import java.util.Scanner;

public class greets_name {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

    }
}
