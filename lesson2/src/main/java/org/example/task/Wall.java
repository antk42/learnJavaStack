package org.example.task;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(Constentant constentant) {
        if(constentant.jump(height)){
            System.out.println(constentant.toString() + " Completed this height");
            return true;
        }else {
            System.out.println(constentant.toString() + " Can not complete this height");
            return false;
        }

    }
}
