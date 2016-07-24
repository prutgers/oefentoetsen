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
 * 
 * Deze klasse zal niet werken tenzij je een SQL tabel creert waarbij je kan in loggen met user/wachtwoord.
 * De tabel moet klant heten en voorzien zijn van id, voornaam, achternaam en email.
 */
public class KlantDAOMySQL {
    
    public List<Klant> FindAll(){
        //maar een lijst aan waar klanten in kunnen
        List<Klant> klantList = new ArrayList<>();
        
        //Instellingen voor de database
        String user = "user";
        String password = "wachtwoord";
        String datbaseUrl = "jdbc:mysql://localhost/bedrijf";
    
        //Probeer connectie te maken met de DB (zal dus mislukken als deze niet bestaat)
        // Instellen van het PreparedStatement, in dit geval voegt het preparedstatement niet heel veel toe
        //ten opzichte van een gewoon statement
        try(Connection connection = DriverManager.getConnection(datbaseUrl, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement( "select * from klant" )) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Klant klant = new Klant();
                klant.setId(resultSet.getLong("id"));
                klant.setVoornaam(resultSet.getString("voornaam"));
                klant.setAchternaam(resultSet.getString("achternaam"));
                klant.setEmail(resultSet.getString("email"));
                klantList.add(klant);
            }
        //Een prepared statement sluit automatisch de verbinding af dus dat hoeft nu niet te gebeuren.
        
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return klantList;
    }
}
