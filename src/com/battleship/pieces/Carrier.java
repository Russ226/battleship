package com.battleship.pieces;


public class Carrier {

    private int size;

    private int[][] location;

    private boolean[] hit;

    public Carrier(){
        size = 5;
        location = new int[size][2];
        hit = new boolean[size];

        for(int i = 0; i < size; i++){
            hit[i] = false;
            for(int j = 0; j < 2; j++){
                location[i][j] = 0;
            }
        }
    }

    public void insertLocation(int col, int row, int part){
        location[part][0] = col;
        location[part][1] = row;
    }

    public int[] getlocation(int part){
        return location[part];
    }

    public int getSize(){
        return size;
    }

    public boolean hitPart(int col , int row){

        for(int i = 0; i < size; i++){
            if(location[i][0] == col && location[i][1] == row){
                hit[i] = true;
            }
        }
        if(checkIfSunk()){
            return true;
        }

        return false;

    }

    private boolean checkIfSunk(){
        for(int i = 0; i < size; i++){
            if(!hit[i]){
             return false;
            }
        }
        return true;
    }


}
