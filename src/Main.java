import java.util.*;

class Playerdetails{

    void setPlayer()

    {
        String player;
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter the player "+i+" name");
            player = sc.next();
        }


    }
}
class Gusser {

    int random(){

        Random Random_number = new Random();//generate a random number for guessing
        int right_guess = Random_number.nextInt(10);//bounds between 0 tp 10
        System.out.println("display a random number for guessing: "+right_guess);
        return right_guess;

    }
}

class Player
{
    int guessNum;

    int guessNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number between 0 to 10");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Gusser g = new Gusser();
        numFromGuesser=g.random();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All players won the game");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 & Player2 won");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 & Player3 won");
            } else {
                System.out.println("Player 1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 & Player3 won");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost Try Again!");
        }

    }
}





public class Main {
    public static void main(String[] args) {
        Playerdetails p = new Playerdetails();
        p.setPlayer();
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();


    }
}