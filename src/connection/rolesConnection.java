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
public class rolesConnection extends DBConnection{
    private String retrieveQuery;
    
    public rolesConnection(final String dbName){
        this.connectDatabase(dbName);
    }
    
    public void insertRecord(final String roleName){
        final String insertStmt = "INSERT INTO richard.roles (ROLE) VALUES (?)";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(insertStmt);
            pstmt.setString(1, roleName);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exception when inserting role record: " + sqle.toString());
        }
    }
    
    public void deleteRcord(final String roleName){
        final String deleteStmt = "DELETE FROM richard.roles WHERE ROLE = ?";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(deleteStmt);
            pstmt.setString(1, roleName);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.err.println("Error deleting role from the database: " + sqle.toString());
        }
    }
}
