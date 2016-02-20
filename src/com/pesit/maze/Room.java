package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */
public class Room extends Mapsite {

    private int roomNumber
    private Mapsite[] sides;

    //A constructor for the Room class which will take an id which is going to be unique for each room.
    public Room(int id) {

    }

    //Takes the parameter direction
    //Returns the mapsite that is there in that particular direction
    Mapsite getSide(Direction dir) {
        return null;
    }

    //Takes 2 parameters
    //First parameter is the direction in which something should be created
    //Second parameter is what should be created
    void setSide(Direction dir, Mapsite mapsite)
    {

    }

    @Override
    void Enter() {
        System.out.println("Ther person entered the room");
    }
}
