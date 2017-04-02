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
public class Advertiser extends Customer {
    private String m_advert;
    private String m_partnerDescription;
    //private Reply[]; -- ArrayList would be best
    
    Advertiser (String p_userName, String p_password, String p_advert,
                String p_partnerDescription)
    {
        super(p_userName, p_password);
        m_advert = p_advert;
        m_partnerDescription = p_partnerDescription;
    }
    
}
