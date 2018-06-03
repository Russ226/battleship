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

    @Test
    public void testCruiserPlacementHorzRight(){
        Player player =  new Player();

        player.insertCruiser('h', 'r', 4, 5);

        assertEquals(player.getShips().getTile(4, 5), 3);
        assertEquals(player.getShips().getTile(5, 5), 3);
        assertEquals(player.getShips().getTile(6, 5), 3);


    }

    @Test
    public void testCruiserPlacementHorzRightFail(){
        Player player =  new Player();

        player.insertCruiser('h', 'r', 8, 5);

        assertEquals(player.getShips().getTile(5, 5), 0);
        assertEquals(player.getShips().getTile(6, 5), 0);
        assertEquals(player.getShips().getTile(7, 5), 0);


    }

    @Test
    public void testCruiserPlacementHorzleft(){
        Player player =  new Player();

        player.insertCruiser('h', 'l', 6, 5);

        assertEquals(player.getShips().getTile(6, 5), 3);
        assertEquals(player.getShips().getTile(5, 5), 3);
        assertEquals(player.getShips().getTile(4, 5), 3);


    }

    @Test
    public void testCruiserPlacementVertUp(){
        Player player =  new Player();

        player.insertCruiser('v', 'u', 5, 4);

        assertEquals(player.getShips().getTile(5, 4), 3);
        assertEquals(player.getShips().getTile(5, 5), 3);
        assertEquals(player.getShips().getTile(5, 6), 3);


    }

    @Test
    public void testCruiserPlacementVertDown(){
        Player player =  new Player();

        player.insertCruiser('v', 'd', 5, 6);

        assertEquals(player.getShips().getTile(5, 6), 3);
        assertEquals(player.getShips().getTile(5, 5), 3);
        assertEquals(player.getShips().getTile(5, 4), 3);

    }

    @Test
    public void testDestroyerPlacementHorzRight(){
        Player player =  new Player();

        player.insertDestroyer('h', 'r', 4, 5);

        assertEquals(player.getShips().getTile(4, 5), 2);
        assertEquals(player.getShips().getTile(5, 5), 2);



    }

    @Test
    public void testDestroyerPlacementHorzRightFail(){
        Player player =  new Player();

        player.insertDestroyer('h', 'r', 9, 5);

        assertEquals(player.getShips().getTile(5, 5), 0);
        assertEquals(player.getShips().getTile(6, 5), 0);
    }

    @Test
    public void testDestroyerPlacementHorzleft(){
        Player player =  new Player();

        player.insertDestroyer('h', 'l', 6, 5);

        assertEquals(player.getShips().getTile(6, 5), 2);
        assertEquals(player.getShips().getTile(5, 5), 2);
    }

    @Test
    public void testDestroyerPlacementVertUp(){
        Player player =  new Player();

        player.insertDestroyer('v', 'u', 5, 4);

        assertEquals(player.getShips().getTile(5, 4), 2);
        assertEquals(player.getShips().getTile(5, 5), 2);
    }

    @Test
    public void testDestroyerPlacementVertDown(){
        Player player =  new Player();

        player.insertDestroyer('v', 'd', 5, 6);

        assertEquals(player.getShips().getTile(5, 6), 2);
        assertEquals(player.getShips().getTile(5, 5), 2);

    }

    @Test
    public void testSubmarinePlacementHorzRight(){
        Player player =  new Player();

        player.insertSubmarine('h', 'r', 4, 5);

        assertEquals(player.getShips().getTile(4, 5), 1);
        assertEquals(player.getShips().getTile(5, 5), 1);



    }

    @Test
    public void testSubmarinePlacementHorzRightFail(){
        Player player =  new Player();

        player.insertSubmarine('h', 'r', 9, 5);

        assertEquals(player.getShips().getTile(5, 5), 0);
        assertEquals(player.getShips().getTile(6, 5), 0);
    }

    @Test
    public void testSubmarinePlacementHorzleft(){
        Player player =  new Player();

        player.insertSubmarine('h', 'l', 6, 5);

        assertEquals(player.getShips().getTile(6, 5), 1);
        assertEquals(player.getShips().getTile(5, 5), 1);
    }

    @Test
    public void testSubmarinePlacementVertUp(){
        Player player =  new Player();

        player.insertSubmarine('v', 'u', 5, 4);

        assertEquals(player.getShips().getTile(5, 4), 1);
        assertEquals(player.getShips().getTile(5, 5), 1);
    }

    @Test
    public void testSubmarinePlacementVertDown(){
        Player player =  new Player();

        player.insertSubmarine('v', 'd', 5, 6);

        assertEquals(player.getShips().getTile(5, 6), 1);
        assertEquals(player.getShips().getTile(5, 5), 1);

    }

    @Test
    public void testIntersection(){
        Player player =  new Player();

        assertEquals(player.insertSubmarine('v', 'd', 5, 6), true);
        assertEquals(player.insertDestroyer('v', 'd', 5, 6), false);
    }
}
