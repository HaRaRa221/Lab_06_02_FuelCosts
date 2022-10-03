import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gasGallon = 12;
        double fuelEfficiency = 20;
        double gasPrice = 2.50;
        double carDistance = 100;
        double totalCost;
        double totalDistance;
        String trash = "";

        System.out.println("Enter the number of gallons of gas in tank: " );

        if(in.hasNextDouble())
        {
            gasGallon = in.nextDouble();
            System.out.println("The number of gallons in your tank is: " + gasGallon);
            in.nextLine();
        }
        else
        {
            trash= in.nextLine();
            System.out.println("This is not a correct value: " + trash);
        }

        System.out.println("Enter the fuel efficiency of your car in mpg: ");

        if(in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
            System.out.println("Your car's fuel efficiency is: " + fuelEfficiency + " mpg.");
            in.nextLine();
        }
        else
        {
            trash= in.nextLine();
            System.out.println("This is not a correct value: " + trash);
        }

        System.out.println("Enter the price of gas per gallon: ");

        if(in.hasNextDouble())
        {
            gasGallon = in.nextDouble();
            System.out.println("The price of gas per gallon is: " + gasPrice);
            in.nextLine();
        }
        else
        {
            trash= in.nextLine();
            System.out.println("This is not a correct value: " + trash);
        }

        totalCost = gasPrice * carDistance;
        System.out.println("The total cost for 100 miles is: " + totalCost + " dollars.");

        totalDistance= fuelEfficiency * gasGallon;
        System.out.println("The total distance covered by car is: " + totalDistance + " miles.");
    }
}