public class IfStatements {
    public static void main(String[] args)  {

        /*
            if (condition is true)
                run this
            else
                run that
         */

        if(false)
            System.out.println("a");

        else if (true)
            System.out.println("b");

        else {
            System.out.println("d");
            System.out.println("c");
        }


        boolean isTrue = false;
        int x, y, z;
        x = y = 100;
        z = 15;

        if (x == y) {
            System.out.println("x == y");
        }

        if ((z < y) && isTrue){
            System.out.println("(z < y) && isTrue == true");
        }

        if (!(x < y) && !isTrue) {
            System.out.println("(x < y) == false and isTrue == false");
        }


    }

}
