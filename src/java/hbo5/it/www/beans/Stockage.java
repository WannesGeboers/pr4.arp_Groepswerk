package hbo5.it.www.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c1042450
 */
public class Stockage {
    private int id;
    private String reden;
    private String vandatum;
    private String totdatum;
    private int vliegtuig_id;
    private int hangar_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReden() {
        return reden;
    }

    public void setReden(String reden) {
        this.reden = reden;
    }

    public String getVandatum() {
        return vandatum;
    }

    public void setVandatum(String vandatum) {
        this.vandatum = vandatum;
    }

    public String getTotdatum() {
        return totdatum;
    }

    public void setTotdatum(String totdatum) {
        this.totdatum = totdatum;
    }

    public int getVliegtuig_id() {
        return vliegtuig_id;
    }

    public void setVliegtuig_id(int vliegtuig_id) {
        this.vliegtuig_id = vliegtuig_id;
    }

    public int getHangar_id() {
        return hangar_id;
    }

    public void setHangar_id(int hangar_id) {
        this.hangar_id = hangar_id;
    }
}
