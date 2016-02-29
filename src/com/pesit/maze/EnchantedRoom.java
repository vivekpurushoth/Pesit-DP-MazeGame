package com.pesit.maze;

/**
 * Created by vp2 on 29/02/16.
 */

//This is enchanted room
//Enchanted room can have a spell
//The spells in the enchanted room can give you clues or powers
public class EnchantedRoom extends Room {

    Spell spellCastedInTheRoom;

    public EnchantedRoom(int roomNumber, Spell s)
    {
        super(roomNumber);
        spellCastedInTheRoom = s;
    }
}
