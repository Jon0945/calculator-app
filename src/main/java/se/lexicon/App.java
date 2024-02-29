package se.lexicon;

import java.util.Scanner;
public class App
{
    //Scanner for keyboard input
    private static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        //Launching the app and keeping the logic outside of main function
        menuScan();
    }

    private static void printMenu() {
        // Clears the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Simple Menu
        System.out.println("............................................");
        System.out.println("...../ Simple Calculator /..................");
        System.out.println("............................................");
        System.out.println("...../ 1. Preform a simple calculation /....");
        System.out.println("...../ Q. Terminate program /...............");
        System.out.println("............................................");
        System.out.println();
        System.out.print("Make your choice: ");
    }

    private static void menuScan() {
        //Keeping the app running until manual quit is issued.
        boolean keepGoing = true;
        while (keepGoing) {
            printMenu();
            char userInput = scanner.next().charAt(0);
            switch (userInput) {
                case '1':
                    break;
                case 'Q':
                    System.out.println("Goodbye!");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("That's not a valid menu choice");
                    break;
            }
        }
    }
}
