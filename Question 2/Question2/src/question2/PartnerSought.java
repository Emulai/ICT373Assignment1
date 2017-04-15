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
public class PartnerSought {
    private String m_gender;
    private int m_minAge;
    private int m_maxAge;
    private float m_minIncome;
    private float m_maxIncome;
    
    PartnerSought(String p_gender, int p_minAge, int p_maxAge, 
                  float p_minIncome, float p_maxIncome)
    {
        m_gender = p_gender;
        m_minAge = p_minAge;
        m_maxAge = p_maxAge;
        m_minIncome = p_minIncome;
        m_maxIncome = p_maxIncome;
    }
    
    public String GetGender()
    {
        return m_gender;
    }
    
    public int GetMinAge()
    {
        return m_minAge;
    }
    
    public int GetMaxAge()
    {
        return m_maxAge;
    }
    
    public float GetMinIncome()
    {
        return m_minIncome;
    }
    
    public float GetMaxIncome()
    {
        return m_maxIncome;
    }
    
    public void SetGender(String p_gender)
    {
        m_gender = p_gender;
    }
    
    public void SetMinAge(int p_minAge)
    {
        m_minAge = p_minAge;
    }
    
    public void SetMaxAge(int p_maxAge)
    {
        m_maxAge = p_maxAge;
    }
    
    public void SetMinIncome(float p_minIncome)
    {
        m_minIncome = p_minIncome;
    }
    
    public void SetMaxIncome(float p_maxIncome)
    {
        m_maxIncome = p_maxIncome;
    }
    
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
