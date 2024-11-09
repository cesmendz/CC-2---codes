import java.util.Scanner;
import java.util.stream.DoubleStream;

public class mendozaInvoice{
    public static void main(String[] args){

        Scanner choice = new Scanner(System.in);
        System.out.println("\"BigBoy Store\"");
        System.out.println("#1 Bakakeng");
        System.out.println("Baguio City, 2600");
        System.out.print("\nEnter your Name: ");
        String store = choice.nextLine();

        System.out.print("Enter your Cellphone Number: ");
        String address = choice.nextLine();

        System.out.println("\nList of the item you bought ");

        String[] Item = {"Peach", "Pineapple", "Guava", "Mango", "Milk", };
        double[] price = {2.50, 1.50, 2.00, 3.00, 4.00};

        double sum = DoubleStream.of(price).sum();

        int maxLengthItem = 0;
        boolean firstValue = true;

        for (String item : Item){
            maxLengthItem = (firstValue) ? item.length() : Math.max(maxLengthItem, item.length());
            firstValue = false;
        }
        
        System.out.print("==========================");
        System.out.println("\nProduct \t\t\tPrice");
        System.out.println("==========================");

        for(int i = 0; i < Item.length; i++){
            String format = "%d. %-" + Integer.toString(maxLengthItem) + "s \t$%9.2f\n";
            System.out.printf(format, i + 1, Item[i], price[i]);
        }

        System.out.println("\nTotal Price: " + sum);
        System.out.println("Hope you Enjoy Shopping with us!");
        

    }
}
