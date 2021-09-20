package com.company;

public abstract class DOTA2Hero {

    private CoreRoleBehavior coreRoleBehavior;
    private SuppRoleBehavior suppRoleBehavior;

    public DOTA2Hero(CoreRoleBehavior coreRoleBehavior, SuppRoleBehavior suppRoleBehavior) {
        this.coreRoleBehavior = coreRoleBehavior;
        this.suppRoleBehavior = suppRoleBehavior;
    }

    public DOTA2Hero() {

    }

    public void suppPotential() {
        this.suppRoleBehavior.supports();
    }

    public void corePotential() {
        this.coreRoleBehavior.carry();
    }

    public abstract void display();

    public CoreRoleBehavior getCoreRoleBehavior() {
        return coreRoleBehavior;
    }

    public void setCoreRoleBehavior(CoreRoleBehavior coreRoleBehavior) {
        this.coreRoleBehavior = coreRoleBehavior;
    }

    public SuppRoleBehavior getSuppRoleBehavior() {
        return suppRoleBehavior;
    }

    public void setSuppRoleBehavior(SuppRoleBehavior suppRoleBehavior) {
        this.suppRoleBehavior = suppRoleBehavior;
    }
}

