package org.example;

public class RunningPad implements ObstructionCheck {
    private int padLenght;

    public RunningPad(int padLenght) {
        this.padLenght = padLenght;
    }

    @Override
    public void Challenge(Challenger challenger){
    challenger.run();
}
}