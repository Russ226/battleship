package com.battleship.main;

import com.battleship.board.GameBoard;
import com.battleship.player.Player;

import java.util.Scanner;

public class GameLoop {
    private boolean won;
    Player player1, player2;


    public GameLoop(){
        won = false;
        player1 = new Player();
        player2 = new Player();

    }

    public void player1SetUpBoard(){
        while(player1.getShipPieces() != 5) {
            int shipChoice = chooseShip();
            char align = chooseAlignment();

            System.out.println("you choice : " + align);
            break;
        }

    }


    private int chooseShip(){
        int shipType;
        Scanner reader = new Scanner(System.in);

        do{
            System.out.println("Choose what ship to place on the board:(press the appropriate number to place ship)");
            if(player1.getCarrier() == null){
                System.out.println("1.Carrier");
            }if(player1.getBattleShip() == null){
                System.out.println("2.Battleship");
            }if(player1.getCruiser() == null){
                System.out.println("3.Cruiser");
            }if(player1.getDestroyer() == null){
                System.out.println("4.Destroyer");
            }if(player1.getSubmarine() == null){
                System.out.println("5.Submarine");
            }

            System.out.print("chose number: ");
            shipType = reader.nextInt();


            if( shipType < 0 && shipType > 6){
                System.out.println("Number must be between 1 and 5");
            }
        }
        while(shipType < 0 || shipType > 6);


        return shipType;

    }

    public char chooseAlignment(){
        Scanner reader = new Scanner(System.in);
        char choice;

        do{
            System.out.println("Choose to place ship vertically or horizontally \n v for vertically \n h for horizontally");
            choice = reader.next().charAt(0);

        }while(choice != 'v' && choice != 'h');


        return choice;
    }



}
