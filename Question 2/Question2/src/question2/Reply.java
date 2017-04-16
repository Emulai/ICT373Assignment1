/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 * A Reply to an Advertiser
 * @author David Nankivell
 * 16/04/2017
 * Reply.java
 * Class to handle replies in Dating Service program
 */
public class Reply {
    private Customer m_owner;
    private String m_reply;
    
    /**
     * Constructor
     * @param p_cust Customer owner of Reply
     * @param p_reply String reply message
     */
    Reply(Customer p_cust, String p_reply)
    {
        m_owner = p_cust;
        m_reply = p_reply;
    }
    
    /**
     * Set the message of the reply
     * @param p_reply String reply message
     */
    public void SetReply(String p_reply)
    {
        m_reply = p_reply;
    }
    
    /**
     * Set the owner of the reply
     * @param p_owner Customer reply owner
     */
    public void SetOwner(Customer p_owner)
    {
        m_owner = p_owner;
    }
    
    /**
     * Get reply message
     * @return String reply message
     */
    public String GetReply()
    {
        return m_reply;
    }
    
    /**
     * Get reply owner
     * @return Customer reply owner
     */
    public Customer GetOwner()
    {
        return m_owner;
    }
    
    /**
     * Reply details to string
     * @return String Reply details
     */
    @Override
    public String toString()
    {
        String l_toString = "Owner: " + m_owner + "\nReply Message: " + m_reply + "\n";
        return l_toString;
    }
    
}
