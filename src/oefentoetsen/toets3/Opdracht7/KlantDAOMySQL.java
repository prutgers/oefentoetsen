/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefentoetsen.toets3.Opdracht7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peter
 */
public class KlantDAOMySQL {
    
    public List<Klant> FindAll(){
        List<Klant> klantList = new ArrayList<>();
        String user = "user";
        String password = "wachtwoord";
        String datbaseUrl = "jdbc:mysql://localhost/bedrijf";
    
    //Connectie en PreparedStament (ook ResultSet) kunnen met try-with-resources geopend worden
        try(Connection connection = DriverManager.getConnection(datbaseUrl, user, password);
        PreparedStatement preparedStatement =
        connection.prepareStatement( "select * from klant" )) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Klant klant = new Klant();
                klant.setId(resultSet.getLong("id"));
                klant.setVoornaam(resultSet.getString("voornaam"));
                klant.setAchternaam(resultSet.getString("achternaam"));
                klant.setEmail(resultSet.getString("email"));
                klantList.add(klant);
            }
        resultSet.close(); //wordt sowieso samen met PreparedStament gesloten
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return klantList;
    }
}
