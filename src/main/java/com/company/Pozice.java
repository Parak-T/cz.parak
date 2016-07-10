package com.company;

/**
 * Created by TIBOR on 14.2.2016.
 */
public class Pozice {
    public Pozice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x;//proměnná v instanci třídy
    public int y;

    @Override
    public boolean equals(Object obj) {//metoda

        if (!(obj instanceof Pozice)) {
            return false;
        }

        Pozice poz = (Pozice) obj; //proměnná v metodě
        if ( x == poz.getX() && y == poz.getY() ){
          return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return getX()+","+getY();
    }

    public String serialize () {
        return "lok#" + getX() + "," + getY();
    }
}