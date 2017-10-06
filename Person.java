/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalton
 */
public class Person 
{
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    
    public Person(String firstName, String lastName, String emailAddress, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
     
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
      
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.firstName;
    }
     
    public String getEmailAddress()
    {
        return this.firstName;
    }
      
    public String getPhoneNumber()
    {
        return this.firstName;
    }
    
    public String getPersonInfo()
    {
        return "First Name: " + firstName + " " + "Last Name: " + lastName 
                + " " + "Email Address: " + emailAddress + " " 
                + "Phone Number: " + phoneNumber;
    }
    
    @Override
    public String toString()
    {
        return "[" + getPersonInfo() + "]";
    }
}
