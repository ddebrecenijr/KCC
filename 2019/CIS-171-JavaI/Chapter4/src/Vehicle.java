/*
    Java uses a class specification to construct objects.
    Those objects are instances of a class, so we can think of a class as a set
    of plans that specify how to build an object.
 */
// To make a class, we specify the 'class' keyword followed by the name of the class
public class Vehicle {
    /*
        When we define a class, we declare what its exact form and nature will be.
        We do this through the use of instance variables it will contain, and
        methods that operate on those variables.
     */
    int passengers;     // number of passengers
    int fuelTank;       // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    // Display the range
    void range() {
        System.out.println("Range is " + (fuelTank * mpg) + " miles.");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(); // The new keyword creates an instance of the vehicle class
        int range;

        // Assign some values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelTank = 16;
        minivan.mpg = 21;

        range = minivan.fuelTank * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range + " miles.");
    }
}

class TwoVehiclesDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        int rangeOfMinivan, rangeOfSportsCar;

        minivan.passengers = 7;
        minivan.fuelTank = 16;
        minivan.mpg = 21;

        sportsCar.passengers = 2;
        sportsCar.fuelTank = 14;
        sportsCar.mpg = 12;

        rangeOfMinivan = minivan.fuelTank * minivan.mpg;
        rangeOfSportsCar = sportsCar.fuelTank * sportsCar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers
                + " with a range of " + rangeOfMinivan + " miles.");
        System.out.println("SportsCar can carry " + sportsCar.passengers
                + " with a range of " + rangeOfSportsCar + " miles.");
    }
}

class AddMethod {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        int rangeOfMinivan, rangeOfSportsCar;

        minivan.passengers = 7;
        minivan.fuelTank = 16;
        minivan.mpg = 21;

        sportsCar.passengers = 2;
        sportsCar.fuelTank = 14;
        sportsCar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + " passengers.");
        minivan.range(); // Use our new fancy method to calculate this

        System.out.print("SportsCar can carry " + sportsCar.passengers + " passengers.");
        sportsCar.range();
    }
}
