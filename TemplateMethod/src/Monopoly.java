import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Monopoly extends Game {

    /* Implementation of necessary concrete methods */
    private boolean gameEnded = false;
    private List<Integer> players;
    private List<Integer> positions;
    private int player;


    void initializeGame() {

        System.out.println("Monopoly initialized");
        System.out.println("*********************");
        System.out.println("To win, you have to arrive to the position 24 before others using dice.");
        System.out.println("*********************");
        System.out.println("If your current position for example is 22, you need to get 2 to win,\n" +
                "otherwise, you have to throw the dice again until you get 2! ");
        System.out.println("*********************");

        players = new ArrayList<>();
        positions = new ArrayList<>();

        for(int i = 0; i< playersCount;i++){
            players.add(i);
            positions.add(0);
            System.out.println("player: " + players.get(i) + ", position: " + positions.get(i));
        }
        System.out.println("");

    }

    void makePlay(int player){

        this.player= player;
        System.out.println("player " + player +" turn");

        System.out.print("Press ENTER to throw the dice....");
        try{

            System.in.read();

        }catch(Exception e){

            e.getMessage();
        }

        Random random = new Random();
        // generate number between 1-6
        int dice = random.nextInt(6) + 1;
        System.out.println("\nYou got: " + dice);


        for(int i = 0; i < players.size(); i++){
            int position;
            if(players.get(i) == player){
                // player's previous position
                position = positions.get(i) ;
                System.out.print("player: " + players.get(i) + " | previous position: " + position + " ");
                // player's new position
                position+=dice;

                if(position > 24){
                    System.out.println("| Too big, try again to get the right number!");
                }else {
                    // update player's position
                    positions.set(i, position);
                    System.out.println("| new position: " + position);
                }

            }

            // if player's position = 24, end the game
            if(positions.get(i) == 24){
                gameEnded= true;
            }

        }
        System.out.println("");
    }

    boolean endOfGame() {
        return gameEnded;
    }

    void printWinner() {
        System.out.println("Winner: player " + player);
    }

    /* Specific declarations for the Monopoly game. */





}

