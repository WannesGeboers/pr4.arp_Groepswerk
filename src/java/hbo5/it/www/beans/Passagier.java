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
public class Passagier {
    private int id;
    private int ingeschreven;
    private int ingecheckt;
    private int klasse_id;
    private String plaats;
    private int vluch_id;
    private int persson_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIngeschreven() {
        return ingeschreven;
    }

    public void setIngeschreven(int ingeschreven) {
        this.ingeschreven = ingeschreven;
    }

    public int getIngecheckt() {
        return ingecheckt;
    }

    public void setIngecheckt(int ingecheckt) {
        this.ingecheckt = ingecheckt;
    }

    public int getKlasse_id() {
        return klasse_id;
    }

    public void setKlasse_id(int klasse_id) {
        this.klasse_id = klasse_id;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public int getVluch_id() {
        return vluch_id;
    }

    public void setVluch_id(int vluch_id) {
        this.vluch_id = vluch_id;
    }

    public int getPersson_id() {
        return persson_id;
    }

    public void setPersson_id(int persson_id) {
        this.persson_id = persson_id;
    }
}
