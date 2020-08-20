import java.util.Scanner;

public class Game {

    private static Scanner getUserInput = new Scanner(System.in);
    private static String[] inventory = new String[10];
    private static int inventoryIndex = -1;

    // There can only be one main in the entire project.
    // Our project here is called TextAdventure, our class is Game, they are different.
    // The main function serves to run our entire project
    public static void main(String[] args)  {
        gameStart();
        introduction();
        startRoomOptions();
    }

    private static void examineSkull() {
        // Description
        System.out.println();
        System.out.println("The skull appears to be very old and charred.");
        System.out.println("The skull is malformed, something you've not seen before.");
        System.out.println("Almost as if it was a creature entirely unknown.");
        System.out.println();

        // Make Choice
        System.out.println("What would you like to do?");
        System.out.println("1: Take the skull");
        System.out.println("2: Go Back");

        var choice = getUserInput.nextInt();

        if (choice == 1) {
            System.out.println();
            System.out.println("You take the skull.");
            System.out.println();

            inventory[++inventoryIndex] = "skull";
        }

        startingRoom();
    }

    private static void examineStones() {
        // Description
        System.out.println();
        System.out.println("Amongst some of the stones, you notice pieces of flint.");
        System.out.println();

        // If we already have a flint, just go back to starting room.
        if (checkIfExistsInInventory("flint")) {
            startingRoom();
        }

        // Make Choice
        System.out.println("What would you like to do?");
        System.out.println("1: Take flint");
        System.out.println("2: Go Back");

        var choice = getUserInput.nextInt();
        if (choice == 1){
            System.out.println();
            System.out.println("You take the flint.");
            System.out.println();

            inventory[++inventoryIndex] = "flint";
        }

        startingRoom();
    }

    private static void examineBranches() {
        // Description
        System.out.println();
        System.out.println("The branches appear to be very dry.");
        System.out.println();

        // If we already have a branch, just go back to starting room.
        if (checkIfExistsInInventory("branch")) {
            startingRoom();
        }

        System.out.println("What would you like to do?");
        System.out.println("1: Take branch");
        System.out.println("2: Go Back");

        var choice = getUserInput.nextInt();

        if (choice == 1) {
            System.out.println();
            System.out.println("You take the branch");
            System.out.println();

            inventory[++inventoryIndex] = "branch";
        }

        startingRoom();
    }

    private static void startingRoom() {
        System.out.println();
        System.out.println("You are in a dark room, littered with stones and branches.");
        System.out.println("There is a small amount of light shining through a small hole above.");

        if(!checkIfExistsInInventory("skull"))
            System.out.println("There is a skull atop a pile of bones.");
        System.out.println();

        startRoomOptions();
    }

    private static void startRoomOptions() {
        System.out.println("You see a door to the north.");
        System.out.println();

        System.out.println("What would you like to do?");
        System.out.println("1: Go North");
        System.out.println("2: Examine Stones");
        System.out.println("3: Examine Branches");
        if (!checkIfExistsInInventory("skull"))
            System.out.println("4: Examine Skull");
        System.out.println();

        var choice = getUserInput.nextInt();

        if(choice == 1){
            // Go North
            altarRoom();
        }
        else if(choice == 2) {
            // Examine Stones
            examineStones();
        }
        else if(choice == 3) {
            // Examine Branches
            examineBranches();
        }
        else if(choice == 4 && !checkIfExistsInInventory("skull")) {
            // Examine Skull
            examineSkull();
        }
        else{
            // Go back to room
            startingRoom();
        }
    }

    private static void altarRoom() {
        // Description
        System.out.println();
        System.out.println("You find yourself in a dark room without any visible exits.");
        System.out.println("At its center lies that which looks like an altar.");
        System.out.println();

        System.out.println("What would you like to do?");
        System.out.println("1: Examine Walls");
        System.out.println("2: Examine Altar");
        System.out.println("3: Go Back");
        System.out.println();

        var choice = getUserInput.nextInt();

        if(choice == 1){
            // Examine Walls
            examineWalls();
        }
        else if(choice == 2) {
            // Examine Altar
//            examineAltar();
        }
        else if(choice == 3) {
            // Go Back
            startingRoom();
        }
        else{
            // Go back to room
            altarRoom();
        }
    }

    private static void examineWalls() {
        // Description
        System.out.println();
        // Do we have a torch?
        if (checkIfExistsInInventory("torch")) {
            System.out.println("Upon closer inpsection, you make out a depiction that appears to look like an altar");
            System.out.println("with a skull on it.");
        }
        else {
            System.out.println("There appears to be inscriptions, but it is too dark to read.");
        }
        System.out.println();

        // Present Menu
        System.out.println("What would you like to do?");
        System.out.println("1: Go Back");

        boolean playerHasTorchMaterials =
                checkIfExistsInInventory("branch") && checkIfExistsInInventory("flint");

        if (playerHasTorchMaterials) {
            System.out.println("2: Craft a torch from branch and flint");
        }

        var choice = getUserInput.nextInt();

        if (choice == 2 && playerHasTorchMaterials) {
            // Craft a torch

            examineWalls();
        }

        altarRoom();
    }

    private static boolean checkIfExistsInInventory(String item) {
        for (int i = 0; i < inventory.length; i++) {
            if(inventory[i] == item)
                return true;
        }
        return false;
    }

    private static void craftItem(String nameOfItemToCreate, String[] materials) {
        // Check we have materials
        for (int i = 0; i < materials.length; i++) {
            if(!checkIfExistsInInventory(materials[i])) {
                return;
            }
        }

        // Remove materials from inventory
        // ["branch", "skull", "flint"] 2
        // Items 0, and 2
        // ["skull"]




        // Create Item
        // ["skull", "torch", "flint"]

    }

    private static void gameStart() {
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
