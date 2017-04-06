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
    
    private ArrayList<Customer> m_matches = new ArrayList<Customer>();
    
    Responder(String p_userName, String p_gender,
              int p_age, float p_income)
    {
        super(p_userName,p_gender, p_age, p_income);
    }
    
    public boolean AddMatch(Customer p_match)
    {
        return (m_matches.add(p_match));
    }
    
    public void RemoveMatch(Customer p_match)
    {
        if (m_matches.indexOf(p_match) != -1)
        {
            m_matches.remove(m_matches.indexOf(p_match));
        }
    }
    
    @Override 
    public String toString()
    {
      String l_tString = super.toString();
      
      for (Customer customer : m_matches)
      {
          l_tString = l_tString + "\nMatches: " + customer.toString();
      }
      
      return l_tString;
    }
}
