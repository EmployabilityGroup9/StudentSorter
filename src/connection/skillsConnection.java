/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

/**
 *
 * @author rwals
 */
public class skillsConnection extends DBConnection{
    private String retrieveQuery;
    
    public skillsConnection(final String dbName){
        this.connectDatabase(dbName);
    }
    
    public void insertRecord(final String skill, final boolean rat1, final boolean rat2, final boolean rat3, final boolean rat4, final boolean rat5){
        final String insertStmt = "INSERT INTO richard.skills (SKILL, ONE, TWO, THREE, FOUR, FIVE) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(insertStmt);
            pstmt.setString(1, skill);
            pstmt.setBoolean(2, rat1);
            pstmt.setBoolean(3, rat2);
            pstmt.setBoolean(4, rat3);
            pstmt.setBoolean(5, rat4);
            pstmt.setBoolean(6, rat5);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exception when inserting skill record: " + sqle.toString());
        }
    }
}
