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
                    calcInput();
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
    private static void calcInput() {
        //Asking for user input
        double calcResult;
        System.out.print("Enter Input 1: ");
        double userInput1 = scanner.nextDouble();
        System.out.print("Enter Operator ( + - * / ) : ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter Input 2: ");
        double userInput2 = scanner.nextDouble();
        //Preforming the correct operation
        switch (operator) {
            case '+':
                calcResult = addition(userInput1, userInput2);
                displayResult(calcResult);
                break;
            case '-':
                calcResult = subtraction(userInput1, userInput2);
                displayResult(calcResult);
                break;
            case '*':
                calcResult = multiplication(userInput1, userInput2);
                displayResult(calcResult);
                break;
            case '/':
                calcResult = division(userInput1, userInput2);
                displayResult(calcResult);
                break;
            default:
                System.out.println("I don't recognize the operator you used");
                menuScan();
                break;
        }
    }
    private static void displayResult(double result) {
        //Display the Result
        System.out.println("The answer is: "+ result);
    }

    //Mathematical Methods
    public static double addition(double selection1, double selection2) {return selection1 + selection2;}
    public static double subtraction(double selection1, double selection2) {
        return selection1 - selection2;
    }
    public static double multiplication(double selection1, double selection2) {
        return selection1 * selection2;
    }
    public static double division(double selection1, double selection2) { return selection1 / selection2;}




}
