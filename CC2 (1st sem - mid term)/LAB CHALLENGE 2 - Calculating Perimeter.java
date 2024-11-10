import java.util.Scanner;

class Perimeter {
    public static String calculatePerimeter(double length, double width) {
        double area = length*width;
        double perimeter = 2*(length+width);
        return "Area:" + area + "\nPerimeter:" + perimeter;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the Garden: ");
        double length = scanner.nextDouble();
        
        System.out.println("Enter the width of the Garden: ");
        double width = scanner.nextDouble();
        
        String result = calculatePerimeter(length,width);
        
        System.out.println(result);
    }
}



(Pre defined)
class Perimeter {
    public static void main(String[] args) {
        int length = 10;
        int width = 8;
        int area = 10*8;
        
        int perimeter = 2* area;
        
        System.out.println("The length of the garden is " + length + " meters.");
        System.out.println("The width of the garden is " + width + " meters");
        System.out.println("The area of the Garden " + area + " meters");
        System.out.println("The perimeter of the Garden " + perimeter + " meters");
    }
}
