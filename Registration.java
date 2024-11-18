import java.util.Scanner;
 
public class Registration {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your name (max 20 characters): ");
        String name = scanner.nextLine();
 
        System.out.print("Enter your mobile number (10 digits): ");
        String mobileNumber = scanner.nextLine();
 
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
 
        System.out.print("Enter your email ID: ");
        String email = scanner.nextLine();
 
        // Validation logic (simplified)
        if (name.length() > 20 || mobileNumber.length() != 10 || !email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid input. Please try again.");
        } else {
            System.out.println("You have been successfully registered. Welcome to AtoZ Online Application!");
        }
    }
}
