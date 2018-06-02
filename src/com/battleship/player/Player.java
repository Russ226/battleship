package com.battleship.player;

import com.battleship.board.GameBoard;

public class Player {
    // tracks where all players ships are
    private GameBoard ships;

    // tracks where player attacked his opponent so far
    private GameBoard moves;

    //will start at 0 then when player sets up his board will equal to 5 and win player must set oppenent's shipPieces to zero
    private int shipPieces;

    public Player(){
        ships = new GameBoard();
        moves = new GameBoard();

        shipPieces = 0;
    }




}
