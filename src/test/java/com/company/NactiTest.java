package com.company;

import com.company.akce.Nacti;
import org.junit.Test;

/**
 * Created by TIBOR on 19.6.2016.
 */
public class NactiTest {
    @Test
    public void testNacti() throws Exception {

        Nacti nactiTest = new Nacti();
        nactiTest.proved(new String[]{"načti","ulozTest"});

    }
}
