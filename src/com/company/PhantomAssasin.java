package com.company;

public class PhantomAssasin extends DOTA2Hero{

    public PhantomAssasin() {
        super(new PhDDealerBehavior(), new noPotentialBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm phys damage dealer with critical attacks");
    }
}
