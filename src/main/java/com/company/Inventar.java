package com.company;

import java.util.ArrayList;

/**
 * Created by TIBOR on 18.1.2016.
 */
public class Inventar {
    public Inventar() {
        predmety = new ArrayList();
    }

    public ArrayList predmety;

    public void pridat(String vec) {
        predmety.add(vec);
    }

    public void vypis() {
        if (!predmety.isEmpty()){
            System.out.println("V batohu máš:");
        }
        for (Object vec : predmety) {

            System.out.println(vec);
        }
        if (predmety.isEmpty()) {
            System.out.println("Batoh je prázdný.");
        }
    }

    public void odeber(String vec) {
        predmety.remove(vec);
    }

    public boolean over(String vec) {
        return predmety.contains(vec);
    }

    public String serialize () {
        return "Inventar-" + this.predmety;
    }

}

