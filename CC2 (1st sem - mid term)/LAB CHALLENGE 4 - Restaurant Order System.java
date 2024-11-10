import java.util.Scanner;

public class RestaurantOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Display Menu
        System.out.println("MENU");
        System.out.println("1. Burger  -  PHP 100");
        System.out.println("2. Fries  -  PHP 50");
        System.out.println("3. Soda  -  PHP 30");
        System.out.println("4. Ice Cream Burger  -  PHP 45");
        System.out.println("5. Exit");
        
        //Get user input for menu selection
        System.out.println("Enter the menu number of your choice: ");
        int menuItem = scanner.nextInt();
        
        //Process user selection using switch statement
        double totalBill = 0;
        switch (menuItem) {
            case 1:
                System.out.println("Enter the Quantity: ");
                int burgerQuantity = scanner.nextInt();
                System.out.println("You ordered Burger. ");
                totalBill = burgerQuantity * 100;
                break;
                
            case 2:
                System.out.println("Enter the Quantity: ");
                int friesQuantity = scanner.nextInt();
                System.out.println("You ordered Fries. ");
                totalBill = friesQuantity * 50;
                break;
                
            case 3:
                System.out.println("Enter the Quantity: ");
                int sodaQuantity = scanner.nextInt();
                System.out.println("You ordered Soda. ");
                totalBill = sodaQuantity * 30; 
                break;
                
            case 4:
                System.out.println("Enter the quantity: ");
                int iceCreamQuantity = scanner.nextInt();
                System.out.println("You ordered Ice Cream. ");
                totalBill = iceCreamQuantity * 45;
                break;
                
            case 5:
                System.out.println("Exiting the program.");
                return;
                
            default:
            System.out.println("Invalid menu Item number.");
            return;
        }
        
        //Display total Bill
        System.out.println("Total Amount: PHP " + totalBill);
        
    }
}
