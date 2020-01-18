public class Example2 {
    public static void main(String args[]) {
        int var1;   // This declares a variable of type 'int'
        int var2;   // This declares another variable of type 'int'

        var1 = 1024; // This assigns the number 1024 to var1

        System.out.println("var1 contains " + var1);

        var2 = var1 / 2; // Assign var2 to var1 divided by 2

        System.out.print("var2 contains var1 / 2: "); // Notice that print will not move its pointer to a new line
        System.out.println(var2);
    }
}
