/**
 * The abstract class Person defines three fields, the person's first
 * name, last name, and email address, along with getter and setter methods for
 * each. It overrides toString to return a string containing all three
 * fields with labels. It also declares an abstract method getDisplayText(). The
 * no-argument constructor sets each field to an empty string.
 */

package personapp;

public abstract class Person
{
    //instance variable for person's first name, last name, and email address
    private String firstName;
    private String lastName;
    private String email;
    
    //Constructor sets all fields to an empty string
    public Person()
    {
        firstName = "";
        lastName = "";
        email = "";
    }
    
    //getters and setters for each field
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    //Override toString method to return a string containg the values of all
    //fields displayed in a way that makes sense to the user.
    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email + "\n"; 
    }
    
    //abstract method for getting the text to display to the user
    abstract String getDisplayText();
}
