//% discount
import java.util.Scanner;

public class GroceryCalculator {
  public static void main(String[] cesca) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the total purchase amount: PHP ");
    double purchaseAmount = scanner.nextDouble();

    double discount = 0;
    double finalPrice = 0;

    if (purchaseAmount < 1000) {
      // No discount
      finalPrice = purchaseAmount;
    } else if (purchaseAmount >= 1000 && purchaseAmount <= 5000) {
      // 5% discount
      discount = purchaseAmount * 0.05;
      finalPrice = purchaseAmount - discount;
    } else if (purchaseAmount > 5001 && purchaseAmount <= 10000) {
      // 10% discount
      discount = purchaseAmount * 0.10;
      finalPrice = purchaseAmount - discount;
    } else {
      // 15% discount
      discount = purchaseAmount * 0.15;
      finalPrice = purchaseAmount - discount;
    }

    System.out.println("Discount applied: " + (int) (discount / purchaseAmount * 100) + "%");
    System.out.println("Final price after discount: PHP " + finalPrice);
  }
}







//PHP discount
import java.util.Scanner;

public class GroceryCalculator {
    public static void main(String[] cesca) {
        // Create a Scanner object to input the total purchase amount
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total purchase amount
        System.out.print("Enter the total purchase amount: ");
        double totalPurchaseAmount = scanner.nextDouble();

        // Initialize variables to store the discount and final price
        double discount = 0;
        double finalPrice = 0;

        // Apply the correct discount based on the rules
        if (totalPurchaseAmount < 1000) {
            // No discount
            finalPrice = totalPurchaseAmount;
        } else if (totalPurchaseAmount >= 1000 && totalPurchaseAmount <= 5000) {
            
            // 5% discount
            discount = totalPurchaseAmount * 0.05;
            finalPrice = totalPurchaseAmount - discount;
            
        } else if (totalPurchaseAmount >= 5001 && totalPurchaseAmount <= 10000) {
            // 10% discount
            discount = totalPurchaseAmount * 0.10;
            finalPrice = totalPurchaseAmount - discount;
            
        } else {
            // 15% discount
            discount = totalPurchaseAmount * 0.15;
            finalPrice = totalPurchaseAmount - discount;
        }

        // Display the discount and the final price
        System.out.printf("Discount Applied: %.2f PHP%n", discount);
        System.out.printf("Final Price ater Discount: %.2f PHP%n", finalPrice);
    }
}
