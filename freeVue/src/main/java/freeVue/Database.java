package freeVue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public final class Database {

    String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=FREE_VUE;user=VueAdmin;password=fr33$7uE123";

    public Database() {
    }

    public void getVenues() {
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("select * from VENUES");){
                // Iterate through the data              
                 while(rs.next()){
                }

            }
        // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Screening> getScreenings() {
        //String query =  "select * from SCREENINGS";
        String query =  "select SCREENING_ID, DATE, NAME, TITLE "
        + " from SCREENINGS " 
        + " INNER JOIN FILMS ON SCREENINGS.FILM_ID=FILMS.FILM_ID "
        + " INNER JOIN VENUES ON SCREENINGS.VENUE_ID=VENUES.VENUE_ID";
        List<Screening> screenings = new ArrayList<Screening>();
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            try (ResultSet rs = stmt.executeQuery(query);){
                // Iterate through the data              
                 while(rs.next()){
                    System.out.println("ID: " + rs.getObject(1));
                    System.out.println("Date: " + rs.getObject(2));
                    System.out.println("Venue: " + rs.getObject(3));
                    System.out.println("Film: " + rs.getObject(4));
                    screenings.add(new Screening(rs.getInt(1),(Date)rs.getObject(2),rs.getString(3),rs.getString(4)));
                }

            }
        // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return screenings;
    }
}
