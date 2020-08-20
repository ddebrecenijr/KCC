import java.util.Scanner;

public class GallonsToLiters {
    public static void main(String args[]) {
        double gallons;
        double liters;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of gallons to convert: ");
        gallons = scanner.nextDouble();

        liters = gallons * 3.7854;

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
