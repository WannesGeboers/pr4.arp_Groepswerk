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
public class Luchthaven {
    private int id;
    private String luchthavennaam;
    private String stad;
    private int land_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLuchthavennaam() {
        return luchthavennaam;
    }

    public void setLuchthavennaam(String luchthavennaam) {
        this.luchthavennaam = luchthavennaam;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public int getLand_id() {
        return land_id;
    }

    public void setLand_id(int land_id) {
        this.land_id = land_id;
    }
}
