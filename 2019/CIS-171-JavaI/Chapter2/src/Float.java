public class Float {
    /*
        Use the Pythagorean theorem to find the length of the
        hypotenuse given the lengths of the two opposite sides.
     */
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;
        z = Math.sqrt(x*x + y*y);   // Make note of the usage of a new Package Math!

        System.out.println("Hypotenuse is " + z);
    }
}
