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
public class studentConnection extends DBConnection {
    private String retrieveQuery;
    
    public studentConnection(final String dbName){
        this.connectDatabase(dbName);
    }
    
    public void insertRecord(final String firstName, final String surName, final String className, final String pRole, final String sRole){
        final String insertStmt = "INSERT INTO richard.students (FIRSTNAME, SURNAME, CLASS, PREFERREDROLE, STRONGROLE) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(insertStmt);
            pstmt.setString(1, firstName);
            pstmt.setString(2, surName);
            pstmt.setString(3, className);
            pstmt.setString(4, pRole);
            pstmt.setString(5, sRole);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.out.println("Exception when inserting Student record: " + sqle.toString());
        }
    }
    
    public void deleteRecord(final String firstName, final String surName){
        final String deleteStmt = "DELETE FROM richard.students WHERE FIRSTNAME = ? AND SURNAME = ?";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(deleteStmt);
            pstmt.setString(1, firstName);
            pstmt.setString(2, surName);
            pstmt.executeUpdate();
        }catch(SQLException sqle){
            System.err.println("Exception when deleting student from the database: " + sqle.toString());
        }
    }
    
    public void findSkill(final String skillName){
        final String retrieveSkills = "SELECT FIRSTNAME from richard.students WHERE STRONGROLE = ?";
        try{
            PreparedStatement pstmt = getConnection().prepareStatement(retrieveSkills);
            pstmt.setString(5, skillName);
            pstmt.executeQuery();
        }catch(SQLException sqle){
            System.err.println("Exception retrieving skills from database: " + sqle.toString());
        }
    }
}
