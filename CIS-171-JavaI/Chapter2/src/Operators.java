public class Operators {
    public static void main(String[] args){

        /*
            Add =>          + or +=
            Subtract =>     - or -=
            Divide =>       / or /=
            Multiply =>     * or *=
            Exponent =>     ** or Math.pow()

            Incrementer =>  ++      in Python is equivalent to += 1
            Decrementer =>  --      in Python is equivalent to -= 1
         */

        double i = Math.pow(10, 2);

        // Increment by 1
        for(int i = 0; i < 10; i++)
            System.out.println(i);

        // Also increment by 1
        for(int i = 0; i < 10; ++i)
            System.out.println(i);

        // Increment by 2 or more
        for(int i = 0; i < 10; i+=2)
            System.out.println(i);

    }
}
