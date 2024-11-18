import java.util.Scanner;
 
public class Billing {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the total amount: ");
        double totalAmount = scanner.nextDouble();
 
        System.out.println("Choose a payment method:");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. Paytm");
        System.out.println("3. GPay");
 
        int choice = scanner.nextInt();
 
        // ... payment processing logic based on choice
 
        System.out.println("Your order has been placed. Thank you for shopping with AtoZ!");
    }
}
