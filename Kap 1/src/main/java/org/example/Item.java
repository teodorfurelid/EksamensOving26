package org.example;

public class Item {

    private String objekt;
    private int antall;

    public Item(String objekt, int antall) {
        this.objekt = objekt;
        this.antall = antall;
    }

    public String getObjekt() {
        return this.objekt;
    }

    public void setObjekt(String nyObjekt) {
        this.objekt = nyObjekt;
    }

    public int getAntall() {
        return this.antall;
    }

    public void setAntall(int nyAntall) {
        this.antall = nyAntall;
    }
}
