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

    @Test
    public void testCarrierPlacementHorzRightFail(){
        Player player =  new Player();

        player.insertCarrier('h', 'r', 5, 5);

        assertEquals(player.getShips().getTile(5, 5), 0);
        assertEquals(player.getShips().getTile(6, 5), 0);
        assertEquals(player.getShips().getTile(7, 5), 0);
        assertEquals(player.getShips().getTile(8, 5), 0);

    }

    @Test
    public void testCarrierPlacementHorzleft(){
        Player player =  new Player();

        player.insertCarrier('h', 'l', 6, 5);

        assertEquals(player.getShips().getTile(6, 5), 5);
        assertEquals(player.getShips().getTile(5, 5), 5);
        assertEquals(player.getShips().getTile(4, 5), 5);
        assertEquals(player.getShips().getTile(3, 5), 5);
        assertEquals(player.getShips().getTile(2, 5), 5);

    }

    @Test
    public void testCarrierPlacementVertUp(){
        Player player =  new Player();

        player.insertCarrier('v', 'u', 5, 4);

        assertEquals(player.getShips().getTile(5, 4), 5);
        assertEquals(player.getShips().getTile(5, 5), 5);
        assertEquals(player.getShips().getTile(5, 6), 5);
        assertEquals(player.getShips().getTile(5, 7), 5);
        assertEquals(player.getShips().getTile(5, 8), 5);

    }

    @Test
    public void testCarrierPlacementVertDown(){
        Player player =  new Player();

        player.insertCarrier('v', 'd', 5, 6);

        assertEquals(player.getShips().getTile(5, 6), 5);
        assertEquals(player.getShips().getTile(5, 5), 5);
        assertEquals(player.getShips().getTile(5, 4), 5);
        assertEquals(player.getShips().getTile(5, 3), 5);
        assertEquals(player.getShips().getTile(5, 2), 5);

    }

    @Test
    public void testCarrierPlacementTwice(){
        Player player =  new Player();

        assertEquals(player.insertCarrier('v', 'd', 5, 6), true);

        assertEquals(player.insertCarrier('v', 'u', 5, 2), false);

    }

    @Test
    public void testBattleShipPlacementVertDown(){
        Player player =  new Player();

        player.insertBattleShip('v', 'd', 5, 6);

        assertEquals(player.getShips().getTile(5, 6), 4);
        assertEquals(player.getShips().getTile(5, 5), 4);
        assertEquals(player.getShips().getTile(5, 4), 4);
        assertEquals(player.getShips().getTile(5, 3), 4);
    }

    @Test
    public void testBattleShipPlacementHorzRight(){
        Player player =  new Player();

        player.insertBattleShip('h', 'r', 4, 5);

        assertEquals(player.getShips().getTile(4, 5), 4);
        assertEquals(player.getShips().getTile(5, 5), 4);
        assertEquals(player.getShips().getTile(6, 5), 4);
        assertEquals(player.getShips().getTile(7, 5), 4);


    }

    @Test
    public void testBattleShipPlacementHorzRightFail(){
        Player player =  new Player();

        player.insertBattleShip('h', 'r', 6, 5);

        assertEquals(player.getShips().getTile(5, 5), 0);
        assertEquals(player.getShips().getTile(6, 5), 0);
        assertEquals(player.getShips().getTile(7, 5), 0);


    }

    @Test
    public void testBattleShipPlacementHorzleft(){
        Player player =  new Player();

        player.insertBattleShip('h', 'l', 6, 5);

        assertEquals(player.getShips().getTile(6, 5), 4);
        assertEquals(player.getShips().getTile(5, 5), 4);
        assertEquals(player.getShips().getTile(4, 5), 4);
        assertEquals(player.getShips().getTile(3, 5), 4);


    }

    @Test
    public void testBattleShipPlacementVertUp(){
        Player player =  new Player();

        player.insertBattleShip('v', 'u', 5, 4);

        assertEquals(player.getShips().getTile(5, 4), 4);
        assertEquals(player.getShips().getTile(5, 5), 4);
        assertEquals(player.getShips().getTile(5, 6), 4);
        assertEquals(player.getShips().getTile(5, 7), 4);
    }
}
