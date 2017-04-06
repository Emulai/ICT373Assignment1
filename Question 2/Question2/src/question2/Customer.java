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
public class Customer {
    protected String m_userName;
    protected String m_password;
    protected String m_gender;
    protected int m_age;
    protected float m_income;
    
    Customer (String p_userName, String p_password, String p_gender,
              int p_age, float p_income)
    {
        m_userName = p_userName;
        m_password = p_password;
        m_gender = p_gender;
        m_age = p_age;
        m_income = p_income;
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
    
    @Override
    public String toString()
    {
        String l_tString = "UserName: " + m_userName + "\nPassword: " + m_password +
                           "\nGender: " + m_gender + "\nAge: " + m_age + "\nIncome: " + m_income;
        
        return l_tString;
    }
    
}
