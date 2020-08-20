public class SwitchStatements {
    public static void main(String[] args) {

        /*
            switch(condition) {
            case 1:
                Do this thing
            case 2:
                Do that thing
            ...
            Default:
                Do this if nothing else matches
            }

         */

        String[] daysOfTheWeek = {"Sun", "Mon", "Tues", "Weds", "Thurs", "Fri", "Sat"};
        var today = "sun";


        switch(today) {
            case "Sun":
                System.out.println("Today is " + daysOfTheWeek[0]);
                break;

            case "Mon":
                System.out.println("Today is " + daysOfTheWeek[1]);
                break;

            case "Tues":
                System.out.println("Today is " + daysOfTheWeek[2]);
                break;

            case "Weds":
                System.out.println("Today is " + daysOfTheWeek[3]);
                break;

            case "Thurs":
                System.out.println("Today is " + daysOfTheWeek[4]);
                break;

            case "Fri":
                System.out.println("Today is " + daysOfTheWeek[5]);
                break;

            case "Sat":
                System.out.println("Today is " + daysOfTheWeek[6]);
                break;

            default:
                System.out.println(today + " is not a day of the Week");
        }


    }
}
