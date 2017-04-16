/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.ArrayList;
/**
 * Dating Service to contain all Customers
 * @author David Nankivell
 * 16/04/2017
 * DatingService.java
 * This class keeps a record of all Customers
 */
public class DatingService {
    private ArrayList<Customer> m_customers;
    
    /**
     * Constructor
     */
    public DatingService()
    {
        m_customers = new ArrayList<>();
    }
    
    /**
     * Add a customer to the DatingService
     * @param p_cust Customer to be added
     * @return Boolean regarding success of add operation
     */
    public boolean Add(Customer p_cust)
    {
        return m_customers.add(p_cust);
    }
    
    /**
     * Remove a customer from the DatingService
     * @param p_cust Customer to be removed
     * @return Boolean regarding success of remove operation
     */
    public boolean Remove(Customer p_cust)
    {
        return m_customers.remove(p_cust);
    }
    
    /**
     * Check if given username exists inside DatingService
     * @param p_user Username to be checked
     * @return Boolean regarding existence of username
     */
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
    
    /**
     * Check if given password exists inside DatingService
     * @param p_pass Password to be checked
     * @return Boolean regarding existence of password
     */
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
    
    /**
     * Returns list of all Advertisers matching Customer
     * @param p_cust Customer to be matched
     * @return ArrayList of Advertisers that match Customer
     */
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
    
    /**
     * Checks if given username matches given password
     * @param p_user Username to be validated
     * @param p_pass Password to be validated
     * @return Customer matching given username and password
     */
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
    
    /**
     * Returns all Customers in DatingService
     * @return ArrayList of all Customers
     */
    public ArrayList<Customer> ListCustomers()
    {
        return m_customers;
    }
    
    /**
     * Returns all Advertisers in the DatingService
     * @return ArrayList of all Advertisers
     */
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
    
    /**
     * Returns all Responders in the DatingService
     * @return ArrayList of all Responders
     */
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
    
    /**
     * Puts all DatingService data into a string
     * @return String with all DatingService details
     */
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
