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
public class DatingService {
    private ArrayList<Customer> m_customers;
    
    public DatingService()
    {
        m_customers = new ArrayList<>();
    }
    
    public boolean Add(Customer p_cust)
    {
        return m_customers.add(p_cust);
    }
    
    public boolean Remove(Customer p_cust)
    {
        return m_customers.remove(p_cust);
    }
    
    public boolean CheckUser(String p_user)
    {
        for (Customer i_cust : m_customers)
        {
            if (p_user.equals(i_cust.GetUsername()))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean CheckPass(String p_pass)
    {
        for (Customer i_cust : m_customers)
        {
            if (p_pass.equals(i_cust.GetPassword()))
            {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Advertiser> CheckMatches (Customer p_cust)
    {
        ArrayList<Advertiser> al_advT = new ArrayList<>();
        for (Customer i_cust : m_customers)
        {
            if (i_cust instanceof Advertiser)
            {
                Advertiser l_advT = (Advertiser)i_cust;
                if (l_advT.CheckMatch(p_cust))
                {
                    al_advT.add(l_advT);
                }
            }
        }
        return al_advT;
    }
    
    public Customer Login(String p_user, String p_pass)
    {
        for (Customer i_cust : m_customers)
        {
            if ((p_user.equals(i_cust.GetUsername())) && (p_pass.equals(i_cust.GetPassword())))
            {
                return i_cust;
            }
        }
        return null;
    }
    
    public ArrayList<Customer> ListCustomers()
    {
        return m_customers;
    }
    
    public ArrayList<Advertiser> ListAdvertisers()
    {
        ArrayList<Advertiser> l_advT = new ArrayList<>();
        for (Customer i_cust : m_customers)
        {
            if (i_cust instanceof Advertiser)
            {
                l_advT.add((Advertiser)i_cust);
            }
            
        }
        return l_advT;
    }
    
    public ArrayList<Responder> ListResponders()
    {
        ArrayList<Responder> l_resp = new ArrayList<>();
        for (Customer i_cust : m_customers)
        {
            if (i_cust instanceof Responder)
            {
                l_resp.add((Responder)i_cust);
            }
        }
        return l_resp;
    }
    
    @Override
    public String toString()
    {
        String l_string = "Dating Service \n";
        for (Customer i_cust : m_customers)
        {
            l_string += i_cust.toString();
        }
        return l_string;
    }
}
