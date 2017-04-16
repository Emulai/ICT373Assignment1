/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
/**
 * Details of Partner Sought by Advertiser
 * @author David Nankivell
 * 16/04/2017
 * PartnerSought.java
 * This class contains details of partners sought by Advertisers
 */
public class PartnerSought {
    private String m_gender;
    private int m_minAge;
    private int m_maxAge;
    private float m_minIncome;
    private float m_maxIncome;
    
    /**
     * Constructor
     * @param p_gender Gender of PartnerSought
     * @param p_minAge Minimum Age of PartnerSought
     * @param p_maxAge Maximum Age of PartnerSought
     * @param p_minIncome Minimum Income of PartnerSought
     * @param p_maxIncome Maximum Income of PartnerSought
     */
    PartnerSought(String p_gender, int p_minAge, int p_maxAge, 
                  float p_minIncome, float p_maxIncome)
    {
        m_gender = p_gender;
        m_minAge = p_minAge;
        m_maxAge = p_maxAge;
        m_minIncome = p_minIncome;
        m_maxIncome = p_maxIncome;
    }
    
    /**
     * Returns gender of PartnerSought
     * @return Gender of PartnerSought
     */
    public String GetGender()
    {
        return m_gender;
    }
    
    /**
     * Returns the minimum age of PartnerSought
     * @return Minimum Age of PartnerSought
     */
    public int GetMinAge()
    {
        return m_minAge;
    }
    
    /**
     * Returns the maximum age of PartnerSought
     * @return Maximum Age of PartnerSought
     */
    public int GetMaxAge()
    {
        return m_maxAge;
    }
    
    /**
     * Returns the minimum income of PartnerSought
     * @return Minimum Income of PartnerSought
     */
    public float GetMinIncome()
    {
        return m_minIncome;
    }
    
    /**
     * Returns the maximum income of PartnerSought
     * @return Maximum Income of PartnerSought
     */
    public float GetMaxIncome()
    {
        return m_maxIncome;
    }
    
    /**
     * Sets the gender of the PartnerSought
     * @param p_gender Gender of PartnerSought
     */
    public void SetGender(String p_gender)
    {
        m_gender = p_gender;
    }
    
    /**
     * Sets the minimum age of PartnerSought
     * @param p_minAge Minimum Age of PartnerSought
     */
    public void SetMinAge(int p_minAge)
    {
        m_minAge = p_minAge;
    }
    
    /**
     * Sets the maximum age of PartnerSought
     * @param p_maxAge Maximum Age of PartnerSought
     */
    public void SetMaxAge(int p_maxAge)
    {
        m_maxAge = p_maxAge;
    }
    
    /**
     * Sets the minimum income of PartnerSought
     * @param p_minIncome Minimum Income of PartnerSought
     */
    public void SetMinIncome(float p_minIncome)
    {
        m_minIncome = p_minIncome;
    }
    
    /**
     * Sets the maximum income of PartnerSought
     * @param p_maxIncome Maximum Income of PartnerSought
     */
    public void SetMaxIncome(float p_maxIncome)
    {
        m_maxIncome = p_maxIncome;
    }
    
    /**
     * Returns a string with all details of PartnerSought
     * @return PartnerSought String
     */
    @Override
    public String toString()
    {
        String l_toString = "\nGender: ";
        if (m_gender.equals("A"))
        {
            l_toString += "Any";
        }
        else if (m_gender.equals("M"))
        {
            l_toString += "Male";        
        }
        else if (m_gender.equals("F"))
        {
            l_toString += "Female";
        }
        l_toString += "; Age Range: " + m_minAge + "-" + m_maxAge + "; Income Range: $" + m_minIncome + "-$" + m_maxIncome + "\n";
        return l_toString;
    }
    
}
