import java.util.Scanner;

public class rpsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = " ";
        String playerB = " ";
        String trash = " ";
        String playAgain = " ";
        boolean done = false;

        System.out.print("Player A input RPS move: ");
        playerA = in.nextLine();
        in.nextLine();
        System.out.print("Player B input RPS move: ");
        playerB = in.nextLine();
        in.nextLine();

        do {
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, it's a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock! Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors! Player A wins");
                }
            }
            else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock! Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper! It's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper! Player B wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("S")) {
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("Rock breaks Scissors! PLayer B wins!");
                }
                else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper! Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors! It's a tie!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid RPS move!");
                done =false;
            }
            System.out.print("Play again? Y/N: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")){
                done = true;
            }
            else if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
            }

        } while (!done);



    }

}
