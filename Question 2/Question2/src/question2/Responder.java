/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.ArrayList;
/**
 * Extends Customer, Responder replies to Advertisers
 * @author David Nankivell
 * 16/04/2017
 * Responder.java
 * Class extends Customer, is a Responder to sought matches
 */
public class Responder extends Customer {
    
    private ArrayList<Customer> m_matches = new ArrayList<>();
    
    /**
     * Constructor
     * @param p_userName Username of Responder
     * @param p_gender Password of Responder
     * @param p_age Age of Responder
     * @param p_income Income of Responder
     */
    Responder(String p_userName, String p_gender,
              int p_age, float p_income)
    {
        super(p_userName,p_gender, p_age, p_income);
    }
    
    /**
     * Add a customer to Responder's matches
     * @param p_match Customer to add
     * @return Boolean regarding success of add operation
     */
    public boolean AddMatch(Customer p_match)
    {
        return m_matches.add(p_match);
    }
    
    /**
     * Remove a customer from Responder's matches
     * @param p_match Customer to remove
     * @return Boolean regarding success of remove operation
     */
    public boolean RemoveMatch(Customer p_match)
    {
            return m_matches.remove(p_match);
    }
    
    /**
     * Returns safe string -- no passwords
     * @return Safe String with Responder details
     */
    @Override
    public String toSafeString()
    {
        String l_toString = super.toSafeString();
      
        l_toString += "\n\n";
        return l_toString;
    }
    
    /**
     * All Responder details to string
     * @return String with Responder details
     */
    @Override 
    public String toString()
    {
      String l_toString = super.toString();
      
      for (Customer i_customer : m_matches)
      {
          l_toString += "\nMatches: " + i_customer.toString();
      }
      return l_toString;
    }
}
