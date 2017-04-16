/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.ArrayList;
/**
 *
 * @author jaknd
 */
public class Responder extends Customer {
    
    private ArrayList<Customer> m_matches = new ArrayList<>();
    
    Responder(String p_userName, String p_gender,
              int p_age, float p_income)
    {
        super(p_userName,p_gender, p_age, p_income);
    }
    
    public boolean AddMatch(Customer p_match)
    {
        return m_matches.add(p_match);
    }
    
    public boolean RemoveMatch(Customer p_match)
    {
            return m_matches.remove(p_match);
    }
    
    @Override
    public String toSafeString()
    {
        String l_toString = super.toSafeString();
      
        l_toString += "\n\n";
        return l_toString;
    }
    
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
