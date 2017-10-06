/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalton
 */
public class Staff extends Employee
{
    private String title;
    public Staff(String title, String firstName, String lastName, 
            String emailAddress, String phoneNumber, String office, 
            String officePhoneNumber, String employmentDate)
    {
        super(firstName, lastName, emailAddress, phoneNumber, office, officePhoneNumber, employmentDate);
        this.title = title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getStaffInfo()
    {
        return getEmployeeInfo() + " " + "Title: " + title;
    }
    
    @Override
    public String toString()
    {
        return "[" + getStaffInfo() + "]";
    }
}
