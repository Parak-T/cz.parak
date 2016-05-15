package com.company;

/**
 * Created by TIBOR on 3.4.2016.
 */
public class Bytost {
    String jmeno;
    Integer zivoty;
    Integer utok;
    Integer obrana;

    public Bytost(String jmeno, int zivoty, int utok, int obrana) {
        this.jmeno = jmeno;
        this.zivoty = zivoty;
        this.utok = utok;
        this.obrana = obrana;
    }
    public String toString() {
        return "monstrum - "+jmeno;
    }

    public String getJmeno() {
        return jmeno;
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
}
