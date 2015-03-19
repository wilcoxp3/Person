/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
