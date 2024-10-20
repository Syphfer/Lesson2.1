package org.example;

public class Cat implements Challenger {
    private int CatRunDistance;
    private int CatJumpDistance;

    public Cat(int CatRunDistance, int CatJumpDistance) {
        this.CatRunDistance = CatRunDistance;
        this.CatJumpDistance = CatJumpDistance;
    }

    @Override
    public void run() {
    System.out.println(" Кот бежит");
}
@Override
    public void jump() {
    System.out.println(" Кот прыгает");
}
}



