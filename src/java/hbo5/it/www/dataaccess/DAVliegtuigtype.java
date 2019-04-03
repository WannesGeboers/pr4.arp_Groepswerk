/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.dataaccess;

import hbo5.it.www.beans.Vliegtuigtype;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Wannes
 */
public class DAVliegtuigtype {
    private final String url, login, password;

public DAVliegtuigtype (String url, String login, String password, String driver) 
        throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
	     this.login = login;
	     this.password = password;
    }


    public ArrayList<Vliegtuigtype> getAllVliegtuigtypes() {
        ArrayList<Vliegtuigtype> vliegtuigtypes=new ArrayList<>();
      try (
             Connection connection = DriverManager.getConnection(url,login,password);
      PreparedStatement statement=connection.prepareStatement("SELECT * FROM VLIEGTUIGTYPE");){
      ResultSet resultSet = statement.executeQuery();
    while(resultSet.next()) {
        Vliegtuigtype vliegtuigtype = new Vliegtuigtype();
        vliegtuigtype.setId(resultSet.getInt("ID"));
        vliegtuigtype.setTypenaam(resultSet.getString("TYPENAAM"));
      
        
        vliegtuigtypes.add(vliegtuigtype);
    }
}
catch (Exception e) {
    e.printStackTrace();
}
   return vliegtuigtypes; 
}

}
