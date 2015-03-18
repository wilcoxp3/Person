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
            boolean choice = Validation.getChoice("Create customer or employee? (c/e): ", "C", "E");
            
            System.out.print("\nEnter first name: ");
            String firstName = sc.next();
            sc.nextLine();
            
            System.out.print("\nEnter last name: ");
            String lastName = sc.next();
            sc.nextLine();
            
            System.out.print("\nEnter email address: ");
            String email = sc.next();
            sc.nextLine();
            
            if (choice == true)
            {
                Customer firstCustomer = new Customer();
                firstCustomer.setFirstName(firstName);
                firstCustomer.setLastName(lastName);
                firstCustomer.setEmail(email);
                
                System.out.print("\nEnter customer number: ");
                String customerNumber = sc.next();
                sc.nextLine();
                
                firstCustomer.setCustomerNumber(customerNumber);
                
            }
            else
            {
            
            }
        }
    }
}
