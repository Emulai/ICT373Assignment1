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
public class Reply {
    private Customer m_owner;
    private String m_reply;
    
    Reply()
    {
        
    }
    
    public void SetReply(String p_reply)
    {
        m_reply = p_reply;
    }
    
    public void SetOwner(Customer p_owner)
    {
        m_owner = p_owner;
    }
}
