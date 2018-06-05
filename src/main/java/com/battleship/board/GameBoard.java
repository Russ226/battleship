package com.battleship.board;

public class GameBoard {
    private int[][] board;

    public GameBoard(){
        board = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                board[i][j] = 0;
            }
        }
    }

    public void insert(int col, int row, int piece){
        board[row][col] = piece;
    }

    public int getTile(int col, int row){
        return board[row][col];
    }

    public void printBoard(){
        System.out.print("   ");
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }

        for(int i = 0; i < 10; i++){
            System.out.print("\n");
            for(int j = 0; j < 10; j++){
                if(j == 0){
                    System.out.print(i + "| ");
                }
                System.out.print(board[i][j] + " ");
            }


        }
    }
}
