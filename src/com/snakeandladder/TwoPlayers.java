package com.snakeandladder;

public class TwoPlayers {
    public static void main(String[] args) {

        int playerPosition1 = 1;
        int playerPosition2 = 1;
        int diceRoll = 0;
        int SnakeArray[] = { 47, 62, 97 };
        int LadderArray[] = { 9, 57, 20 };
        int i = 0;

        System.out.println("Welcome to the Game of SNAKE & LADDER");
        System.out.println("Starting Position of Player1 and Player2 is 0");


       // for (playerPosition = 1; playerPosition <= 100; playerPosition++) {
            while (playerPosition1 != 100 && playerPosition2 != 100) {
                 ++i;
                double random = (double) (Math.random() * 6);
                diceRoll = (int) random;
                System.out.println("Dice Number =" + " " + diceRoll);
                playerPosition1 = playerPosition1 + diceRoll;
                playerPosition1 = playerPosition1 - 1;

            System.out.println("Current Position =" + " " + playerPosition1);

            if (playerPosition1 == 100) {
                System.out.println("CONGRATULATION!! YOU WON THE GAME.");
            }
            if (diceRoll == 0) {
                playerPosition1 = playerPosition1 - diceRoll;
                System.out.println("You have to stay on the same position!!");
            }
            if (playerPosition1 == SnakeArray[0]) {
                playerPosition1 = 5;
                System.out.println("OOPS...IT'S A SNAKE !");
                System.out.println("You are at " + playerPosition1 + " position.");

            } else if (playerPosition1 == SnakeArray[1]) {
                playerPosition1 = 37;
                System.out.println("OOPS...IT'S A SNAKE !");
                System.out.println("You are at " + playerPosition1 + " position.");

            } else if (playerPosition1 == SnakeArray[2]) {
                playerPosition1 = 32;
                System.out.println("OOPS...IT'S A SNAKE !");
                System.out.println("You are at " + playerPosition1 + " position.");

            } else if (playerPosition1 == LadderArray[0]) {
                playerPosition1 = 44;
                System.out.println("HURRAY...! YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition1 + " position.");

            } else if (playerPosition1 == LadderArray[1]) {
                playerPosition1 = 79;
                System.out.println("HURRAY...! YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition1 + " position.");

            } else if (playerPosition1 == LadderArray[2]) {
                playerPosition1 = 98;
                System.out.println("HURRAY...! YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition1 + " position.");

            } else if (playerPosition1 > 100) {
                playerPosition1 = playerPosition1 - diceRoll;
                System.out.println("YOU CAN'T JUMP, YOU MUST LAND ON A 100.");
            }
        //Player 2
                else if (playerPosition2 == 100) {
                    System.out.println("CONGRATULATION!! YOU WON THE GAME.");
                }
                else if (diceRoll == 0) {
                    playerPosition2 = playerPosition2 - diceRoll;
                    System.out.println("You have to stay on the same position!!");
                }
                else if (playerPosition2 == SnakeArray[0]) {
                    playerPosition2 = 5;
                    System.out.println("OOPS...IT'S A SNAKE !");
                    System.out.println("You are at " + playerPosition2 + " position.");

                } else if (playerPosition2 == SnakeArray[1]) {
                    playerPosition2 = 37;
                    System.out.println("OOPS...IT'S A SNAKE !");
                    System.out.println("You are at " + playerPosition2 + " position.");

                } else if (playerPosition2 == SnakeArray[2]) {
                    playerPosition2 = 32;
                    System.out.println("OOPS...IT'S A SNAKE !");
                    System.out.println("You are at " + playerPosition2 + " position.");

                } else if (playerPosition2 == LadderArray[0]) {
                    playerPosition2 = 44;
                    System.out.println("HURRAY...! YOU GOT A LADDER.");
                    System.out.println("You are at " + playerPosition2 + " position.");

                } else if (playerPosition2 == LadderArray[1]) {
                    playerPosition2 = 79;
                    System.out.println("HURRAY...! YOU GOT A LADDER.");
                    System.out.println("You are at " + playerPosition2 + " position.");

                } else if (playerPosition2 == LadderArray[2]) {
                    playerPosition2 = 98;
                    System.out.println("HURRAY...! YOU GOT A LADDER.");
                    System.out.println("You are at " + playerPosition2 + " position.");

                } else if (playerPosition2 > 100) {
                    playerPosition2 = playerPosition2 - diceRoll;
                    System.out.println("YOU CAN'T JUMP, YOU MUST LAND ON A 100.");
                }
                System.out.println("the points of 1 person is " +playerPosition1 );
                System.out.println("the points of 2 person is " + playerPosition2);
            }
        if (playerPosition1 == 100)
        {
            System.out.println("\nHooray...! Player1 is the Winner");
        }
        else if (playerPosition2 == 100)
        {
            System.out.println("\nHooray...! Player2 is the Winner");
        }
    }
}
