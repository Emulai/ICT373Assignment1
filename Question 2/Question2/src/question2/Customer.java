/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.security.SecureRandom;
/**
 *
 * @author jaknd
 */
public class Customer {
    protected String m_userName;
    protected String m_password;
    protected String m_gender;
    protected int m_age;
    protected float m_income;
    
    private static final String M_CODE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final SecureRandom M_RND = new SecureRandom();
    private static final int M_PASSLENGTH = 10;
    
    Customer (String p_userName, String p_gender,
              int p_age, float p_income)
    {
        m_userName = p_userName;
        m_password = GeneratePassword();
        m_gender = p_gender;
        m_age = p_age;
        m_income = p_income;
    }
    
    private String GeneratePassword()
    {
        StringBuilder l_pass = new StringBuilder(M_PASSLENGTH);
        for (int i = 0; i < M_PASSLENGTH; i++ )
        {
            l_pass.append( M_CODE.charAt( M_RND.nextInt( M_CODE.length())));
        }
        return l_pass.toString();
    }
    
    public void SetGender(String p_gender)
    {
        m_gender = p_gender;
    }
    
    public void SetAge(int p_age)
    {
        m_age = p_age;
    }
    
    public void SetIncome(float p_income)
    {
        m_income = p_income;
    }
    
    public String GetUsername ()
    {
        return m_userName;
    }
    
    public String GetPassword()
    {
        return m_password;
    }
    
    public String GetGender()
    {
        return m_gender;
    }
    
    public int GetAge()
    {
        return m_age;
    }
    
    public float GetIncome()
    {
        return m_income;
    }
    
    public String toSafeString()
    {
        String l_toString = "UserName: " + m_userName + "\nGender: ";
        if (m_gender.equals("M"))
        {
            l_toString += "Male";        
        }
        else if (m_gender.equals("F"))
        {
            l_toString += "Female";
        }
        l_toString += "; Age: " + m_age + "; Income: " + m_income;
        
        return l_toString;
    }
    
    @Override
    public String toString()
    {
        String l_toString = "UserName: " + m_userName + "; Password: " + m_password + "\nGender: ";
        if (m_gender.equals("M"))
        {
            l_toString += "Male";        
        }
        else if (m_gender.equals("F"))
        {
            l_toString += "Female";
        }
        l_toString += "; Age: " + m_age + "; Income: " + m_income;
        
        return l_toString;
    }
    
}
