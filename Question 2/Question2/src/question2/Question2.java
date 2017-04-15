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
        
        //ArrayList<Customer> g_cust = new ArrayList<>();
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
        PrintDetails();
       
        DatingService o_dServ = new DatingService();
        InitialiseCustomers(o_dServ);
        
        int o_menuChoice;
        Scanner o_input = new Scanner(System.in);
        boolean o_menu = true;
        
        while (o_menu)
        {
            PrintMenu();
            
            if (o_input.hasNextInt())
            {
                while (!o_input.hasNext("[1-6]"))
                {
                    System.out.println("Choice must be between 1 and 6");
                    PrintMenu();
                    o_input.nextInt();
                }
                o_menuChoice = o_input.nextInt(); 
                
                switch (o_menuChoice)
                {
                    case 1:     //Login
                        if (Login(o_dServ))
                        {
                            
                        }
                        else
                        {
                            
                        }
                        break;
                    case 2:     //New User
                        if (CreateNewUser(o_dServ))
                        {
                            System.out.println("New User Added");
                        }
                        else
                        {
                            System.out.println("No User Added");
                        }
                        break;
                    case 3:     //Delete User
                        if (DeleteUser(o_dServ))
                        {
                            System.out.println("User Deleted");
                        }
                        else
                        {
                            System.out.println("No User Deletion");
                        }
                        break;
                    case 4:     //List Advertisers
                        ListAdvertisers(o_dServ);
                        break;
                    case 5:     //List Responders
                        ListResponders(o_dServ);
                        break;
                    case 6:     //Exit
                        o_menu = false;
                        break;
                }
            }
            else
            {
                System.out.println("Please enter a number");
                o_input.next();
            }
        }
        //System.out.println(o_dServ);
    }
    
    private static void PrintDetails()
    {
        System.out.print("Author: David Nankivell\n"
                       + "Student Number: 32204274\n"
                       + "Enrolment: Internal\n"
                       + "Tutor: Robert Hammarstrand\n"
                       + "Tutorial: Monday 1:30 - 2:30\n\n");
    }
    
    private static void InitialiseCustomers(DatingService p_dServ)
    {
        ArrayList<PartnerSought> l_paSo = new ArrayList<>();
        ArrayList<String> l_advert = new ArrayList<>();
        ArrayList<Advertiser> l_advT = new ArrayList<>();
        ArrayList<Responder> l_resp = new ArrayList<>();
        
        //Partner Sought -- Gender, MinAge, MaxAge, MinIncome, MaxIncome
        l_paSo.add(new PartnerSought("A", 25, 40,  2500,  3500));       //0
        l_paSo.add(new PartnerSought("F", 30, 40,  25000, 35000));      //1
        l_paSo.add(new PartnerSought("M", 55, 67,  250,   300));        //2
        l_paSo.add(new PartnerSought("F", 21, 80,  0,     350000000));  //3
        l_paSo.add(new PartnerSought("F", 21, 120, 2525,  3535));       //4
        l_paSo.add(new PartnerSought("A", 70, 80,  4000,  4010));       //5
        l_paSo.add(new PartnerSought("A", 45, 46,  2552,  3553));       //6
        
        //Advert -- String describing Advertiser
        l_advert.add("Guy looking for anyone really");                          //0
        l_advert.add("Pensioner wanting some fun");                             //1
        l_advert.add("Dude lookin' for dudes bro");                             //2
        l_advert.add("Single mother needs some time to relax");                 //3
        l_advert.add("Nice guy hoping for a nice girl");                        //4
        l_advert.add("Younger woman wants to aid older people have some fun");  //5
        l_advert.add("Single man needs some company");                          //6
        
        //Advertiser -- Name, Gender, Age, Income, Advert, Partner Sought
        l_advT.add(new Advertiser("John",   "M", 30, 50000,  l_advert.get(0), l_paSo.get(0)));
        l_advT.add(new Advertiser("Sally",  "F", 90, 4000,   l_advert.get(1), l_paSo.get(1)));
        l_advT.add(new Advertiser("Bob",    "M", 21, 50450,  l_advert.get(2), l_paSo.get(2)));
        l_advT.add(new Advertiser("May",    "F", 37, 150000, l_advert.get(3), l_paSo.get(3)));
        l_advT.add(new Advertiser("George", "M", 35, 65000,  l_advert.get(4), l_paSo.get(4)));
        l_advT.add(new Advertiser("Sam",    "F", 28, 250,    l_advert.get(5), l_paSo.get(5)));
        l_advT.add(new Advertiser("Fred",   "M", 45, 450000, l_advert.get(6), l_paSo.get(6)));
        
        //Responder -- Name, Gender, Age, Income
        l_resp.add(new Responder("Mary",  "F", 30, 3000));   //Partner Sought 0
        l_resp.add(new Responder("Jacob", "M", 40, 3250));   //Partner Sought 0
        l_resp.add(new Responder("Eliza", "F", 35, 30000));   //Partner Sought 1
        l_resp.add(new Responder("Jake",  "M", 63, 250));   //Partner Sought 2
        l_resp.add(new Responder("Jesse", "F", 48, 7762876));   //Partner Sought 3
        l_resp.add(new Responder("Lisa",  "F", 75, 4005));   //Partner Sought 5
        l_resp.add(new Responder("Tim",   "M", 45, 3000));   //Partner Sought 6
        
        for (Advertiser i_advT : l_advT)
        {
            p_dServ.Add(i_advT);
        }
        
        for (Responder i_resp : l_resp)
        {
            p_dServ.Add(i_resp);
        }
    }
    
    private static void PrintMenu()
    {
        System.out.print("Welcome to the Dating Service!\n"
                           + "    Would you like to: \n"
                           + "[1] Login\n"
                           + "[2] Create a new user\n"
                           + "[3] Delete an existing user\n"
                           + "[4] List all Advertisers\n"
                           + "[5] List all Responders\n"
                           + "[6] Exit\n");
    }
    
    private static boolean Login(DatingService p_dServ)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String l_user = input.nextLine();
        
        if (p_dServ.CheckUser(l_user))
        {
            System.out.print("Enter Password: ");
            String l_pass = input.nextLine();
            if (p_dServ.CheckPass(l_pass))
            {
                Customer l_cust = p_dServ.Login(l_user, l_pass);
                if (l_cust instanceof Advertiser)
                {
                    
                }
                else if (l_cust instanceof Responder)
                {
                    CheckMatches(p_dServ, l_cust);
                }
                return true;
            }
        }
        return false;
    }
    
    private static void CheckMatches(DatingService p_dServ, Customer p_cust)
    {
        ArrayList<Advertiser> l_advT = p_dServ.CheckMatches(p_cust);
        System.out.println("Matches");
        
        for (Advertiser i_advT : l_advT)
        {
            System.out.print(i_advT.toSafeString());
        }
    }
    
    private static boolean CreateNewUser(DatingService p_dServ)
    {
        
        int l_menuChoice;
        
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
            System.out.print("New User: \n[1]Responder\n[2]Advertiser\n[3]Exit user creation\n");
            if (input.hasNextInt())
            {
                l_menuChoice = input.nextInt();
                switch (l_menuChoice)
                {
                case 1:
                    if (AcceptPayment())
                    {
                        return NewResponder(p_dServ);
                    }else{
                        return false;
                    }
                case 2:
                    if (AcceptPayment())
                    {
                        return NewAdvertiser(p_dServ);
                    }else{
                        return false;
                    }
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
                    System.out.println("Returning to main menu...");
                    return false;
                default:
                    System.out.println("Please enter Y or N");
                    break;
            }
        }
    }
    
    private static boolean NewResponder(DatingService p_dServ)
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
        while (!input.hasNext("2[1-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
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
        //System.out.println(l_resp.toString());
        return p_dServ.Add(l_resp);
    }
    
    private static boolean NewAdvertiser(DatingService p_dServ)
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
        while (!input.hasNext("2[1-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
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
        input.nextLine();
        System.out.println("Please enter your description:");
        l_advert = input.nextLine();
        System.out.print("Please enter preferred partner gender (M/F/A): ");
        while (!input.hasNext("[MFA]"))
        {
            System.out.println("Must be M or F or A!");
            System.out.print("Please enter preferred partner gender (M/F/A): ");
            input.next();
        }
        l_prefGen = input.next();
        System.out.print("Please enter minimum preferred age (21-120): ");
        while (!input.hasNext("2[1-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
        {
            System.out.println("Minimum Age must be between 21 and 120!");
            System.out.print("Please enter minimum preferred age (21-120): ");
            input.nextInt();
        }
        l_minA = input.nextInt();
        System.out.print("Please enter maximum preferred age (21-120): ");
        while (!input.hasNext("2[1-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|10[0-9]|11[0-9]|120"))
        {
            System.out.println("Maximum Age must be between 21 and 120!");
            System.out.print("Please enter maximum preferred age (21-120): ");
            input.nextInt();
        }
        l_maxA = input.nextInt();
        System.out.print("Please enter minimum preferred income: ");
        while (!input.hasNextFloat())
        {
            System.out.println("Must be a number!");
            System.out.print("Please enter minimum income: ");
            input.nextFloat();
        }
        l_minIn = input.nextFloat();
        System.out.print("Please enter maximum preferred income: ");
        while (!input.hasNextFloat())
        {
            System.out.println("Must be a number!");
            System.out.print("Please enter maximum income: ");
            input.nextFloat();
        }
        l_maxIn = input.nextFloat();
        
        PartnerSought l_pS = new PartnerSought(l_prefGen, l_minA, l_maxA, l_minIn, l_maxIn);
        Advertiser l_adv = new Advertiser(l_userName, l_gender, l_age, l_income, l_advert, l_pS);
        //System.out.println(l_adv.toString());
        return p_dServ.Add(l_adv);
    }
    
    private static boolean DeleteUser(DatingService p_dServ)
    {
        ArrayList<Customer> l_cust = p_dServ.ListCustomers();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter login for user to be deleted: ");
        String l_login = input.nextLine();
        
        for (Customer i_cust : l_cust)
        {
            if (l_login.equals(i_cust.GetUsername()))
            {
                System.out.print("Enter password: ");
                String l_password = input.nextLine();
                if (l_password.equals(i_cust.GetPassword()))
                {
                    return p_dServ.Remove(i_cust);
                }
                else
                {
                    System.out.println("Incorrect Password, returning to menu...");
                }
            }
            else
            {
                System.out.println("No Matching User, returning to menu...");
            }
        }
        return false;
    }
    
    private static void ListAdvertisers(DatingService p_dServ)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Advertiser> l_advT = p_dServ.ListAdvertisers();
        
        String l_string = "Advertisers\n";
        for (Advertiser i_advT : l_advT)
        {
            l_string += i_advT.toString();
        }
        System.out.print(l_string);
        
        System.out.print("Enter any key to continue: ");
        input.nextLine();
        System.out.print("\n");
    }
    
    private static void ListResponders(DatingService p_dServ)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Responder> l_resp = p_dServ.ListResponders();
        
        String l_string = "Responders\n";
        for (Responder i_resp : l_resp)
        {
            l_string += i_resp.toString();
        }
        System.out.print(l_string);
        
        System.out.print("Enter any key to continue: ");
        input.nextLine();
        System.out.print("\n");
    }
}