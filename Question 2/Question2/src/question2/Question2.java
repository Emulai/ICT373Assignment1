/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jaknd
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PartnerSought l_pS = new PartnerSought("Female", 25, 30, 5000, 50000);
        //Advertiser g_resp = new Advertiser("Fred", "Male", 50, 5000, "Wants a dudebro to share"
        //        + " bro times with bro, we gonna be the broiest bros ever bro", l_pS);
        
        ArrayList<Customer> g_cust = new ArrayList<>();
       /** g_cust[0] = g_resp;
        Customer a_cust = new Customer("Mary", "Female", 45, 50000);
        
        for (Customer customer : g_cust)
        {
            System.out.println(customer.toString());
            if (g_cust[0] instanceof Responder)
            {
                Responder t_resp = (Responder)g_cust[0];
                t_resp.AddMatch(a_cust);
                System.out.print(t_resp.toString());
            }
        }*/
        
        CreateNewUser(g_cust);
        
    }
    
    public static boolean CreateNewUser(ArrayList<Customer> p_cust)
    {
        
        int l_menuChoice;
        
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("New User: \n[1]Responder\n[2]Advertiser\n[3]Exit user creation\n");
            if (input.hasNextInt())
            {
                l_menuChoice = input.nextInt();
                switch (l_menuChoice)
                {
                case 1:
                    if (AcceptPayment())
                    {
                        NewResponder(p_cust);
                    }else{
                        return false;
                    }
                    return true;
                case 2:
                    if (AcceptPayment())
                    {
                        NewAdvertiser(p_cust);
                    }else{
                        return false;
                    }
                    return true;
                case 3:
                    System.out.println("Returning to main menu...");
                    return false;
                default:
                    System.out.println("Please enter 1, 2 or 3!");
                    break;
                }
            }
            System.out.println("Please enter 1, 2 or 3!");
            input.next();
        }
    }
    
    private static boolean AcceptPayment()
    {
        String l_payChoice;
        
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("Will you accept the payment for user creation? Y/N");
            if (input.hasNext())
            {
                l_payChoice = input.next();
            }else
            {
                return false;
            }

            switch (l_payChoice)
            {
                case "y":
                case "Y":
                    System.out.println("Thankyou for creating an account!");
                    return true;
                case "n":
                case "N":
                    System.out.println("Returning to main menu");
                    return false;
                default:
                    System.out.println("Please enter Y or N");
                    break;
            }
        }
    }
    
    private static void NewResponder(ArrayList<Customer> p_cust)
    {
        Scanner input = new Scanner(System.in);
        String l_userName, l_gender;
        int l_age;
        float l_income;
        System.out.print("Please enter user name (this is final!): ");
        l_userName = input.next();
        System.out.print("Please enter gender (M/F): ");
        while (!input.hasNext("[MF]"))
        {
            System.out.println("Must be M or F!");
            System.out.print("Please enter gender (M/F): ");
            input.next();
        }
        l_gender = input.next();
        System.out.print("Please enter age (21-120): ");
        while (!input.hasNext("2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
        {
            System.out.println("Age must be between 21 and 120!");
            System.out.print("Please enter age (21-120): ");
            input.nextInt();
        }
        l_age = input.nextInt();
        System.out.print("Please enter income: ");
        while (!input.hasNextFloat())
        {
            System.out.println("Must be a number!");
            System.out.print("Please enter income: ");
            input.nextFloat();
        }
        l_income = input.nextFloat();
        Responder l_resp = new Responder(l_userName, l_gender, l_age, l_income);
        System.out.println(l_resp.toString());
    }
    
    private static void NewAdvertiser(ArrayList<Customer> p_cust)
    {
        Scanner input = new Scanner(System.in);
        String l_userName, l_gender, l_advert, l_prefGen;
        int l_age, l_minA, l_maxA;
        float l_income, l_minIn, l_maxIn;
        System.out.print("Please enter user name (this is final!): ");
        l_userName = input.next();
        System.out.print("Please enter gender (M/F): ");
        while (!input.hasNext("[MF]"))
        {
            System.out.println("Must be M or F!");
            System.out.print("Please enter gender (M/F): ");
            input.next();
        }
        l_gender = input.next();
        System.out.print("Please enter age (21-120): ");
        while (!input.hasNext("2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
        {
            System.out.println("Age must be between 21 and 120!");
            System.out.print("Please enter age (21-120): ");
            input.nextInt();
        }
        l_age = input.nextInt();
        System.out.print("Please enter income: ");
        while (!input.hasNextFloat())
        {
            System.out.println("Must be a number!");
            System.out.print("Please enter income: ");
            input.nextFloat();
        }
        l_income = input.nextFloat();
        System.out.println("Please enter your description:");
        l_advert = input.next();
        System.out.print("Please enter preferred partner gender (M/F/A): ");
        while (!input.hasNext("[MFA]"))
        {
            System.out.println("Must be M or F or A!");
            System.out.print("Please enter preferred partner gender (M/F/A): ");
            input.next();
        }
        l_prefGen = input.next();
        System.out.println("Please enter preferred partner age range (20 - 120): ");
        while (!input.hasNext("2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]\\c-"
                            + "2[1-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
        {
            System.out.println("Age must be between 20 and 120!");
            System.out.println("Please enter preferred partner age range (20 - 120): ");
            input.next();
        }
        
    }
    
}