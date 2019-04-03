/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.dataaccess;

import hbo5.it.www.beans.VluchtBemanning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author c1042450
 */
public class DAVluchtBemanning {
    private final String url, login, password;

public DAVluchtBemanning (String url, String login, String password, String driver) 
        throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
	     this.login = login;
	     this.password = password;
    }

public ArrayList<VluchtBemanning> getAllVluchtbemanningen() {
        ArrayList<VluchtBemanning> vluchtbemanningen=new ArrayList<>();
      try (
             Connection connection = DriverManager.getConnection(url,login,password);
      PreparedStatement statement=connection.prepareStatement("SELECT * FROM VLIEGTUIGTYPE");){
      ResultSet resultSet = statement.executeQuery();
    while(resultSet.next()) {
        VluchtBemanning vluchtBemanning = new VluchtBemanning();
        vluchtBemanning.setId(resultSet.getInt("ID"));
        vluchtBemanning.setTaak(resultSet.getString("Taak"));
        vluchtBemanning.setVlucht_id(resultSet.getInt("vlucht_ID"));
        vluchtBemanning.setBemanningslid_id(resultSet.getInt("bemanningslid_ID"));
        
        vluchtbemanningen.add(vluchtBemanning);
        
    }
}
catch (Exception e) {
    e.printStackTrace();
}
   return vluchtbemanningen; 
}

}
