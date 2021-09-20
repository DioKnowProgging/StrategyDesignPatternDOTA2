package com.company;

public class noPotentialBehavior implements SuppRoleBehavior{
    @Override
    public void supports() {
        System.out.println("No potential to be Support");
    }
}
