package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */

//Room is a basic object in a maze
//A basic room can have doors and walls
public class Room extends Mapsite {

    private int roomNumber;
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

    //Enter is called when the person enters a room
    //The roomNumber is printed to identify which room the person is in
    @Override
    void Enter() {
        System.out.println("Ther person entered the room "+roomNumber);
    }
}
