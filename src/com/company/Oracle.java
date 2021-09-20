package com.company;

public class Oracle extends DOTA2Hero{
    public Oracle() {
        super(new noFarmPotentialBehavior(), new saveBehavior());
    }

    @Override
    public void display() {
        System.out.println("I can save my core with 'False Promise'");
    }
}
