package org.example.task;

public class Human implements Constentant{
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human() {
        this.maxRunDistance = 100;
        this.maxJumpHeight = 1;
    }

    @Override
    public boolean run(int distance) {
        if(distance == 0){
            System.out.println(this.toString() + " Can not complete any distance");
            return false;
        } else if (distance >= maxRunDistance) {
            System.out.println(" Can not complete this distance" + distance + this.toString());
            return false;
        }else {
            System.out.println(this.toString() + " Completed distance" + distance + " m");
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if(height == 0){
            System.out.println(this.toString() + "Can not jump");
            return false;
        } else if (height >= maxJumpHeight) {
            System.out.println(" Can not complete this height" + height + this.toString());
            return false;
        }else {
            System.out.println(this.toString() + " Completed height" + height + " m");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Human";
    }
}
