package com.pesit.maze;

/**
 * Created by vp2 on 27/02/16.
 */
public class EnchantedMazeFactory extends MazeFactory {

    //Override the MakeRoom to return a EnchantedRoom which is casted with a spell.
    //The spell has a power and has a function
    @Override
    public Room MakeRoom(int id) {
        return new EnchantedRoom(id, CastSpell());
    }

    //Override the MakeDoor to return a DoorNeedingSpell instead of a plain door
    @Override
    public Door MakeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    //This is the function that casts a spell to the room
    protected Spell CastSpell() {
        Spell creatingNewSpell = new Spell();
        creatingNewSpell.setName("Alohomora");
        creatingNewSpell.setPower(4);
        creatingNewSpell.setFunction("Door to go out is towards in EAST direction");

        return creatingNewSpell;
    }
}
