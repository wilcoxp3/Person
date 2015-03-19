/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personapp;
import java.util.Scanner;

public class PersonApp
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Person Tester application");
        
        
        
        while (true)
        {
            boolean choice = Validation.getChoice("\nCreate customer or employee? (c/e): ", "C", "E");
            
            Person person = null;
            
            System.out.print("\nEnter first name: ");
            String firstName = sc.nextLine();
            
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            
            System.out.print("Enter email address: ");
            String email = sc.nextLine();
            
            if (choice == true)
            {
                System.out.print("Enter customer number: ");
                String customerNumber = sc.nextLine();
                
                Customer customer = new Customer();
                
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmail(email);
                customer.setCustomerNumber(customerNumber);
                
                person = customer;
            }
            else
            {
                System.out.print("Enter social security number: ");
                String socSecNum = sc.nextLine();
                
                Employee employee = new Employee();
                
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setSocSecNum(socSecNum);
                
                person = employee;
            }
            
            System.out.print("\nYou entered:\n" + person.getDisplayText());
            if (Validation.getContinue("\nContinue? (y/n): ") == false)
            {
                break;
            }
        }
        System.out.println("DONE");
    }
}
