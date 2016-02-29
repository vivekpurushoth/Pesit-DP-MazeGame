package com.pesit.maze;

import java.util.Scanner;

/**
 * Created by vp2 on 27/02/16.
 */
//This is extention of a normal door where the user has to enter a spell before he can enter
public class DoorNeedingSpell extends Door {

    public DoorNeedingSpell(Room r1, Room r2)
    {
        super(r1, r2);
        System.out.println("This door can only be opened with a spell");
    }

    //This will be the function that will be called when user is trying to enter a door that needs a spell
    @Override
    public void Enter() {
        //Taking the spell input from the player
        Scanner in = new Scanner(System.in);
        String spell = in.nextLine();
        //Only if the spell provided by the user is valid, allow him to enter
        if(spell.equals("alohomora")) {
            super.Enter();
        }
        else
        {
            System.out.println("Entry denied : Invalid spell");
        }
    }

    @Override
    public Room OtherSideFrom(Room r) {
        return super.OtherSideFrom(r);
    }
}
