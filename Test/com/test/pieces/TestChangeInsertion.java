package com.test.pieces;

import com.battleship.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChangeInsertion {

    @Test
    void changeCarrierPosition(){
        Player player = new Player();

        player.insertCarrier('h','r', 4,4);
        player.changeShipInsert(5,'v','d',2,8);

        assertEquals(player.getShips().getTile(4,4), 0);
        assertEquals(player.getShips().getTile(5,4), 0);
        assertEquals(player.getShips().getTile(6,4), 0);
        assertEquals(player.getShips().getTile(7,4), 0);
        assertEquals(player.getShips().getTile(8,4), 0);

        assertEquals(player.getShips().getTile(2,8), 5);
        assertEquals(player.getShips().getTile(2,7), 5);
        assertEquals(player.getShips().getTile(2,6), 5);
        assertEquals(player.getShips().getTile(2,5), 5);
        assertEquals(player.getShips().getTile(2,4), 5);

    }

    @Test
    void changeBattleshipPosition(){
        Player player = new Player();

        player.insertBattleShip('h','r', 4,4);
        player.changeShipInsert(4,'v','d',2,8);

        assertEquals(player.getShips().getTile(4,4), 0);
        assertEquals(player.getShips().getTile(5,4), 0);
        assertEquals(player.getShips().getTile(6,4), 0);
        assertEquals(player.getShips().getTile(7,4), 0);

        assertEquals(player.getShips().getTile(2,8), 4);
        assertEquals(player.getShips().getTile(2,7), 4);
        assertEquals(player.getShips().getTile(2,6), 4);
        assertEquals(player.getShips().getTile(2,5), 4);

    }

    @Test
    void changeCruiserPosition(){
        Player player = new Player();

        player.insertCruiser('h','r', 4,4);
        player.changeShipInsert(3,'v','d',2,8);

        assertEquals(player.getShips().getTile(4,4), 0);
        assertEquals(player.getShips().getTile(5,4), 0);
        assertEquals(player.getShips().getTile(6,4), 0);

        assertEquals(player.getShips().getTile(2,8), 3);
        assertEquals(player.getShips().getTile(2,7), 3);
        assertEquals(player.getShips().getTile(2,6), 3);

    }

    @Test
    void changeDestroyerPosition(){
        Player player = new Player();

        player.insertDestroyer('h','r', 4,4);
        player.changeShipInsert(2,'v','d',2,8);

        assertEquals(player.getShips().getTile(4,4), 0);
        assertEquals(player.getShips().getTile(5,4), 0);

        assertEquals(player.getShips().getTile(2,8), 2);
        assertEquals(player.getShips().getTile(2,7), 2);

    }


    @Test
    void changeSubmarinePosition(){
        Player player = new Player();

        player.insertSubmarine('h','r', 4,4);
        player.changeShipInsert(1,'v','d',2,8);

        assertEquals(player.getShips().getTile(4,4), 0);
        assertEquals(player.getShips().getTile(5,4), 0);

        assertEquals(player.getShips().getTile(2,8), 1);
        assertEquals(player.getShips().getTile(2,7), 1);

    }

}
