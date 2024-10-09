import java.util.Random;
import java.util.Scanner;
public class Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.print("The numbers you rolled are " + die1 + " and " + die2 + " which adds up to " + crapsRoll + ".");
            if ((crapsRoll == 2) || (crapsRoll == 3) || (crapsRoll == 12)) {
                System.out.println(" Craps! You lost!");
            } else if ((crapsRoll == 7) || (crapsRoll == 11)) {
                System.out.println(" Natural! You won!");
            }
            else {
                System.out.println(" The point. Roll again.");
                int die = rnd.nextInt(6) + 1;
                int dieOff = die + crapsRoll;
                if (dieOff == 7){
                    System.out.println("You rolled a " + die + " which adds up to " + dieOff + " You lost!");
                }
                else {
                    System.out.println("You rolled a " + die + " which adds up to " + dieOff  + " You won!");
                }
            }
            System.out.println("Want to roll again? (yes/no)");
            String endGame = scanner.nextLine().toLowerCase();
            if (!endGame.equals("yes")) {
                System.out.println("Thanks for playing! :)");
                break;
            }
        }
    }
}