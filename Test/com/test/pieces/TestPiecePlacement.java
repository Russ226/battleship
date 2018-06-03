package com.test.pieces;


import com.battleship.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPiecePlacement {

    @Test
    public void testCarrierPlacementHorzRight(){
        Player player =  new Player();

        player.insertCarrier('h', 'r', 4, 5);

        assertEquals(player.getShips().getTile(4, 5), 5);
        assertEquals(player.getShips().getTile(5, 5), 5);
        assertEquals(player.getShips().getTile(6, 5), 5);
        assertEquals(player.getShips().getTile(7, 5), 5);
        assertEquals(player.getShips().getTile(8, 5), 5);

    }
}
