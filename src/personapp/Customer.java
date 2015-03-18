/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personapp;

public class Customer extends Person
{
    private String customerNumber;
    
    public Customer() {}
    
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
    public String getCustomerNumber()
    {
        return customerNumber;
    }
    
    @Override
    public String getDisplayText()
    {
        return super.toString() + "Customer number: " + customerNumber + "\n";
    }
}
