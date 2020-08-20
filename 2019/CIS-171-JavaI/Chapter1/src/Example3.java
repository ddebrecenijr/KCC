public class Example3 {
    public static void main(String args[]) {
        int var; // This declares an int variable
        double x; // This declare a double variable

        var = 10; // Assign the value 10 to var
        x = 10.0; // Assign the value 10.0 to x

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // Sometimes it is helpful to print a blank line to break the flow

        // Now, divide both by 4
        var = var / 4;
        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}
