package com.pesit.maze;

/**
 * Created by vp2 on 20/02/16.
 */
public class Wall extends Mapsite{
    public Wall() {

    }

    @Override
    void Enter() {
        System.out.println("Crashed at a wall");
    }
}
