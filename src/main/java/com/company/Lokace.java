package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TIBOR on 1.2.2016.
 */
public class Lokace {

    public List povoleneAkce;

    private ArrayList predmety;

    private Bytost bytost;

    public Lokace(List akce) {
        this(akce, new ArrayList<>());
    }

    public Lokace(List akce, ArrayList predmety) {
        this(akce, null, predmety);

    }

    public Lokace(List akce, Bytost bytost) {
        this(akce, bytost, null);

    }

    public Lokace(List akce, Bytost bytost, ArrayList predmety) {
        this.povoleneAkce = akce;
        this.bytost = bytost;
        this.predmety = predmety;
    }

    public boolean jdeProvest(String akce) {
        return povoleneAkce.contains(akce);
    }

    public boolean muzuVzit(String predmet) {
        return predmety.contains(predmet);
    }

    public void odeberPredmet(String predmet) {
        predmety.remove(predmet);
    }

    public void pridejPredmet(String predmet) {
        predmety.add(predmet);
    }

    public boolean jeBytost() {
        return bytost != null;
    }

    public void vypis() {
        if (!predmety.isEmpty() || bytost != null) {
            System.out.println("V místnosti vidíš:");
            for (Object vec : predmety) {

                System.out.println(vec);

            }
            if (jeBytost() == true) {
                System.out.println(bytost);
            }

        } else {

            System.out.println("Místnost je prázdná.");
        }
    }

    public Bytost getBytost() {
        return bytost;
    }

    public void odeberBytost() {
        bytost = null;
    }

    public String serialize () {
        return "-" + this.povoleneAkce + "," + this.bytost + "," + this.predmety + ";";
    }
}
