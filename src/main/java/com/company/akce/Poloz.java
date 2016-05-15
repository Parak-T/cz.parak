package com.company.akce;

import com.company.Hrdina;
import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by TIBOR on 23.3.2016.
 */
public class Poloz extends Akce {
    Mapa mapa;
    Hrdina hrdina;

    public Poloz (Mapa mapa, Hrdina hrdina) {
        super("polož", 1);
        this.mapa = mapa;
        this.hrdina = hrdina;
    }

    public void proved(String[] parametry) {
        Inventar predmety = hrdina.getInventar();
        Lokace aktualniLokace = mapa.getAktualniLokace();

        if (aktualniLokace.jdeProvest(getPrikaz()) && predmety.over(parametry[1])) {
            predmety.odeber (parametry [1]);
            aktualniLokace.pridejPredmet(parametry [1]);
            predmety.vypis ();
        }
        else {
            System.out.println("nemůžeš");
        }
    }
}
