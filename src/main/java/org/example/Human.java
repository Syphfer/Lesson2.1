package org.example;

public class Human implements Challenger {
    private int HumanRunDistance;
    private int HumanJumpDistance;

    public Human(int HumanRunDistance, int HumanJumpDistance) {
        this.HumanRunDistance = HumanRunDistance;
        this.HumanJumpDistance = HumanJumpDistance;
    }

    @Override
    public void run() {
        System.out.println(" Человек бежит");
    }
    @Override
    public void jump() {
        System.out.println(" Человек прыгает");
    }
}