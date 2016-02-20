package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */
public class Door extends Mapsite {

    private Room room1;
    private Room room2;
    boolean isDoorOpen;

    //Creates a door between 2 rooms
    public Door(Room r1, Room r2) {

    }

    //This will control the flow where the user is entering a door
    @Override
    public void Enter() {
        System.out.println("Entering a door");
    }

    public Room OtherSideFrom(Room r) {
        return null;
    }
}