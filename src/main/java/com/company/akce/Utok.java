package com.company.akce;

import com.company.*;

/**
 * Created by TIBOR on 10.4.2016.
 */
public class Utok extends Akce {

    Mapa mapa;
    Hrdina hrdina;
    Boj boj;

    public Utok(Mapa mapa, Hrdina hrdina) {
        super("napadni", 0);
        this.mapa = mapa;
        this.hrdina = hrdina;
        this.boj = new Boj();
    }

    public Utok(Mapa mapa, Hrdina hrdina, Boj boj) {
        super("napadni", 0);
        this.mapa = mapa;
        this.hrdina = hrdina;
        this.boj = boj;

    }

    public void proved(String[] parametry) {
        Lokace aktualniLokace = mapa.getAktualniLokace();
        Bytost bytost = aktualniLokace.getBytost();
        boj.kolo(hrdina, bytost, aktualniLokace, mapa, null);

    }

}


