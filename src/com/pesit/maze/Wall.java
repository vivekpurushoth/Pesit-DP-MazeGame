package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */

//It is the basic building block of a Maze
//This helps block the player from entering one place to another place
public class Wall extends Mapsite{
    public Wall() {

    }

    //This function lets the user know that he approached a wall and cannot proceed further
    @Override
    void Enter() {
        System.out.println("You encountered a wall");
    }
}
