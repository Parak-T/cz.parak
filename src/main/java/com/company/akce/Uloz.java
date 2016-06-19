package com.company.akce;

import com.company.Hrdina;
import com.company.Mapa;
import com.company.Pozice;

import java.io.FileWriter;

/**
 * Created by TIBOR on 15.5.2016.
 */
public class Uloz extends Akce {

    Mapa mapa;
    Hrdina hrdina;

    public Uloz(Mapa mapa, Hrdina hrdina) {
        super("ulož", 1);
        this.mapa = mapa;
        this.hrdina = hrdina;
    }

    public void proved(String[] parametry) {
        try {

            FileWriter fw = new FileWriter(parametry [1] + ".txt");
            fw.append(mapa.serialize() + "\n" + hrdina.serialize()); //do závorky napsat co se má psát do .txt
            fw.flush();
            fw.close();

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
