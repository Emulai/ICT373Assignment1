/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.Currency;
/**
 *
 * @author jaknd
 */
public class Customer {
    protected String m_userName;
    protected String m_password;
    protected String m_gender;
    protected int m_age;
    protected double m_income;
    
    Customer (String p_userName, String p_password)
    {
        m_userName = p_userName;
        m_password = p_password;
    }
    
}