package com.company;

import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by TIBOR on 22.5.2016.
 */
public class MapaTestSerialize {

    @Test



    public void testMapa() throws Exception {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);

        String result = mapa.serialize();
        System.out.println(result);
    }
}
