package com.company;

/**
 * Created by TIBOR on 3.4.2016.
 */
public class Boj {

    public void kolo(Hrdina hrdina, Bytost bytost, Lokace aktualniLokace, Mapa mapa, Reinkarnace res) {
        if (aktualniLokace.jeBytost() == false) {
            System.out.println("Není na koho zaútočit.");
        } else {
            utok(hrdina, bytost, aktualniLokace);
            obrana(hrdina, bytost, aktualniLokace, mapa, res);
        }
    }

    private void utok(Hrdina hrdina, Bytost bytost, Lokace aktualniLokace) {

        Integer utokHrd = hrdina.getUtok();
        Integer obranaByt = bytost.getObrana();

        Integer hodHrd = (int) Math.round(Math.random() * 6);
        Integer hodByt = (int) Math.round(Math.random() * 6);

        int utokHrdCelkem = utokHrd + hodHrd;
        int obranaBytCelkem = obranaByt + hodByt;
        int rozdilB = utokHrdCelkem - obranaBytCelkem;

        if (utokHrdCelkem > obranaBytCelkem) {
            bytost.setZivoty(bytost.getZivoty() - rozdilB);

            if (bytost.getZivoty() <= 0) {
                System.out.println(bytost.getJmeno() + " se neubránil.");
                System.out.println("Zranil jsi ho za " + rozdilB + ".");
                System.out.println(bytost.getJmeno() + " je mrtev.");

                aktualniLokace.pridejPredmet("Mrtvola: " + bytost.getJmeno());

                aktualniLokace.odeberBytost();

            } else {
                System.out.println(bytost.getJmeno() + " se neubránil.");
                System.out.println("Zranil jsi ho za " + rozdilB + ".");
                System.out.println(bytost.getJmeno() + " má ještě " + bytost.getZivoty());
            }


        } else {
            System.out.println(bytost.getJmeno() + " se ubránil útoku.");
            System.out.println(bytost.getJmeno() + " má ještě " + bytost.getZivoty());
        }

    }

    private void obrana(Hrdina hrdina, Bytost bytost, Lokace aktualniLokace, Mapa mapa, Reinkarnace res) {
        Integer utokByt = bytost.getUtok();
        Integer obranaHrd = hrdina.getObrana();
        Integer zivotyHrd = hrdina.getZivoty();

        Integer hodHrd = (int) Math.round(Math.random() * 6);
        Integer hodByt = (int) Math.round(Math.random() * 6);

        int obranaHrdCelkem = obranaHrd + hodHrd;
        int utokBytCelkem = utokByt + hodByt;
        int rozdil = utokBytCelkem - obranaHrdCelkem;


        if (utokBytCelkem > obranaHrdCelkem) {
            hrdina.setZivoty(hrdina.getZivoty() - rozdil);

            if (zivotyHrd < 0) {
                System.out.println(bytost.getJmeno() + " tě zranil za " + rozdil);
                System.out.println("Tvé zbývající životy: " + hrdina.getZivoty());
            } else {
                System.out.println(bytost.getJmeno() + " tě zranil za " + rozdil);
                System.out.println("Zemřel jsi.");
                res.proved(hrdina, mapa, aktualniLokace);
                //aktualniLokace.pridejPredmet("Tělo hrdiny");
                //mapa.setAktualniPozice(mapa.vychoziPozice);
                //System.out.println("Jsi znovuzrozen ve vstupní místnosti " + mapa.vychoziPozice + ".");
                mapa.getAktualniLokace().vypis();
                //hrdina.setZivoty(10);

            }
        } else {
            System.out.println("Ubránil ses protiútoku.");
            System.out.println("Tvé zbývající životy: " + hrdina.getZivoty());
        }
    }

}

