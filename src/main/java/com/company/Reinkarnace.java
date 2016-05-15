package com.company;

import java.util.ArrayList;

/**
 * Created by TIBOR on 10.5.2016.
 */
public class Reinkarnace {

    public Pozice vychoziPozice;



    public void proved (Hrdina hrdina, Mapa mapa, Lokace aktualniLokace) {
        hrdina.setZivoty(10);

        ArrayList pozustalost = new ArrayList();
        pozustalost.add(hrdina.getInventar());
        aktualniLokace.pridejPredmet("mrtvé tělo" + pozustalost);
        hrdina.setInventar(null);

        vychoziPozice = new Pozice(1, 1);
        mapa.setAktualniPozice(vychoziPozice);

    }

}


