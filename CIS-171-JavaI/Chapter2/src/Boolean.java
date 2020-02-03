public class Boolean {
    // Demonstrates boolean values
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value controls the flow of if statements
        if(b)
            System.out.println("This is executed");

        // Relational operators, < > ! ==, results in a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
