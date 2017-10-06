/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalton
 */
public class Employee extends Person 
{
    private String office;
    private String officePhoneNumber;
    private String employmentDate;
    
    public Employee(String firstName, String lastName, 
                    String emailAddress, String phoneNumber, 
                    String office, String officePhoneNumber, 
                    String employmentDate) 
    {
        super(firstName, lastName, emailAddress, phoneNumber);
        this.office = office;
        this.officePhoneNumber = officePhoneNumber;
        this.employmentDate = employmentDate;
    }
    
    public void setOffice(String office)
    {
        this.office = office;
    }
    
    public void setOfficePhoneNumber(String officePhoneNumber)
    {
        this.officePhoneNumber = officePhoneNumber;
    }
    
    public void setEmploymentDate(String employmentDate)
    {
        this.employmentDate = employmentDate;
    }
    
    public String getEmployeeInfo()
    {
        return getPersonInfo() + " " + "Office: " + office + " " 
                + "Office Phone Number: " + officePhoneNumber + " "
                + "Employment Date: " + employmentDate;
    }
    
    @Override
    public String toString()
    {
        return "[" + getEmployeeInfo() + "]";
    }
    
}
