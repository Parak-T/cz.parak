package com.company;

import com.company.akce.Jdi;
import com.company.akce.Poloz;
import com.company.akce.Utok;
import com.company.akce.Zvedni;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi jdi = new Jdi(mapa);
        Zvedni zvedni = new Zvedni(mapa, hrdina);
        Poloz poloz = new Poloz(mapa, hrdina);
        Utok utok = new Utok (mapa, hrdina);


        Scanner načítej = new Scanner(System.in);
        while (načítej.hasNextLine()) {
            Lokace lokace = mapa.getAktualniLokace();
            String příkaz = načítej.nextLine();
            String[] rozdeleni = příkaz.split(" ");

            if (příkaz.equals("vypiš batoh")) {
                hrdina.getInventar().vypis();
            }
            else if (příkaz.equals("Co vidím?")) {
                mapa.getAktualniLokace().vypis();
            }
            else if (lokace.jdeProvest(rozdeleni[0])) {
                if (poloz.rozumimPrikazu(rozdeleni)) {
                    poloz.proved(rozdeleni);
                }
                if (jdi.rozumimPrikazu(rozdeleni)) {
                    jdi.proved(rozdeleni);
                }
                if (zvedni.rozumimPrikazu(rozdeleni)) {
                    zvedni.proved(rozdeleni);
                }
                if (utok.rozumimPrikazu(rozdeleni)) {
                    utok.proved(rozdeleni);
                }
            } else {
                System.out.println("Toto zde nelze udělat.");
            }
        }

    }
}


    /*public static void main(String[] args) throws IOException {
       Inventar truhla = new Inventar();
       truhla.přidat("vidlička");
       truhla.přidat("nůž");
       truhla.přidat("lžíce");
        truhla.přidat("veverka");

       truhla.vypiš();

       truhla.odeber("nůž");

       truhla.vypiš();

        truhla.přidat("sekera");

        truhla.vypiš();

        System.out.println("napiš cokoli"); // třída System pošle do konzoly text

        Scanner načítej = new Scanner(System.in); // vytvoří nový objekt Scanner pojmenovaný "načítej"
        while (načítej.hasNextLine()) { // dokud
            String příkaz = načítej.nextLine(); // řetězec "příkaz"
            if (příkaz.equals("vypiš")) {
                truhla.vypiš();// write your code here
            }
            String[] rozdělení = příkaz.split(" ");
            if (rozdělení[0].equals("seber")) {
                truhla.přidat(rozdělení[1]);
            }
            if (rozdělení[0].equals("polož")) {
                truhla.odeber(rozdělení[1]);
            }
            if (rozdělení[0].equals("zabij") && rozdělení[1].equals("veverka")) {
                if (truhla.ověř(rozdělení[1])) {
                    truhla.odeber(rozdělení[1]);
                    truhla.přidat("mrtvá veverka");
                } else {
                    System.out.println("chyť si veverku");
                }
            }
        }
    }

    //public static void pozice(String[] pos ) throws IOException {
    //Mapa pozice = new Mapa();

    //Scanner pozice = new Scanner(System.in);

    //String jdi = Pozice.nextLine();
    //if (jdi.equals("Kampak?")) {
    //pozice.napiš();
    //}
    //}
*/