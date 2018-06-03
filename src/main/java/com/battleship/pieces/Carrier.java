package com.battleship.pieces;


public class Carrier {

    private int size;

    private int[][] location;

    private boolean sunk;

    public Carrier(){
        size = 5;
        location = new int[size][2];

        for(int i = 0; i < size; i++){
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

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }
}
