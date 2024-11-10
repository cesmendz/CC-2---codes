public class StockInventory {
    public static void main(String[] ces) {
        
        // Initializing the Arrays "stock" for the stocks ; "price" for the prices of the items stocked
        int[] stock = new int[10];
        double[] price = new double[10];
        
        // Assigning values to stock array.
        stock [0]= 55;  
        stock [1]= 25;
        stock [2]= 35;
        stock [3]= 60;
        stock [4]= 80;
        stock [5]= 45;
        stock [6]= 88;
        stock [7]= 60;
        stock [8]= 70;
        stock [9]= 65;
        
        //Assigning values to the price array
        price [0]= 35.50;
        price [1]= 25.75;
        price [2]= 75.50;
        price [3]= 65.25;
        price [4]= 85.60;
        price [5]= 75.75;
        price [6]= 95.25;
        price [7]= 80.69;
        price [8]= 45.75;
        price [9]= 38.99;
        
        //For output or display (this will be printed)
          //Also for calculating the total value per stocked items
        String product;
        for (int i = 0; i < stock.length; i++) {
            int ii = i + 1;
            double total = stock[i]*price[i];
            
        // To determine Stock Levels of each product 
        String stocklevel;
            if (stock[i] <= 50) {
                stocklevel = "Low (Needs restocking immediately)";
            } else if (stock[i] > 50 && stock[i] <= 60) {
                stocklevel = "Mid (Might need restocking soon)";
            } else {
                stocklevel = "High (Enough)";
            }
            product = "Product "+ii+": "+"Stock Level: "+stocklevel+"\n\tStock: "+stock[i]+"\n\tPrice: PHP "+price[i]+"\n\tTotal Value: PHP "+total;
            System.out.println(product);
        }
        // This calculates the total value of ALL the stocked items
        double totalvalue = 0;
        for (int i = 0; i < stock.length; i++) {
            totalvalue += stock[i]*price[i];
        }
        // This calculates the total number of stocked items (quantity of stocked items)
        int totalstock = 0;
        for (int i = 0; i < stock.length; i++) {
            totalstock += stock[i];
        }
        // This simply rounds up the "totalvalue"
        double totalvalueROUND = Math.round(totalvalue*100)/100;
        
        //printing of SUMMARY and will show the total value and total Stocked item
        System.out.println("\n");
        System.out.println("\t---------------SUMMARY--------------\n");
        System.out.println("Total Stocked Items: "+totalstock);
        System.out.println("Total Value: "+totalvalueROUND);
    }
}
