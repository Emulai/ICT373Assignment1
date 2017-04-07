/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author jaknd
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PartnerSought l_pS = new PartnerSought("Female", 25, 30, 5000, 50000);
        Advertiser g_resp = new Advertiser("Fred", "Male", 50, 5000, "Wants a dudebro to share"
                + " bro times with bro, we gonna be the broiest bros ever bro", l_pS);
        
        Customer g_cust[] = new Customer[1];
        g_cust[0] = g_resp;
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
        }
        
    }
    
}