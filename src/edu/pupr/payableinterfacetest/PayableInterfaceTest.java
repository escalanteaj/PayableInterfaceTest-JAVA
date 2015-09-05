/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 *  Program: <b><code>PayableInterfaceTest.java</code></b><br>
 *  Date   : 09/05/2015<br>
 *  Description:<br>
 *          Tests interface Payable.<br>
 * 
 *  @author Armando J. Escalante - escalanteaj@yahoo.com
 * 
 */
package edu.pupr.payableinterfacetest;

public class PayableInterfaceTest{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Payable[] payableObjects = new Payable[6];
        
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = 
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = 
                new HourlyEmployee("Larry", "Bird", "222-22-2222", 33.00, 40);
        payableObjects[4] = 
                new CommissionEmployee("Magic", "Johnson", "333-33-3333", 1350, 0.85);
        payableObjects[5] = 
                new BasePlusCommissionEmployee("LeBron", "James", "666-66-6666", 1175, 0.95, 660.00);     
        
        System.out.println(
                "Invoices and Employees processed polymorphically:\n");
        
        for(Payable currentPayable : payableObjects){
            System.out.printf("%s \n%s: $%,.2f\n\n", 
                    currentPayable.toString(),
                    "Payment due", currentPayable.getPaymentAmount());
        }
        
        for (Payable currentPayable : payableObjects){
            if(currentPayable instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = 
                        (BasePlusCommissionEmployee)currentPayable;
                double employeePay = employee.getBaseSalary();
                double newSalary = employeePay + (employeePay * .10);
                employee.setBaseSalary(newSalary);
            
                System.out.printf("The base pay of " + employee.getFirstName() + " " +
                        employee.getLastName() + " with a 10%% raise is %.2f\n", 
                        newSalary);
            }
            
          }   
    }   
}
