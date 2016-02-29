package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */

//This is the class that creates the Maze
public class MazeGame {

    //Sample Maze created for reference
    public Maze CreateMaze(MazeFactory factory) {

        if(factory == null){
            return null;
        }

        Maze myAwesomeMaze = factory.MakeMaze();

        Room r1 = factory.MakeRoom(1);
        Room r2 = factory.MakeRoom(2);
        Door myCoolDoor = factory.MakeDoor(r1, r2);

        myAwesomeMaze.AddRoom(r1);
        myAwesomeMaze.AddRoom(r2);

        r1.setSide(Direction.East, myCoolDoor);
        r1.setSide(Direction.West, factory.MakeWall());
        r1.setSide(Direction.South, factory.MakeWall());
        r1.setSide(Direction.North, factory.MakeWall());

        r2.setSide(Direction.East, factory.MakeWall());
        r2.setSide(Direction.West, myCoolDoor);
        r2.setSide(Direction.South, factory.MakeWall());
        r2.setSide(Direction.North, factory.MakeWall());

        return myAwesomeMaze;
    }
}
