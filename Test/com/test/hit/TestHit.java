package com.test.hit;

import com.battleship.player.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHit {

    @Test
    public void testHitRegistration(){
        Player player = new Player();

        player.insertCarrier('h', 'r', 4,4);
        assertEquals(player.registerHit(5,4), 'h');
    }

    @Test
    public void testHitRegistrationSinking(){
        Player player = new Player();

        player.insertCarrier('h', 'r', 4,4);
        player.registerHit(4,4);
        player.registerHit(5,4);
        player.registerHit(6,4);
        player.registerHit(7,4);
        assertEquals(player.registerHit(8,4), 'c');
    }

    @Test
    public void testHitRegistrationTwice(){
        Player player = new Player();

        player.insertCarrier('h', 'r', 4,4);
        assertEquals(player.registerHit(5,4), 'h');
        assertEquals(player.registerHit(5,4), 'm');
    }

    @Test
    public void testHitRegistrationBattleship(){
        Player player = new Player();

        player.insertBattleShip('h', 'r', 4,4);
        assertEquals(player.registerHit(5,4), 'h');

        player.registerHit( 6,4);
        player.registerHit( 7,4);
        assertEquals(player.registerHit(8,4), 'b');

    }

    @Test
    public void testHitRegistrationCruise(){
        Player player = new Player();

        player.insertCruiser('h', 'r', 4,4);
        assertEquals(player.registerHit(5,4), 'h');

        player.registerHit( 6,4);
        assertEquals(player.registerHit( 7,4), 'k');

    }

    @Test
    public void testHitRegistrationDestroyer(){
        Player player = new Player();

        player.insertDestroyer('h', 'r', 4,4);
        assertEquals(player.registerHit(5,4), 'h');

        assertEquals(player.registerHit( 6,4), 'd');


    }

    @Test
    public void testHitRegistrationSubmarine(){
        Player player = new Player();

        player.insertSubmarine('h', 'r', 4,4);
        assertEquals(player.registerHit(5,4), 'h');

        assertEquals(player.registerHit( 6,4), 's');


    }
}
