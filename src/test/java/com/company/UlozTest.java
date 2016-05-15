package com.company;

import com.company.akce.Uloz;
import org.junit.Test;

/**
 * Created by TIBOR on 15.5.2016.
 */
public class UlozTest {
    @Test
    public void testUloz() throws Exception {
        Uloz ulozTest = new Uloz();
        ulozTest.proved(new String[]{"ulož"});

    }
}
