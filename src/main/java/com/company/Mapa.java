package com.company;

import com.company.akce.Jdi;
import com.company.akce.Poloz;
import com.company.akce.Utok;
import com.company.akce.Zvedni;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by TIBOR on 14.2.2016.
 */
public class Mapa {
    public Pozice aktualniPozice;
    //public Pozice vychoziPozice;

    public Map<Pozice, Lokace> povoleneLokace;

    public Mapa(Hrdina hrdina) {

        Jdi prikazJdi = new Jdi(this);
        Zvedni prikazZvedni = new Zvedni(this, hrdina);
        Poloz prikazPoloz = new Poloz(this, hrdina);
        Utok prikazUtok = new Utok(this, hrdina);

        ArrayList jdi = new ArrayList();
        jdi.add(prikazJdi.getPrikaz());
        jdi.add(prikazUtok.getPrikaz());

        ArrayList jdiZvedni = new ArrayList();
        jdiZvedni.add(prikazJdi.getPrikaz());
        jdiZvedni.add(prikazZvedni.getPrikaz());
        jdiZvedni.add(prikazUtok.getPrikaz());

        ArrayList jdiZvedniPoloz = new ArrayList();
        jdiZvedniPoloz.add(prikazJdi.getPrikaz());
        jdiZvedniPoloz.add(prikazZvedni.getPrikaz());
        jdiZvedniPoloz.add(prikazPoloz.getPrikaz());
        jdiZvedniPoloz.add(prikazUtok.getPrikaz());

        ArrayList predmety01 = new ArrayList();
        predmety01.add("kámen");
        predmety01.add("nůž");
        predmety01.add("cihlu");

        ArrayList predmety11 = new ArrayList();
        predmety11.add("kámen");

        ArrayList predmety12 = new ArrayList();
        predmety12.add("kámen");

        ArrayList predmety21 = new ArrayList();
        predmety21.add("kámen");

        ArrayList predmety10 = new ArrayList();
        predmety10.add("kámen");

        povoleneLokace = new HashMap<>();
        povoleneLokace.put(new Pozice(0, 1), new Lokace(jdiZvedniPoloz, predmety01));
        povoleneLokace.put(new Pozice(1, 1), new Lokace(jdiZvedniPoloz, new Bytost("Imp", 2, 4, 1), predmety11));
        povoleneLokace.put(new Pozice(2, 1), new Lokace(jdiZvedniPoloz, predmety21));
        povoleneLokace.put(new Pozice(1, 0), new Lokace(jdiZvedniPoloz, predmety10));
        povoleneLokace.put(new Pozice(1, 2), new Lokace(jdiZvedniPoloz, new Bytost("Okoun", 9, 10, 10), predmety12));

        aktualniPozice = (new Pozice(1, 1));
        //vychoziPozice = (new Pozice(1, 1));

    }

    public boolean muzuJit(String smer) {
        if (smer.equals("sever")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("jih")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("vychod")) {
            Pozice nova = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("zapad")) {
            Pozice nova = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return povoleneLokace.containsKey(nova);
        } else {
            return false;
        }
    }

    public Pozice jdi(String smer) {
        if (smer.equals("sever")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return aktualniPozice;
        } else if (smer.equals("jih")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return aktualniPozice;
        } else if (smer.equals("vychod")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return aktualniPozice;
        } else if (smer.equals("zapad")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return aktualniPozice;
        } else {
            return aktualniPozice;
        }
    }

    public Lokace getAktualniLokace() {
        return povoleneLokace.get(aktualniPozice);
    }

    public void setAktualniPozice(Pozice aktualniPozice) {
        this.aktualniPozice = aktualniPozice;
    }

    public String serialize (Pozice aktualniPozice) {
        String result = "";
        for(Lokace lokace: povoleneLokace.values()) {
            result += lokace.serialize();
        }
        result += "\n" + aktualniPozice.serialize();
        return  result;
    }


}


