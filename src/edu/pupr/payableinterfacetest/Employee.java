/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 *  Program: <b><code>Employee.java</code></b><br>
 *  Date   : 09/05/2015<br>
 *  Description:<br>
 *          Employee abstract superclass that implements Payable.<br>
 * 
 *  @author Armando J. Escalante - escalanteaj@yahoo.com
 * 
 */

package edu.pupr.payableinterfacetest;

public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    
    /**
     * Parameter constructor.
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber 
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
      
    /**
     * Mutator of First Name.
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Accessor of First Name.
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Mutator of Last Name.
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Accessor of Last Name.
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Mutator of Social Security Number.
     * @return 
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    /**
     * Accessor of Social Security Number.
     * @param socialSecurityNumber 
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s\nSocial Security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());         
    }              
}
