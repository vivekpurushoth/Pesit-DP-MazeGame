package com.pesit.maze;

/**
 * Created by vp2 on 27/02/16.
 */

//Factory class created so that the creating of different components is not hardcoded in the CreateMaze code
//Having a factory like this provides the ability to easily extend functions by overriding
//It also provides the ability to just replace the factory name at one place which will create an entirely different type of game

public class MazeFactory {

    //==FACTORY METHODS
    //This method is used to create a new maze
    public Maze MakeMaze() {
        return new Maze();
    }

    //This method is used to create a room with an id
    public Room MakeRoom(int id) {
        return new Room(id);
    }

    //This method is used to create a door between 2 rooms
    public Door MakeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    //This method is used to create a wall in the Maze
    public Wall MakeWall() {
        return new Wall();
    }
}
