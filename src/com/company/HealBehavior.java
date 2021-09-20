package com.company;

public class HealBehavior implements SuppRoleBehavior{
    @Override
    public void supports() {
        System.out.println("Heal");
    }
}
