package com.company.akce;

/**
 * Created by TIBOR on 1.2.2016.
 */
public class Akce {
    public Akce(String příkaz, int pocetParametru) {
        this.prikaz = příkaz;
        this.pocetParametru = pocetParametru;
    }

    private String prikaz;
    private int pocetParametru;

    public boolean rozumimPrikazu(String[] parametry) {

        if (parametry[0].equals(prikaz)) {
            if (parametry.length == pocetParametru + 1) {
                return true;

            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public void proved(String[] parametry) {

    }

    public boolean equals(Object akce) {
        if (!(akce instanceof Akce)) {
            return false;
        }

        Akce porovnani = (Akce) akce;
        if (porovnani.getPocetParametru() == pocetParametru && porovnani.getPrikaz() == prikaz) {
            return true;
        }

        else {
            return false;
        }
    }

    public String getPrikaz() {
        return prikaz;
    }

    public int getPocetParametru() {
        return pocetParametru;
    }
}
