package com.battleship.main;

import com.battleship.board.GameBoard;
import com.battleship.player.Player;

import java.util.Scanner;

public class GameLoop {
    private boolean won;
    private Player player1, player2;


    public GameLoop(){
        won = false;
        player1 = new Player();
        player2 = new Player();

    }

    public void MainLoop(){
        boolean turn = false;
        Scanner reader = new Scanner(System.in);
        int inputX, inputY;
        char checkPrevMoves;

        System.out.println("Player 1 set up your board\n");
        player1SetUpBoard();

        System.out.println("Player 2 set up your board\n");
        player2SetUpBoard();

        while(!won){
            // player 1's turn
            if(!turn){
                turn = true;
                System.out.println("\n player 1's turn");
                do{
                    System.out.println("\n Would you like to check your previous moves?(y or n)");

                    checkPrevMoves = reader.next().charAt(0);
                    if(checkPrevMoves == 'y'){
                        player1.getMoveBoard().printBoard();

                    }
                }while (checkPrevMoves != 'n');

                do {
                    System.out.println("Player 1 pick X coordinate: ");
                    inputX = reader.nextInt();

                    System.out.println("Player 1 pick Y coordinate: ");
                    inputY = reader.nextInt();

                    if(inputX > 10 && inputX < 0){
                        System.out.println("Invalid X coordinate " + inputX);
                    }

                    if(inputY > 10 && inputY < 0){
                        System.out.println("Invalid Y coordinate " + inputY);
                    }

                }while(inputX > 10 && inputX < 0 && inputX > 10 && inputX < 0);

                player1.recordMove(inputX, inputY);
                char hit = player2.registerHit(inputX,inputY);
                if(hit == 'm'){
                    System.out.println("Player 1 misses");
                }else if(hit == 'h'){
                    System.out.println("Player 1 hits a ship");
                }else if(hit == 'b'){
                    System.out.println("Player 1 sinks a battleship");
                }else if(hit == 'c'){
                    System.out.println("Player 1 sinks a carrier");
                }else if(hit == 'k'){
                    System.out.println("Player 1 sinks a cruiser");
                }else if(hit == 'd'){
                    System.out.println("Player 1 sinks a destroyer");
                }else if(hit == 's'){
                    System.out.println("Player 1 sinks a submarine");
                }

            }else{
                turn = false;
                System.out.println("\n player 2's turn");
                do{
                    System.out.println("\n Would you like to check your previous moves?(y or n)");

                    checkPrevMoves = reader.next().charAt(0);
                    if(checkPrevMoves == 'y'){
                        player2.getMoveBoard().printBoard();

                    }
                }while (checkPrevMoves != 'n');

                do {
                    System.out.println("Player 2 pick X coordinate: ");
                    inputX = reader.nextInt();

                    System.out.println("Player 2 pick Y coordinate: ");
                    inputY = reader.nextInt();

                    if(inputX > 10 && inputX < 0){
                        System.out.println("Invalid X coordinate " + inputX);
                    }

                    if(inputY > 10 && inputY < 0){
                        System.out.println("Invalid Y coordinate " + inputY);
                    }

                }while(inputX > 10 && inputX < 0 && inputX > 10 && inputX < 0);

                player2.recordMove(inputX, inputY);
                char hit = player1.registerHit(inputX,inputY);
                if(hit == 'm'){
                    System.out.println("Player 2 misses");
                }else if(hit == 'h'){
                    System.out.println("Player 2 hits a ship");
                }else if(hit == 'b'){
                    System.out.println("Player 2 sinks a battleship");
                }else if(hit == 'c'){
                    System.out.println("Player 2 sinks a carrier");
                }else if(hit == 'k'){
                    System.out.println("Player 2 sinks a cruiser");
                }else if(hit == 'd'){
                    System.out.println("Player 2 sinks a destroyer");
                }else if(hit == 's'){
                    System.out.println("Player 2 sinks a submarine");
                }


            }

            if(player1.getShipPieces() == 0){
                won =true;
                System.out.println("GAME OVER Player 1 wins!");
            }if(player2.getShipPieces() == 0){
                won =true;
                System.out.println("GAME OVER Player 2 wins!");
            }
        }

    }

    private void player1SetUpBoard(){
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

        System.out.println("Your board:\n");
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

    private void player2SetUpBoard(){
        int shipChoice, col, row;
        char align, dir;

        while(player2.getShipPieces() != 5) {

            System.out.println("Your board so far:\n");
            player2.getShips().printBoard();
            System.out.println('\n');

            shipChoice = chooseShip(false, player2);
            align = chooseAlignment();
            dir = chooseDirection(align);
            col = chooseColumn();
            row =  chooseRow();

            if(shipChoice == 5){
                if(!player2.insertCarrier(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }

            }if(shipChoice == 4){
                if(!player2.insertBattleShip(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }if(shipChoice == 3){
                if(!player2.insertCruiser(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }if(shipChoice == 2){
                if(!player2.insertDestroyer(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }if(shipChoice == 1){
                if(!player2.insertSubmarine(align, dir, col, row)){
                    System.out.println("Unable to place ship");
                }
            }

        }

        System.out.println("Your board: ");
        player2.getShips().printBoard();

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

                player2.changeShipInsert(shipChoice,align,dir,col,row);

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

                System.out.print("choose number: ");
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

    private char chooseAlignment(){
        Scanner reader = new Scanner(System.in);
        char choice;

        do{
            System.out.println("Choose to place ship vertically or horizontally \n v for vertically \n h for horizontally");
            choice = reader.next().charAt(0);

        }while(choice != 'v' && choice != 'h');


        return choice;
    }

    private char chooseDirection(char align){
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

    private int chooseColumn(){
        Scanner reader = new Scanner(System.in);
        int choice;

        do{
            System.out.print("choose X coordinate between 0  and 9");
            choice = reader.nextInt();


        }while(choice < 0 && choice > 10);


        return choice;
    }

    private int chooseRow(){
        Scanner reader = new Scanner(System.in);
        int choice;

        do{
            System.out.print("choose Y coordinate between 0  and 9");
            choice = reader.nextInt();


        }while(choice < 0 && choice > 10);


        return choice;
    }





}
