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
            
            System.out.print("\nEnter first name: ");
            String firstName = sc.next();
            sc.nextLine();
            
            System.out.print("Enter last name: ");
            String lastName = sc.next();
            sc.nextLine();
            
            System.out.print("Enter email address: ");
            String email = sc.next();
            sc.nextLine();
            
            if (choice == true)
            {
                System.out.print("Enter customer number: ");
                String customerNumber = sc.next();
                sc.nextLine();
                
                Customer firstCustomer = new Customer();
                
                firstCustomer.setFirstName(firstName);
                firstCustomer.setLastName(lastName);
                firstCustomer.setEmail(email);
                firstCustomer.setCustomerNumber(customerNumber);
                
                System.out.print("\nYou entered:\n" + firstCustomer.getDisplayText());
            }
            else
            {
                System.out.print("Enter social security number: ");
                String socSecNum = sc.next();
                sc.nextLine();
                
                Employee firstEmployee = new Employee();
                
                firstEmployee.setFirstName(firstName);
                firstEmployee.setLastName(lastName);
                firstEmployee.setEmail(email);
                firstEmployee.setSocSecNum(socSecNum);
                
                System.out.print("\nYou entered:\n" + firstEmployee.getDisplayText());
            }
            
            if (Validation.getContinue("\nContinue? (y/n): ") == false)
            {
                break;
            }
        }
        System.out.println("DONE");
    }
}
