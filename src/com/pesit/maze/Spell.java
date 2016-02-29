package com.pesit.maze;

/**
 * Created by vp2 on 29/02/16.
 */

//Spell is a class that is used in either of the following cases
//1. EnchantedRoom - A room can have a spell that can provide a clue - This will be used by the user to finish the game quickly
//2. EnchantedDoor - A door might require a spell for it to be opened - This needs to be given by the player while playing
public class Spell {

    //This property represents the name of the spell
    private String name;

    //This property represents the power of the spell
    //The power can be anything between 1-5
    private int power;

    //This property represents what the spell does
    //The function could be either providing a clue as to which direction the door is
    //The function could be to point the player in the right direction
    //The function could be to make the walls in the room disappear giving the user a free walk from this particular room
    private String function;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
