package com.company;

/**
 * Created by TIBOR on 3.4.2016.
 */
public class Hrdina extends Bytost{
    Inventar inventar;

    public Hrdina(){
        super ("Borec",10, 1, 1);
        inventar = new Inventar();

    }

    public Inventar getInventar() {
        return inventar;
    }

    public Integer getZivoty() {
        return zivoty;
    }

    public Integer getUtok() {
        return utok;
    }

    public Integer getObrana() {
        return obrana;
    }

    public void setZivoty(Integer zivoty) {
        this.zivoty = zivoty;
    }

    public void setInventar(Inventar inventar) {
        this.inventar = inventar;
    }

    public String serialize () {
        Inventar inventar = new Inventar();
        return "hrd#" + getJmeno() + "#" + getZivoty() + "#" + getUtok() + "#" + getObrana() + "\n" + inventar.serialize();
    }
}
