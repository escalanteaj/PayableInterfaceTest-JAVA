/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 *  Program: <b><code>CommissionEmployee.java</code></b><br>
 *  Date   : 09/05/2015<br>
 *  Description:<br>
 *          CommisionEmployee class extends Employee, 
 *          which implements Payable.<br>
 * 
 *  @author Armando J. Escalante - escalanteaj@yahoo.com
 * 
 */

package edu.pupr.payableinterfacetest;

public class CommissionEmployee extends Employee
{
    private double grossSales;
    private double commissionRate;
    
    /**
     * Parameter constructor which receives the First Name, Last Names,
     * Social Security number, number of sales and rate per sale.
     * @param first
     * @param last
     * @param ssn
     * @param sales
     * @param rate 
     */
    public CommissionEmployee(String first, String last, String ssn, 
            double sales, double rate){
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    
    /**
     * Mutator of Commission Rate
     * @param rate 
     */
    public void setCommissionRate(double rate){
        if(rate > 0.0 && rate < 1.0){
            commissionRate = rate;
        }else{
            throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
        }
    }
    /**
     * Accessor of Commission Rate
     * @return 
     */
    public double getCommissionRate(){
          return commissionRate;          
    }
    /**
     * Mutator of Gross Sales
     * @param sales 
     */
    public void setGrossSales(double sales){
        if(sales >= 0.0){
            grossSales = sales;
        }else{
            throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
        }
    }
    /**
     * Accessor of Gross Sales
     * @return 
     */
    public double getGrossSales(){
        return grossSales;
    }
    
    /**
     * Override of the abstract method earnings in Employee
     * @return 
     */
    @Override
    public double getPaymentAmount(){
        return getCommissionRate() * getGrossSales();
    }
    /**
     * Override of method toString
     * 
     * @return 
     */
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "Commission employee", super.toString(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate());
    }
            

    
}
