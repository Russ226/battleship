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

            System.out.println("Your board so far: ");
            player1.getShips().printBoard();
            System.out.println('\n');

            int shipChoice = chooseShip();
            char align = chooseAlignment();
            char dir = chooseDirection(align);
            int col = chooseColumn();
            int row =  chooseRow();

            if(shipChoice == 5){
                player1.insertCarrier(align, dir, col, row);
            }if(shipChoice == 4){
                player1.insertBattleShip(align, dir, col, row);
            }if(shipChoice == 3){
                player1.insertCruiser(align, dir, col, row);
            }if(shipChoice == 2){
                player1.insertDestroyer(align, dir, col, row);
            }if(shipChoice == 1){
                player1.insertSubmarine(align, dir, col, row);
            }

        }

    }


    private int chooseShip(){
        int shipType;
        Scanner reader = new Scanner(System.in);

        do{
            System.out.println("Choose what ship to place on the board:(press the appropriate number to place ship)");
            if(player1.getSubmarine() == null){
                System.out.println("1.Submarine");
            }if(player1.getDestroyer() == null){
                System.out.println("2.Destroyer");
            }if(player1.getCruiser() == null){
                System.out.println("3.Cruiser");
            }if(player1.getBattleShip() == null){
                System.out.println("4.Battleship");
            }if(player1.getCarrier() == null){
                System.out.println("5.Carrier");
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

    public char chooseDirection(char align){
        Scanner reader = new Scanner(System.in);
        char choice;

        do{
            if(align == 'v'){
                System.out.println("Choose to place ship up or down \n u for up \n d for down");
                choice = reader.next().charAt(0);
            }else if(align == 'h'){
                System.out.println("Choose to place ship left or right \n l for left \n r for right");
                choice = reader.next().charAt(0);
            }else{
                choice ='g';
            }


        }while(choice != 'u' && choice != 'd' && choice != 'l' && choice != 'r');


        return choice;
    }

    public int chooseColumn(){
        Scanner reader = new Scanner(System.in);
        int choice;

        do{
            System.out.print("chose X coordinate between 0  and 9");
            choice = reader.nextInt();


        }while(choice < 0 && choice > 10);


        return choice;
    }

    public int chooseRow(){
        Scanner reader = new Scanner(System.in);
        int choice;

        do{
            System.out.print("chose Y coordinate between 0  and 9");
            choice = reader.nextInt();


        }while(choice < 0 && choice > 10);


        return choice;
    }





}
