import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[]args){
        Scanner keyboard;



        int userPicked;
        int computerNumber;
        String again;
        int computerScore;
        int playerScore;
        computerScore = 0;
        playerScore = 0;



        keyboard = new Scanner(System.in);
        do {
            System.out.println("Choose a number, 1-3 (Rock=1 Paper=2 Scissors=3.");
            System.out.println("What would you like to choose first?");
            userPicked = keyboard.nextInt();
            computerNumber = (int)(Math.random() * 3)+1;

            if (computerNumber==1){
                System.out.println("I chose rock.");
            }
            else if (computerNumber==2){
                System.out.println("I chose paper.");
            }
            else if (computerNumber==3){
                System.out.println("I chose scissors.");
            }
            again = "";


            if(userPicked==computerNumber){
                System.out.println("Aww its a tie.");
                System.out.println("No points, why would you get points for a tie?");
            }
            else if (userPicked==1 && computerNumber==2){
                System.out.println("Haha! I win!");
                computerScore +=1;
                System.out.println("I get 1 point.");

            }
            else if (userPicked==1 && computerNumber==3){
                System.out.println("Aww, you win this time.");
                playerScore +=1;
                System.out.println("You get 1 point.");
            }
            else if (userPicked==2 && computerNumber==1){
                System.out.println("Gosh, you win.");
                playerScore +=1;
                System.out.println("You get 1 point.");
            }
            else if (userPicked==2 && computerNumber==3){
                System.out.println("Haha kid, get better.");
                computerScore +=1;
                System.out.println("I get 1 point.");
            }
            else if (userPicked==3 && computerNumber==1){
                System.out.println("Why are you so bad at this?");
                computerScore +=1;
                System.out.println("I get 1 point.");
            }
            else if (userPicked==3 && computerNumber==2){
                System.out.println("Your so lucky my god.");
                playerScore +=1;
                System.out.println("You get 1 point.");
            }




            System.out.println("Your score is "+ playerScore+ " while mine is "+ computerScore+ ".");
            System.out.println("Would you like to play again? (yes or no)");
            again = keyboard.next().toLowerCase();

        }while (again.equals("yes"));
        System.out.println("Your final score is " + playerScore+".");
        System.out.println("While, my final score is "+ computerScore+".");
        if (playerScore==computerScore){
        System.out.println("It is a tie between us over all!");
        }
        else if (playerScore<computerScore){
            System.out.println("Haha, I won in the long run!");
        }
        else if (playerScore>computerScore){
            System.out.println("The only way you beat me is because you cheated.");
        }
        System.out.println("Bye nerd.");


    }
}
