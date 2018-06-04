package com.battleship.pieces;

public class Cruiser {
    private int size;

    private int health;

    private boolean alive;

    private boolean placed;

    public Cruiser(){
        health = size = 3;
        alive = true;

    }

    public int getSize() {
        return size;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    public void decrementHealth(){
        health--;
        if(health <= 0){
            alive = false;
        }
    }
}
