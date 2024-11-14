//Final project that i pass
import java.util.Scanner;

public class WDataTracker_MFM {
    public static void main(String[] args) {
        // Number of cities and days
        final int CITIES = 3;
        final int DAYS = 7;

        // Array to store temperature data for 3 cities over 7 days
        double[][] temperatures = new double[CITIES][DAYS];

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input temperature data
        for (int i = 0; i < CITIES; i++) {
            System.out.println("Enter temperatures for City " + (i + 1) + " for 7 days:");
            for (int j = 0; j < DAYS; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = scanner.nextDouble();
            }
        }

        // Close the scanner
        scanner.close();

        // Calculate average temperature and highest temperature for each city
        for (int i = 0; i < CITIES; i++) {
            double totalTemperature = 0;
            double highestTemperature = Double.MIN_VALUE;

            for (int j = 0; j < DAYS; j++) {
                totalTemperature += temperatures[i][j];
                if (temperatures[i][j] > highestTemperature) {
                    highestTemperature = temperatures[i][j];
                }
            }

            double averageTemperature = totalTemperature / DAYS;

            // Display results
            System.out.printf("City %d - Average Temperature: %.2f, Highest Temperature: %.2f%n", 
                              (i + 1), averageTemperature, highestTemperature);
        }
    }
}


//Enhanced project or more advance
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WDataTracker_MFM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the number of cities and days from the user
        System.out.print("Enter the number of cities: ");
        int numberOfCities = scanner.nextInt();

        System.out.print("Enter the number of days: ");
        int numberOfDays = scanner.nextInt();

        //Initialize a list to store temperature data
        List<List<Double>> temperatureData = new ArrayList<>();

        //The program uses nested loops to gather temperature data from the user. 
        //For each city, it prompts the user to enter temperatures for each day, storing them in a list, 
        //which is then added to the main temperatureData list.
        for (int i = 0; i < numberOfCities; i++) {
            List<Double> cityTemperatures = new ArrayList<>();
            System.out.println("Enter temperatures for City " + (i + 1) + ":");
            for (int j = 0; j < numberOfDays; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                double temp = scanner.nextDouble();
                cityTemperatures.add(temp);
            }
            temperatureData.add(cityTemperatures);
        }

        // initialized to store the average and highest temperatures for each city.
        double[] averageTemperatures = new double[numberOfCities];
        double[] highestTemperatures = new double[numberOfCities];

        // Another nested loop calculates the average and highest temperatures for each city. 
        //The sum of temperatures is computed, and the highest temperature is determined during the same iteration.
        for (int i = 0; i < numberOfCities; i++) {
            double sum = 0;
            double highest = temperatureData.get(i).get(0);

            for (int j = 0; j < numberOfDays; j++) {
                double temp = temperatureData.get(i).get(j);
                sum += temp;
                if (temp > highest) {
                    highest = temp;
                }
            }

            // Calculate average temperature
            averageTemperatures[i] = sum / numberOfDays;

            // Store the highest temperature
            highestTemperatures[i] = highest;
        }

        //Output the results
        System.out.println("\nTemperature Summary:");
        for (int i = 0; i < numberOfCities; i++) {
            System.out.printf("City %d:%n", (i + 1));
            System.out.printf("  Average Temperature: %.2f °C%n", averageTemperatures[i]);
            System.out.printf("  Highest Temperature: %.2f °C%n", highestTemperatures[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
