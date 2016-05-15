package com.company.akce;

import com.company.Mapa;
import com.company.Pozice;

/**
 * Created by TIBOR on 28. 2. 2016.
 */
public class Jdi extends Akce {
            public Jdi(Mapa mapa) { // konstruktor se odkazuje na classu Mapa
                super("jdi", 1);
                this.mapa = mapa;

    }

    Mapa mapa;

    public void proved(String[] parametry) {
        if (!mapa.muzuJit(parametry[1])) {
            System.out.println("Jejda, zeď. Tudy to nepůjde.");
        } else {
            Pozice nova = mapa.jdi(parametry[1]);
            System.out.println("Vešel jsi do místnosti" + nova);
            mapa.getAktualniLokace().vypis ();
        }
    }

}
