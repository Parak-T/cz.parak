package com.company.akce;

import com.company.Hrdina;
import com.company.Mapa;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by TIBOR on 15.5.2016.
 */
public class Nacti extends Akce {

    public Nacti() {
        super("načti", 1);

    }

    public void proved(String[] parametry) {
        try {
            FileReader fr = new FileReader(parametry [1] + ".txt");
            BufferedReader br = new BufferedReader(fr);
            StringBuffer result = new StringBuffer();
            br.lines()
                    .forEach(line -> result.append(line));

            System.out.println(result);
            br.close();
        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public void deserialize (){

    }

}
