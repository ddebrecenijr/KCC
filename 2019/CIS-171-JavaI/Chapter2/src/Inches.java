public class Inches {
    /*
        Compute the number of cubic inches in 1 cubic mile.
     */
    public static void main(String[] args) {
        long ci;
        long im;
        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in a cubic mile.");
    }

    /*
        Type        Width in Bits       Range
        ----        -------------       -----
        byte        8                   -128 -> 127
        short       16                  -32,768 -> 32,767
        int         32                  -2,147,483,648 -> 2,147,483,647
        long        64                  -9,223,372,036,854,775 -> 9,223,372,036,854,775,807
     */
}
