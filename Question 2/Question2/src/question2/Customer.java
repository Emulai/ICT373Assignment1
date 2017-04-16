/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.security.SecureRandom;
/**
 * Customer represents each user of the Dating Service
 * @author David Nankivell
 * 16/04/2017
 * Customer.java
 * Class Customer to be extended by Responder and Advertiser
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
    
    /**
     * Constructor
     * @param p_userName Username of Customer
     * @param p_gender Gender of Customer
     * @param p_age Age of Customer
     * @param p_income Income of Customer
     */
    Customer (String p_userName, String p_gender,
              int p_age, float p_income)
    {
        m_userName = p_userName;
        m_password = GeneratePassword();
        m_gender = p_gender;
        m_age = p_age;
        m_income = p_income;
    }
    
    /**
     * Private method to generate passwords
     * @return String password
     */
    private String GeneratePassword()
    {
        StringBuilder l_pass = new StringBuilder(M_PASSLENGTH);
        for (int i = 0; i < M_PASSLENGTH; i++ )
        {
            l_pass.append( M_CODE.charAt( M_RND.nextInt( M_CODE.length())));
        }
        return l_pass.toString();
    }
    
    /**
     * Sets gender of Customer
     * @param p_gender Customer gender
     */
    public void SetGender(String p_gender)
    {
        m_gender = p_gender;
    }
    
    /**
     * Sets age of Customer
     * @param p_age Customer age
     */
    public void SetAge(int p_age)
    {
        m_age = p_age;
    }
    
    /**
     * Sets income of Customer
     * @param p_income Customer income
     */
    public void SetIncome(float p_income)
    {
        m_income = p_income;
    }
    
    /**
     * Gets Customer username
     * @return String username
     */
    public String GetUsername ()
    {
        return m_userName;
    }
    
    /**
     * Gets Customer password
     * @return String password
     */
    public String GetPassword()
    {
        return m_password;
    }
    
    /**
     * Gets Customer gender
     * @return String gender
     */
    public String GetGender()
    {
        return m_gender;
    }
    
    /**
     * Gets Customer age
     * @return Integer age
     */
    public int GetAge()
    {
        return m_age;
    }
    
    /**
     * Gets Customer income
     * @return Float income
     */
    public float GetIncome()
    {
        return m_income;
    }
    
    /**
     * Safe Customer -- no passwords
     * @return Safe Customer String
     */
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
    
    /**
     * Customer details to string
     * @return String Customer
     */
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
