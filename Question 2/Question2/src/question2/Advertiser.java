/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.ArrayList;
/**
 * Extends Customer, Advertiser asks for Replies
 * @author David Nankivell
 * 16/04/2017
 * Advertiser.java
 * Advertiser extends Customer, Advertises for sought match
 */
public class Advertiser extends Customer {
    private String m_advert;
    private PartnerSought m_partnerDescription;
    private ArrayList<Reply> m_replies = new ArrayList<>();
    
    /**
     * Constructor
     * @param p_userName Username of Advertiser
     * @param p_gender Gender of Advertiser
     * @param p_age Age of Advertiser
     * @param p_income Income of Advertiser
     * @param p_advert Advertiser's advertisement
     * @param p_pS PartnerSought by Advertiser
     */
    Advertiser (String p_userName, String p_gender, int p_age,
                float p_income, String p_advert, PartnerSought p_pS)
    {
        super(p_userName, p_gender, p_age, p_income);
        m_advert = p_advert;
        m_partnerDescription = p_pS;
    }
    
    /**
     * Advertises Advertiser
     * @return String with Advertiser's advertisement
     */
    public String Advertise()
    {
        return m_advert;
    }
    
    /**
     * Advertiser's PartnerSought
     * @return PartnerSought by Advertiser
     */
    public PartnerSought PartnerDescription()
    {
        return m_partnerDescription;
    }
    
    /**
     * Set Advertiser's advertisement
     * @param p_advert Advertisement
     */
    public void SetAdvertisement(String p_advert)
    {
        m_advert = p_advert;
    }
    
    /**
     * Set PartnerSought by Advertiser
     * @param p_partner PartnerSought
     */
    public void SetPartner(PartnerSought p_partner)
    {
        m_partnerDescription = p_partner;
    }
    
    /**
     * Add a new Reply to the Advertiser
     * @param p_reply Reply message
     * @return Boolean regarding success of add operation
     */
    public boolean AddReply(Reply p_reply)
    {
        return m_replies.add(p_reply);
    }
    
    /**
     * Remove a Reply from the Advertiser
     * @param p_reply Reply message
     * @return Boolean regarding success of remove operation
     */
    public boolean RemoveReply(Reply p_reply)
    {
        return m_replies.remove(p_reply);
    }
    
    /**
     * Method to return list of all Replies
     * @return ArrayList of Replies
     */
    public ArrayList<Reply> GetReplies()
    {
        return m_replies;
    }
    
    /**
     * Check that passed customer matches PartnerSought parameters
     * @param p_cust Customer to be matched
     * @return Boolean regarding match success
     */
    public boolean CheckMatch(Customer p_cust)
    {
            if ((p_cust.GetAge() >= m_partnerDescription.GetMinAge()) &&
                (p_cust.GetAge() <= m_partnerDescription.GetMaxAge()))
            {
                if ((p_cust.GetIncome() >= m_partnerDescription.GetMinIncome()) &&
                    (p_cust.GetIncome() <= m_partnerDescription.GetMaxIncome()))
                {
                    if ((p_cust.GetGender().equals(m_partnerDescription.GetGender())) ||
                        (m_partnerDescription.equals('A')))
                    {
                        return true;
                    }
                }
            }
        return false;
    }
    
    /**
     * Returns safe string -- no passwords
     * @return Safe Strin
     */
    @Override
    public String toSafeString()
    {
        String l_toString = super.toSafeString() + "\nAdvert: " + m_advert;
        
        l_toString += "\n\n";
        return l_toString;
    }
    
    /**
     * Return Advertiser details in string
     * @return Advertiser String
     */
    @Override
    public String toString()
    {
        String l_toString = super.toString() + "\nAdvert: " + m_advert + "\nPartner Description" + m_partnerDescription.toString();
        
        for (Reply reply : m_replies)
        {
            l_toString += reply.toString();
        }
        
        l_toString += "\n";
        return l_toString;
    }
}
