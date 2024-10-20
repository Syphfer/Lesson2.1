package org.example;

public class Wall implements ObstructionCheck {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public void Challenge(Challenger challenger) {
    challenger.jump();
}
}