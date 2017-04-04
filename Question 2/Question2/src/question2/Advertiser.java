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
    private ArrayList<Reply> m_replies = new ArrayList<Reply>();
    
    Advertiser (String p_userName, String p_password, String p_gender, int p_age,
                float p_income, String p_advert)
    {
        super(p_userName, p_password, p_gender, p_age, p_income);
        m_advert = p_advert;
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
        return (m_replies.add(p_reply));
    }
    
    public void RemoveReply(Reply p_reply)
    {
        m_replies.remove(GetReplyIndex(p_reply));
    }
    
    private int GetReplyIndex(Reply p_reply)
    {
        return (m_replies.indexOf(p_reply));
    }
    
    /*@Override
    public String toString()
    {
        return String.format(m_advert, );
    }*/
}
