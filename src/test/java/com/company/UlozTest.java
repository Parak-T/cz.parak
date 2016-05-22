package com.company;

import com.company.akce.Uloz;
import org.junit.Test;

/**
 * Created by TIBOR on 15.5.2016.
 */
public class UlozTest {
    @Test
    public void testUloz() throws Exception {
        Hrdina hrdina = new Hrdina();
        Uloz ulozTest = new Uloz(new Mapa(hrdina), new Hrdina());
        ulozTest.proved(new String[]{"ulož","ulozTest"});

    }
}
