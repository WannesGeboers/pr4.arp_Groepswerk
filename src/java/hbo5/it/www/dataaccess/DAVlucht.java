/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.dataaccess;

import hbo5.it.www.beans.Vlucht;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author c1042450
 */
public class DAVlucht {
    private final String url, login, password;

public DAVlucht (String url, String login, String password, String driver) 
        throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
	     this.login = login;
	     this.password = password;
    }

public ArrayList<Vlucht> getAllvluchten() {
        ArrayList<Vlucht> vluchten=new ArrayList<>();
      try (
             Connection connection = DriverManager.getConnection(url,login,password);
      PreparedStatement statement=connection.prepareStatement("SELECT * FROM VLIEGTUIGTYPE");){
      ResultSet resultSet = statement.executeQuery();
    while(resultSet.next()) {
        Vlucht vlucht = new Vlucht();
        vlucht.setId(resultSet.getInt("ID"));
        vlucht.setCode(resultSet.getString("CODE"));
        vlucht.setVertrektijd(resultSet.getString("VERTREKTIJD"));
        vlucht.setAankomsttijd(resultSet.getString("AANKOMSTTIJD"));
        //Nog af te maken
        
        vluchten.add(vlucht);
        
    }
}
catch (Exception e) {
    e.printStackTrace();
}
   return vluchten; 
}
}
