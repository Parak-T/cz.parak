package com.company;

import com.company.akce.Jdi;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by TIBOR on 17.4.2016.
 */
public class JdiTest {


    @Test
    public void testJdi() throws Exception {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);

        Jdi jdiTest = new Jdi(mapa);
        jdiTest.proved(new String[]{"jdi", "sever"});
        assertEquals(new Pozice(1, 2), mapa.aktualniPozice);

    }

    @Test
    public void testTamNejdu() throws Exception {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);

        Jdi jdiTest = new Jdi(mapa);
        jdiTest.proved(new String[]{"jdi", "sever"});
        jdiTest.proved(new String[]{"jdi", "sever"});
        assertEquals(new Pozice(1, 2), mapa.aktualniPozice);

    }
}
