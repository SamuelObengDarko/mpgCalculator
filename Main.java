import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //Declaration of variables
        String name;
        double milesDriven;
        double gasGallons;
        double mpg;

        //Accept user's name
        System.out.println("Enter your name:");
        name = key.nextLine();

        //Accept the miles driven
        System.out.println("Enter the miles you have driven:");
        milesDriven = key.nextDouble();

        //Accept number of gallons of gas used
        System.out.println("Enter the number of gallons of gas your car has used:");
        gasGallons = key.nextDouble();

        //Calculates miles per gallon of the car
        mpg = milesDriven / gasGallons;

        //Display the miles per gallon of the car
        System.out.println("Hello " + name + " your car has travelled " + milesDriven + " miles and has used " + gasGallons + " gallons of gas. So your car's miles per gallon is " + mpg + " mpg.");

        //System.out.println("Hello world!");
    }
}