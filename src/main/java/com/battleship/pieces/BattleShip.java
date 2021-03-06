package com.battleship.pieces;

public class BattleShip {

    private int size;

    private int health;

    private boolean alive;

    private boolean placed;

    public BattleShip(){
        health = size = 4;
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
