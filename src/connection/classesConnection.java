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
public class classesConnection extends DBConnection{
    private String retrieveQuery;
    
    public classesConnection(final String dbName){
        this.connectDatabase(dbName);
    }
    
    public void insertRecord(final String className){
        final String insertStmt = "INSERT INTO richard.classes (CLASSNAME) VALUES (?)";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(insertStmt);
            pstmt.setString(1, className);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exception when inserting class record: " + sqle.toString());
        }
    }
    
    public void deleteRecord(final String className){
        final String deleteStmt = "DELETE FROM richard.classes WHERE CLASSNAME = ?";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(deleteStmt);
            pstmt.setString(1, className);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.err.println("Exception when deleting class from database: " + sqle.toString());
        }
    }
}
