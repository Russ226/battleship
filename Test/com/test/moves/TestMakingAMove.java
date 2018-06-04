package com.test.moves;

import com.battleship.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMakingAMove {

    @Test
    public void TestPlayerAttacksOpponent(){
        Player player1 = new Player();
        Player player2 = new Player();

        player2.insertCruiser('h','l', 5,2);
        assertEquals(player2.getShips().getTile(5,2), 3);

        player2.registerHit(4,2);
        player1.recordMove(4,2);

        assertEquals(player2.getShips().getTile(4,2),8);
        assertEquals(player1.getMoveBoard().getTile(4,2),9);
        assertEquals(player1.checkIfMoved(4,2), true);
    }
}
