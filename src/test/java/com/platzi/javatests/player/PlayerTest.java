package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void  loses_when_dice_number_is_too_low(){
        //Dice dice = new Dice(6);

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice,3);
        assertFalse(player.play());
    }

    @Test
    public void  loses_when_dice_number_is_too_big(){
        //Dice dice = new Dice(6);

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice,3);
        assertTrue(player.play());
    }

}