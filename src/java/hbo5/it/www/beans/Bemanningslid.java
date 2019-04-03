/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;

/**
 *
 * @author c1042450
 */
public class Bemanningslid {
    private int id;
    private int luchtvaartmaatschappij_id;
    private int persson_id;
    private int functie_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLuchtvaartmaatschappij_id() {
        return luchtvaartmaatschappij_id;
    }

    public void setLuchtvaartmaatschappij_id(int luchtvaartmaatschappij_id) {
        this.luchtvaartmaatschappij_id = luchtvaartmaatschappij_id;
    }

    public int getPersson_id() {
        return persson_id;
    }

    public void setPersson_id(int persson_id) {
        this.persson_id = persson_id;
    }

    public int getFunctie_id() {
        return functie_id;
    }

    public void setFunctie_id(int functie_id) {
        this.functie_id = functie_id;
    }
}
