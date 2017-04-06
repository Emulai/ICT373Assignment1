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
        Responder g_resp = new Responder("Fred", "yyt", "Male", 50, 5000);
        Customer g_cust[] = new Customer[4];
        g_cust[0] = g_resp;
        Customer a_cust = new Customer("Mary", "HHay", "Female", 45, 50000);
        
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