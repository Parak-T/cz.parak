package com.company.akce;

import com.company.Hrdina;
import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by TIBOR on 20.3.2016.
 */
public class Zvedni extends Akce {

    Mapa mapa;
    Hrdina hrdina;

    public Zvedni(Mapa mapa, Hrdina hrdina) {
        super("zvedni", 1);
        this.mapa = mapa;
        this.hrdina = hrdina;
    }

    public void proved(String[] parametry) {
        Lokace aktualniLokace = mapa.getAktualniLokace();
        Inventar predmety = hrdina.getInventar();

        if (aktualniLokace.jdeProvest(getPrikaz()) && aktualniLokace.muzuVzit(parametry[1])) {
            predmety.pridat(parametry[1]);
            aktualniLokace.odeberPredmet(parametry[1]);
            predmety.vypis();
        } else {
            System.out.println("Kde nic, tu nic.");
        }
    }

}
