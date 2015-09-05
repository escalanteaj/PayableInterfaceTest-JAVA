/*
 * *************************************************
 *      Polytechnic University of Puerto Rico      *
 *   Electrical & Computer Engineering Department  * 
 *              Hato Rey, Puerto Rico              *
 *                                                 *
 *         CECS 3210 Advanced Programming          *
 * *************************************************
 * 
 *  Program: <b><code>Invoice.java</code></b><br>
 *  Date   : 09/05/2015<br>
 *  Description:<br>
 *          Invoice class that implements Payable.<br>
 * 
 *  @author Armando J. Escalante - escalanteaj@yahoo.com
 * 
 */

package edu.pupr.payableinterfacetest;

public class Invoice implements Payable{
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    /**
     * Parameter constructor
     * @param part
     * @param description
     * @param count
     * @param price 
     */
    public Invoice(String part, String description, int count,
            double price){
        partNumber = part;
        partDescription = description;
        setQuantity(count);
        setPricePerItem(price);
    }

    /**Accessor for Part Number.
     * @return 
     */
    public String getPartNumber() {
        return partNumber;
    }    
    /**
     * Mutator for Part Number.
     * @param partNumber 
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    /**
     * Accessor for Part Description.
     * @return 
     */
    public String getPartDescription() {
        return partDescription;
    }
    /**
     * Mutator for Part Description.
     * @param partDescription 
     */
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    /**
     * Accessor for Quantity.
     * @return 
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Mutator for Quantity.
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        if(quantity >= 0){
           this.quantity = quantity; 
        }else{
            throw new IllegalArgumentException("Quantity must be >=0");
        }
    }
    /**Accessor for Price Per Item.
     * @return 
     */
    public double getPricePerItem() {
        return pricePerItem;
    }
    /**
     * Mutator for Price Per Item.
     * @param pricePerItem 
     */
    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem >= 0){
        this.pricePerItem = pricePerItem;
        }else{
            throw new IllegalArgumentException(
                    "Price per item must be >=0");
        }
    }
    
    /**
     * Override of toString method.
     * @return 
     */
    @Override
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "Invoice", "Part number", getPartNumber(), getPartDescription(),
                "Quantity", getQuantity(), "Price per item", getPricePerItem());
    }
    /**
     * Override of getPaymentAmount method.
     * @return 
     */
    @Override
    public double getPaymentAmount(){
        return getQuantity()*getPricePerItem();
    }
}
