package com.company;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by TIBOR on 12.6.2016.
 */
public class DateServerTest {

    @Test
    public void testDateServer() throws Exception {
        for (int i = 0; i < 3; i++) {
            Socket outSocket = new Socket("localhost", 9090); //localhost je konvenční jméno pro IP tohoto počítače
            BufferedReader in = new BufferedReader(new InputStreamReader(outSocket.getInputStream())); //zabalí příchozí data do celku
            System.out.println(in.readLine());
        }
    }


}
