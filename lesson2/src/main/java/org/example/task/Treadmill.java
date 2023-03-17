package org.example.task;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Constentant constentant) {
        if(constentant.run(length)){
            System.out.println(constentant.toString() + " Completed distance");
            return true;
        }else {
            System.out.println(constentant.toString() + " Can not complete distance");
            return false;
        }
    }
}
