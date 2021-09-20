package com.company;

public class WinterWyvern extends DOTA2Hero{
    public WinterWyvern() {
        super(new noFarmPotentialBehavior(), new HealBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm best healer of DOTA 2");
    }
}
