/**
 * Project 8-2: Person
 * Professor: Tedd Sperling
 * Course: Introduction to JAVA - (22150)
 * Student: Paul Wilcox
 * This program enables the user to create an employee object or a customer
 * object, each of which are subclasses of the abstract class person. It prompts
 * the user to enter a first name, last name, and email. Then, depending on
 * which object being created prompts for either a customer number or a social
 * security number. It then displays the information for the created object.
*/

package personapp;

import java.util.Scanner;

public class PersonApp
{
    public static void main(String[] args)
    {  
        System.out.println("Welcome to the Person Tester application");
          
        while (true)
        {
            //Declare variable of type Person, to be used for printing
            Person myPerson;
            
            //getChoice returns true when Customer is chosen, returns false
            //when Employee is chosen.
            boolean isCustomer = Validation.getChoice("\nCreate customer or employee? (c/e): ", "C", "E");
            
            //Get info from user that is common to both customers and employees
            String firstName = Validation.getString("\nEnter first name: ");
            String lastName = Validation.getString("Enter last name: ");
            String email = Validation.getString("Enter email address: ");
            
            //isCustomer == true if user chooses to create customer
            if (isCustomer == true)
            {
                //get Customer Number from user
                String customerNumber = Validation.getString("Enter customer number: ");
                
                //create customer object and set all fields
                Customer myCustomer = new Customer();
                myCustomer.setFirstName(firstName);
                myCustomer.setLastName(lastName);
                myCustomer.setEmail(email);
                myCustomer.setCustomerNumber(customerNumber);
                
                //store Customer object in Person variable
                myPerson = myCustomer;
            }
            
            //isCustomer == false if user chooses to create employee
            else
            {
                //get employee social security number
                String empSSN = Validation.getString("Enter social security number: ");
                
                //create employee object and set all fields
                Employee myEmployee = new Employee();
                myEmployee.setFirstName(firstName);
                myEmployee.setLastName(lastName);
                myEmployee.setEmail(email);
                myEmployee.setEmpSSN(empSSN);
                
                //store Employee object in Person variable
                myPerson = myEmployee;
            }
            
            //Display all info for the customer or employee object
            System.out.print("\nYou entered:\n" + myPerson.getDisplayText());
            
            //Prompt user to continue or quit
            if (Validation.getContinue("\nContinue? (y/n): ") == false)
            {
                break;
            }
        }
        System.out.println("DONE");
    }
}