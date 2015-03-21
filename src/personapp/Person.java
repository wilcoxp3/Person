/**
 * The abstract class Person defines 3 instance variable, the person's first
 * name, last name, and email address, along with getter and setter methods for
 * each. It overrides toString to return a string containing all three
 * fields with labels. It also declares an abstract method getDisplayText(). The
 * no-argument constructor sets each field to an empty string.
 */

package personapp;

public abstract class Person
{
    private String firstName;
    private String lastName;
    private String email;
    
    
    public Person()
    {
        firstName = "";
        lastName = "";
        email = "";
    }
    
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
    
    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email + "\n"; 
    }
    
    abstract String getDisplayText();
}
