import java.util.Scanner;

public class Game {

    private static Scanner getUserInput = new Scanner(System.in);
    private static String[] inventory = new String[10];
    private static int inventoryIndex = -1;

    // There can only be one main in the entire project.
    // Our project here is called TextAdventure, our class is Game, they are different.
    // The main function serves to run our entire project
    public static void main(String[] args)  {
        start();
        introduction();

        System.out.println("You see a door to the north.");
        System.out.println();

        System.out.println("What would you like to do?");
        System.out.println("1: Go North");
        System.out.println("2: Examine Skull");
        System.out.println("3: Examine Stones");
        System.out.println("4: Examine Branches");
        System.out.println();

        var choice = getUserInput.nextInt();

        if(choice == 1){
            // Go North
        }
        else if(choice == 2) {
            // Examine Skull
            examineSkull();
        }
        else if(choice == 3) {
            // Examine Stones
        }
        else if(choice == 4) {
            // Examine Branches
        }
        else{
            // Go back to room
        }











    }

    private static void examineSkull() {
        System.out.println();
        System.out.println("The skull appears to be very old and charred.");
        System.out.println("The skull is malformed, something you've not seen before.");
        System.out.println("Almost as if it was a creature entirely unknown.");
        System.out.println();

        System.out.println("What would you like to do?");
        System.out.println("1: Take the skull");
        System.out.println("2: Go Back");

        var choice = getUserInput.nextInt();

        if (choice == 1) {
            System.out.println();
            System.out.println("You take the skull.");
            System.out.println();

            inventory[++inventoryIndex] = "skull";

            // Go back to room1
        }
    }

    private static void start() {
        System.out.println();
        System.out.println("Enter the dungeon");
        System.out.println("should you dare...");

        getUserInput.nextLine();
        System.out.println();
    }

    private static void introduction() {
        System.out.println();
        System.out.println("You awake in a dark room, littered with stones and branches.");
        System.out.println("Your head is swelling as if you've smacked it on something hard.");
        System.out.println("You notice a small amount of light shining through.");
        System.out.println("You look up and see a small hole, you must've fallen through it.");
        System.out.println("As you get up, you notice the hard object that you hit was a skull.");
        System.out.println("Probably the skull of some other poor soul, that must've fallen.");
        System.out.println();
    }


}
