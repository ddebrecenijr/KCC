public class WhileLoop {
    public static void main(String[] args)
        throws java.io.IOException {
        /*
            while(expression is true)
                Run me!
         */

        int i = 0;
        while(i < 10) {
            System.out.println("Value of i is " + i);
            ++i;
        }

        var isValidInput = true;
        while(isValidInput) {
            System.out.println("The value was true!");
            break;
        }


        /*
            Do-While loop

            do {
                do this
            } while(condition)
         */

        char ch;
        do {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
        } while(ch != 'q');

        /* This does the same as above, but much more inefficient!
           There is code duplication, can easily be solved by something else.
        char ch;
        System.out.println("Press a key followed by ENTER: ");
        ch = (char) System.in.read();
        while(ch != 'q') {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
        }
        */
    }
}
