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
public class Advertiser extends Customer {
    private String m_advert;
    private PartnerSought m_partnerDescription;
    private ArrayList<Reply> m_replies = new ArrayList<>();
    
    Advertiser (String p_userName, String p_gender, int p_age,
                float p_income, String p_advert, PartnerSought p_pS)
    {
        super(p_userName, p_gender, p_age, p_income);
        m_advert = p_advert;
        m_partnerDescription = p_pS;
    }
    
    public String Advertise()
    {
        return m_advert;
    }
    
    public PartnerSought PartnerDescription()
    {
        return m_partnerDescription;
    }
    
    public void SetAdvertisement(String p_advert)
    {
        m_advert = p_advert;
    }
    
    public void SetPartner(PartnerSought p_partner)
    {
        m_partnerDescription = p_partner;
    }
    
    public boolean AddReply(Reply p_reply)
    {
        return m_replies.add(p_reply);
    }
    
    public boolean RemoveReply(Reply p_reply)
    {
        return m_replies.remove(p_reply);
    }
    
    public ArrayList<Reply> GetReplies()
    {
        return m_replies;
    }
    
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
     *
     * @return
     */
    @Override
    public String toSafeString()
    {
        String l_toString = super.toSafeString() + "\nAdvert: " + m_advert;
        
        l_toString += "\n\n";
        return l_toString;
    }
    
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
