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
        int shipChoice, col, row;
        char align, dir;

        while(player1.getShipPieces() != 5) {

            System.out.println("Your board so far: ");
            player1.getShips().printBoard();
            System.out.println('\n');

            shipChoice = chooseShip(false, player1);
            align = chooseAlignment();
            dir = chooseDirection(align);
            col = chooseColumn();
            row =  chooseRow();

            if(shipChoice == 5){
                if(!player1.insertCarrier(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }

            }if(shipChoice == 4){
                if(!player1.insertBattleShip(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }if(shipChoice == 3){
                if(!player1.insertCruiser(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }if(shipChoice == 2){
                if(!player1.insertDestroyer(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }if(shipChoice == 1){
                if(!player1.insertSubmarine(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }

        }

        System.out.println("Your board: ");
        player1.getShips().printBoard();

        Scanner reader = new Scanner(System.in);
        char choice;
        do{
            System.out.println("\n Would you like to change any ships?(y or n)");

            choice = reader.next().charAt(0);
            if(choice == 'y'){
                shipChoice = chooseShip(true, player1);
                align = chooseAlignment();
                dir = chooseDirection(align);
                col = chooseColumn();
                row =  chooseRow();

                player1.changeShipInsert(shipChoice,align,dir,col,row);

            }
        }while (choice != 'n');


    }


    private int chooseShip(boolean edit, Player player){
        int shipType;
        Scanner reader = new Scanner(System.in);
        if(!edit) {
            do {
                System.out.println("Choose what ship to place on the board:(press the appropriate number to place ship)");
                if (player.getSubmarine() == null || !player.getSubmarine().isPlaced()) {
                    System.out.println("1.Submarine");
                }
                if (player.getDestroyer() == null || !player.getDestroyer().isPlaced()) {
                    System.out.println("2.Destroyer");
                }
                if (player.getCruiser() == null || !player.getCruiser().isPlaced()) {
                    System.out.println("3.Cruiser");
                }
                if (player.getBattleShip() == null || !player.getBattleShip().isPlaced()) {
                    System.out.println("4.Battleship");
                }
                if (player.getCarrier() == null || !player.getCarrier().isPlaced()) {
                    System.out.println("5.Carrier");
                }

                System.out.print("chose number: ");
                shipType = reader.nextInt();


                if (shipType < 0 && shipType > 6) {
                    System.out.println("Number must be between 1 and 5");
                }
            } while (shipType < 0 || shipType > 6);
        }else{
            do {
                System.out.println("Choose what ship to place on the board:(press the appropriate number to place ship)");

                System.out.println("1.Submarine");
                System.out.println("2.Destroyer");
                System.out.println("3.Cruiser");
                System.out.println("4.Battleship");
                System.out.println("5.Carrier");


                System.out.print("chose number: ");
                shipType = reader.nextInt();


                if (shipType < 0 && shipType > 6) {
                    System.out.println("Number must be between 1 and 5");
                }
            }
            while (shipType < 0 || shipType > 6);
        }


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
