import java.util.Scanner;

// Parent class: Sports_Authority
class Sports_Authority {
    String authorityName;
    String contactInfo;

    // Constructor
    public Sports_Authority(String authorityName, String contactInfo) {
        this.authorityName = authorityName;
        this.contactInfo = contactInfo;
    }

    public void displayAuthorityDetails() {
        System.out.println("Authority Name: " + authorityName);
        System.out.println("Contact Info: " + contactInfo);
    }
}

// Child class: Sports_Category
class Sports_Category extends Sports_Authority {
    String categoryName;

    // Constructor overloading
    public Sports_Category(String authorityName, String contactInfo, String categoryName) {
        super(authorityName, contactInfo);
        this.categoryName = categoryName;
    }

    public void displayCategoryDetails() {
        System.out.println("Category Name: " + categoryName);
    }
}

// Child class: Player_Details
class Player_Details extends Sports_Category {
    String playerName;
    int playerAge;

    // Constructor overloading
    public Player_Details(String authorityName, String contactInfo, String categoryName, String playerName, int playerAge) {
        super(authorityName, contactInfo, categoryName);
        this.playerName = playerName;
        this.playerAge = playerAge;
    }

    public void displayPlayerDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Age: " + playerAge);
    }
}

// Child class: Award_List
class Award_List extends Player_Details {
    String awardName;
    int year;

    // Constructor overloading
    public Award_List(String authorityName, String contactInfo, String categoryName, String playerName, int playerAge, String awardName, int year) {
        super(authorityName, contactInfo, categoryName, playerName, playerAge);
        this.awardName = awardName;
        this.year = year;
    }

    public void displayAwardDetails() {
        System.out.println("Award Name: " + awardName);
        System.out.println("Year: " + year);
    }
}

public class SportsAwardManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Sports Authority Name: ");
        String authorityName = scanner.nextLine();

        System.out.print("Enter Contact Info: ");
        String contactInfo = scanner.nextLine();

        System.out.print("Enter Sports Category Name: ");
        String categoryName = scanner.nextLine();

        System.out.print("Enter Player Name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter Player Age: ");
        int playerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter Award Name: ");
        String awardName = scanner.nextLine();

        System.out.print("Enter Year of Award: ");
        int year = scanner.nextInt();

        // Create an Award_List object
        Award_List award = new Award_List(authorityName, contactInfo, categoryName, playerName, playerAge, awardName, year);

        // Display all details
        System.out.println("\n=== Sports Award Management Details ===");
        award.displayAuthorityDetails();
        award.displayCategoryDetails();
        award.displayPlayerDetails();
        award.displayAwardDetails();

        scanner.close();
    }
}

