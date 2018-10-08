import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[]args){
        Scanner keyboard;


        int paper;
        int rock;
        int scissors;
        String userPicked;
        int computerNumber;
        String again;
        rock=1;
        paper=2;
        scissors=3;


        keyboard = new Scanner(System.in);
        do {
            System.out.println("Choose a number, 1-3 (Rock=1 Paper=2 Scissors=3.");
            System.out.println("What would you like to choose first?");
            userPicked = keyboard.nextLine();
            computerNumber = (int)(Math.random() * 3)+1;
            System.out.println(computerNumber);
            again = "";

            if





            System.out.println("Would you like to play again?");
            again = keyboard.next().toLowerCase();

        }while (again.equals("yes"));
        System.out.println("Oh well I didn't like you anyways.");


    }
}
