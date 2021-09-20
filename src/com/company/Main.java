package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WinterWyvern winterWyvern = new WinterWyvern();
        Oracle oracle = new Oracle();
        Invoker invoker = new Invoker();
        PhantomAssasin phantomAssasin = new PhantomAssasin();

        oracle.display();
        oracle.corePotential();
        oracle.suppPotential();

        invoker.display();
        invoker.corePotential();
        invoker.suppPotential();

        phantomAssasin.display();
        phantomAssasin.corePotential();
        phantomAssasin.suppPotential();

        winterWyvern.display();
        winterWyvern.corePotential();
        winterWyvern.suppPotential();

        int time=0;

        for (time=0; time<10000000; time++) {
            if (time==30) {
                winterWyvern.setCoreRoleBehavior(new MDDealerBehavior());
                winterWyvern.corePotential();
                break;
            }
            System.out.println("WinterWyvern is still Support");
        }
    }
}
