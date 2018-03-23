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
        final String insertStmt = "INSERT INTO richard.classes (CLASSNAME) VALUES (?)";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(insertStmt);
            pstmt.setString(1, roleName);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exception when inserting class record: " + sqle.toString());
        }
    }
}
