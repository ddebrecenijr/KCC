public class ForLoop {
    public static void main(String[] args) {

        /*
            Basic for loop;
            for( beginning criteria; ending criteria; iteration) {

            }
         */

        // int i = 0 => Start at 0
        // i < 10 =>    End at 9
        // After each execution => i = i + 1
        for (int i = 0; i < 10; i++);

        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "\tj = " + j);
        }

        int sum = 0;

        for (int i = 0; i < 5; sum += i, i++);

        System.out.println("sum is " + sum);

        // "Enhanced" for loop aka the for each loop
        String[] daysOfTheWeek = {"Sun", "Mon", "Tues", "Weds", "Thurs", "Fri", "Sat"};

        for (var day : daysOfTheWeek)
            System.out.print(day + ", ");
        System.out.println();

        // ^^^^ is equal to this:

        for(int i = 0; i < daysOfTheWeek.length; i ++)
            System.out.print(daysOfTheWeek[i] + ", ");
        System.out.println();


    }
}
