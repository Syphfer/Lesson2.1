package org.example;

public class Robot implements Challenger {
    private int RobotRunDistance;
    private int RobotJumpDistance;

    public Robot(int RobotRunDistance, int RobotJumpDistance) {
        this.RobotRunDistance = RobotRunDistance;
        this.RobotJumpDistance = RobotJumpDistance;
    }

    @Override
    public void run() {
        System.out.println(" Робот бежит");
    }
    @Override
    public void jump() {
        System.out.println(" Робот прыгает");
    }
}