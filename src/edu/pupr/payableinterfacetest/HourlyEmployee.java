/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 *  Program: <b><code>HourlyEmployee.java</code></b><br>
 *  Date   : 09/05/2015<br>
 *  Description:<br>
 *          HourlyEmployee class extends Employee, 
 *          which implements Payable.<br>
 * 
 *  @author Armando J. Escalante - escalanteaj@yahoo.com
 * 
 */

package edu.pupr.payableinterfacetest;

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;
    
    /**
     * Parameter constructors which receives the First Name, Last Name,
     * Social Security number, Hourly Wage and how many hours worked.
     * 
     * @param first
     * @param last
     * @param ssn
     * @param hourlyWage
     * @param hoursWorked 
     */
    public HourlyEmployee(String first, String last, String ssn,
            double hourlyWage, double hoursWorked){
        super(first, last, ssn);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    
    /**
     * Mutator of Wage
     * @param hourlyWage 
     */
    public void setWage(double hourlyWage){
        if(hourlyWage >= 0.0){
            wage = hourlyWage;
        }else{
            throw new IllegalArgumentException(
            "Houly wage must be >= 0.0");
            }
    }    
    /**
     * Accessor of Wage
     * @return salary
     */
    public double getWage(){
        return wage;
    }
    /**
     * Mutator of Salary
     * @param hoursWorked 
     */
    public void setHours(double hoursWorked){
        if ((hoursWorked >= 0.0)&&(hoursWorked <= 168.0)){
            hours = hoursWorked;
        }else{
            throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");
            }
    }
    /**
     * Accessor of Salary
     * @return salary
     */
    public double getHours(){
        return hours;
    }
    
    /**
     * Override abstract earnings method in Employee.
     * @return 
     */
    @Override
    public double getPaymentAmount(){
        
        if(getHours() <= 40){
            return getWage()*getHours();
        }else{
            return 40*getWage() + (getHours()-40)*getWage()*1.5;
        }
    }
    /**
     * Override of toString method.
     * 
     * @return 
     */
    @Override
    public String toString(){
        return String.format("Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Hourly wage", getWage(),
                "Hours worked", getHours());
    }    
}