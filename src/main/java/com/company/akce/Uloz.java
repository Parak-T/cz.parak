package com.company.akce;

import com.company.Hrdina;
import com.company.Mapa;

import java.io.FileWriter;

/**
 * Created by TIBOR on 15.5.2016.
 */
public class Uloz extends Akce {

    Mapa mapa;
    Hrdina hrdina;

    public Uloz() {
        super("ulož", 1);
    }

    public void proved(String[] parametry) {
        try {
            FileWriter fw = new FileWriter(parametry [1] + ".txt");
            fw.append(""); //do závorky napsat co se má psát do .txt

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
