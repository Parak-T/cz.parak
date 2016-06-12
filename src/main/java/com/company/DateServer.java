package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by TIBOR on 12.6.2016.
 */
public class DateServer {

    public static void main(String[] args) throws IOException {
        ServerSocket lisener = new ServerSocket(9090);
        Socket socket = lisener.accept (); // Zavolám  metodu accept a uložím ho, bez acceptu se na serveru nic nestane.
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(new Date().toString());
        socket.close();

    }
}
