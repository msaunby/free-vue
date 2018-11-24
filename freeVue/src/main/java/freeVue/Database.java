package freeVue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public final class Database {

    String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=FREE_VUE;user=VueAdmin;password=fr33$7uE123";

    public Database() {
    }

    public void getVenues() {
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("select * from " + "VENUES");){
                // Iterate through the data              
                 while(rs.next()){
                }

            }
        // Handle any errors that may have occurred.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
