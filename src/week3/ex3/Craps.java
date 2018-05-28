package week3.ex3;

import java.security.SecureRandom;

public class Craps {
    // create the random number generator

    private static final  SecureRandom randomNumbers = new SecureRandom();
    // create an enum for game states
    private enum Status{
        WON, LOST, CONTINUE
    };
    // Static variables
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumofDice =rollDice();

        switch (sumofDice){
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
                default:
                    gameStatus = Status.CONTINUE;

                    myPoint = sumofDice;
                    System.out.printf("Point is %d %n ", myPoint);
                    break;
        }
        while (gameStatus == Status.CONTINUE){
            sumofDice = rollDice(); //roll dice again

            if (sumofDice ==myPoint){
                gameStatus = Status.WON;

            }
            else if (sumofDice == SEVEN){
                gameStatus = Status.LOST;
            }

            if (gameStatus == Status.WON){
                System.out.printf("Player Wins!!");
            }
            else {
                System.out.printf("Player Losses!!");
            }
        }

    }

    public static int rollDice(){

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        //Display roll and sum to the user

        System.out.printf("Player rolled %d + %d =%d %n",die1,die2,sum);
        return sum;
    }
}
