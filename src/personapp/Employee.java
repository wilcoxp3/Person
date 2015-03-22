 /**
 * The class Employee extends the abstract class Person. It adds a field for the
 * employee's social security number, along with a getter and a setter. The
 * method getDisplayText is overridden to append the social security number to
 * the string returned by the superclass's toString() method (containing first
 * name, last name, and email address). The constructor calls the superclass's
 * constructor, and also sets the employee social security number to an empty
 * string.
 */

package personapp;

public class Employee extends Person
{
    //instance variable for employee social security number
    private String empSSN;
    
    //initialize all instance variables to empty strings.
    public Employee()
    {
        super();
        empSSN = "";
    }
    
    //getter and setter for social security number
    public void setEmpSSN(String empSSN)
    {
        this.empSSN = empSSN;
    }
    
    public String getEmpSSN()
    {
        return empSSN;
    }
    
    //return string for displaying all info to the user
    @Override
    public String getDisplayText()
    {
        return super.toString() + "Social security number: " + empSSN + "\n";
    }
}