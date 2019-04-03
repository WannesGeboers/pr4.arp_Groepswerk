/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.dataaccess;

import hbo5.it.www.beans.Bemanningslid;
import hbo5.it.www.beans.Vliegtuigtype;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Wannes
 */
public class DABemanningslid {
      private final String url, login, password;

public DABemanningslid (String url, String login, String password, String driver) 
        throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
	     this.login = login;
	     this.password = password;
    }


    public ArrayList<Bemanningslid> getAllBemanningsleden() {
        ArrayList<Bemanningslid> bemanningsleden=new ArrayList<>();
      try (
             Connection connection = DriverManager.getConnection(url,login,password);
      PreparedStatement statement=connection.prepareStatement("SELECT * FROM BEMANNINGSLID");){
      ResultSet resultSet = statement.executeQuery();
    while(resultSet.next()) {
        Bemanningslid bemanningslid = new Bemanningslid();
        bemanningslid.setId(resultSet.getInt("ID"));
        bemanningslid.setFunctie_id(resultSet.getInt("FUNCTIE_ID"));
        bemanningslid.setLuchtvaartmaatschappij_id(resultSet.getInt("LUCHTVAARTMAATSCHAPPIJ_ID"));
        bemanningslid.setPersoon_id(resultSet.getInt("PERSOON_ID"));
        bemanningsleden.add(bemanningslid);
    }
}
catch (Exception e) {
    e.printStackTrace();
}
   return bemanningsleden; 
}  
}
