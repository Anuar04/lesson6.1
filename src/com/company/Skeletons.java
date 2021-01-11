package com.company;

public class Skeletons extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public String printInfo() {
        return super.printInfo() + "\n Magic balls: " + getArrows();
    }

    public Skeletons(int arrows) {
        this.arrows = arrows;
    }
}
