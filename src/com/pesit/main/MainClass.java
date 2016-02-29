package com.pesit.main;

import com.pesit.maze.EnchantedMazeFactory;
import com.pesit.maze.Maze;
import com.pesit.maze.MazeFactory;
import com.pesit.maze.MazeGame;

import java.util.Scanner;

/**
 * Created by vp2 on 20/02/16.
 */

public class MainClass {

    //Starting Point of the application
    public static void main(String args[]) {
        System.out.println("Creating Maze");

        //Creating a MazeGame to start playing
        MazeGame game = new MazeGame();

        //Creating a factory of the desired type of maze game
        //The types of factories in our current example could be
        //1. MazeFactory
        //2. EnchantedMazeFactory
        //3. BombedMazeFactory
        //Just for example I'm creating a EnchantedMazeFactory
        MazeFactory factory = new EnchantedMazeFactory();
        game.CreateMaze(factory);
    }

}