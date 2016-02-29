package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */

//Door exists between 2 rooms
//Door can either be locked or unlocked
public class Door extends Mapsite {

    private Room room1;
    private Room room2;
    boolean isDoorOpen;

    //Creates a door between 2 rooms
    public Door(Room r1, Room r2) {
        room1 = r1;
        room2 = r2;
    }

    //This will control the flow when the user is entering a door
    @Override
    public void Enter() {
        System.out.println("Entering through a door");
    }


    //This function returns the room on the otherside of the door if you provide it the reference of the adjacent room to which the door belongs to
    public Room OtherSideFrom(Room r) {
        if(room1.equals(r)) {
            return room2;
        }
        return room1;
    }
}