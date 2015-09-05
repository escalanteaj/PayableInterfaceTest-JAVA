/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 *  Program: <b><code>SalariedEmployee.java</code></b><br>
 *  Date   : 09/05/2015<br>
 *  Description:<br>
 *          SalariedEmployee class extends Employee, 
 *          which implements Payable.<br>
 * 
 *  @author Armando J. Escalante - escalanteaj@yahoo.com
 * 
 */

package edu.pupr.payableinterfacetest;

public class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    /**
     * Parameter constructor.
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param weeklySalary 
     */
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
        double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }
    
    /**
     * Accessor of Weekly Salary.
     * @return 
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }
    /**
     * Mutator of Weekly Salary.
     * @param weeklySalary 
     */
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary >= 0.0){
            this.weeklySalary = weeklySalary;
        }else{
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
    }
    
    /**
     * Override of getPaymentAmount method.
     * @return 
     */
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    /**
     * Override of toString method.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Salaried employee: %s\n%s: $%,.2f",
           super.toString(), "Weekly salary", getWeeklySalary());     
    }
}
