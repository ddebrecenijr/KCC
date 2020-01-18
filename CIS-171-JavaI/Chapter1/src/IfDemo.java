public class IfDemo {
    public static void main(String args[]) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b)
            System.out.println("a is less than b");

        if(a == b)
            System.out.println("You won't see this");

        System.out.println();

        c = a - b; // c contains -1

        System.out.println("c contains -1");
        if (c >= 0) {
            System.out.println("c is non-negative");
        } // We should wrap if statements in curly braces, but don't have to for single line statements and is preferred
        if (c < 0) System.out.println("c is negative"); // Or keep on 1 line, but this is bad practice and hard to read.
    }
}
