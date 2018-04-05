package databaseObjects;

/**
 *
 * @author Andrew
 */
public class Student {
    
    private String firstName;
    private String surName;
    private String myClass;
    private String preferredRole;
    private String strongRole;
    
    public Student(String firstName, String surName, String myClass, String preferredRole, String strongRole) {
        this.firstName = firstName;
        this.surName = surName;
        this.myClass = myClass;
        this.preferredRole = preferredRole;
        this.strongRole = strongRole;
    }
    
    public String getStudentClass(){
        return this.myClass;
    }
    
    public String getStrongRole(){
        return this.strongRole;
    }
    
    public String getPreferredRole() {
        return this.preferredRole;
    }
    
    public String getFirstName() {
        return this.firstName;    
    }
    
    public String getSurName() {
        return this.surName;    
    }
    
    
}
