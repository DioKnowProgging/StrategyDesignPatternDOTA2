package com.company;

public class Invoker extends DOTA2Hero{
    public Invoker () {
        super(new MDDealerBehavior(), new noPotentialBehavior());
    }

    @Override
    public void display() {
        System.out.println("I have 10 spells and I can deal 10k mag damage");
    }
}
