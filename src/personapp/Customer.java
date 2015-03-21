/**
 * The class Customer extends the abstract class Person. It adds a field for the
 * customer's customer number, along with a getter and a setter. The
 * method getDisplayText is overridden to append the customer number to
 * the string returned by the superclass's toString() method (containing first
 * name, last name, and email address). The constructor calls the superclass's
 * constructor, and also sets the customer number to an empty
 * string.
 */

package personapp;

public class Customer extends Person
{
    //instance variable for customer's customer number
    private String customerNumber;
    
    //initialize all instance variables to aempty strings
    public Customer()
    {
        super();
        customerNumber = "";
    }
    
    //getter and setter for customer number
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
    public String getCustomerNumber()
    {
        return customerNumber;
    }
    
    //return string for displaying all info to the user
    @Override
    public String getDisplayText()
    {
        return super.toString() + "Customer number: " + customerNumber + "\n";
    }
}