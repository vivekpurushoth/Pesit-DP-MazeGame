package com.pesit.maze;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vp2 on 20/02/16.
 */

//This represents a collection of rooms
//We can find a particular room using its roomNumber
public class Maze {

    private List<Room> rooms = new ArrayList<>();

    public void Maze() {

    }

    //Adds a room to the maze
    public void AddRoom(Room roomToAdd) {
        rooms.add(roomToAdd);
    }

    //Does a lookup of the room based on the roomNumber
    public Room RoomNo(int roomNumber) {
        return rooms.get(roomNumber);
    }
}