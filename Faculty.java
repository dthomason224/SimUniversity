import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dalton
 */
public class Faculty extends Employee implements Changeable
{
    private String rank;
    
    public Faculty(String rank, String firstName, String lastName, 
                   String emailAddress, String phoneNumber, String office, 
                   String officePhoneNumber, String employmentDate)
    {
        super(firstName, lastName, emailAddress, 
              phoneNumber, office, officePhoneNumber, employmentDate);
        this.rank = rank;
    }
    
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    
    public String getFacultyInfo()
    {
        return getEmployeeInfo() + " " + "Rank: " + rank;
    }
    
    @Override
    public String toString()
    {
        return "[" + getFacultyInfo() + "]";
    }
    
    @Override
    public void changeNames(ArrayList<Person> uniList, String firstName, String lastName) 
    {
        uniList.get(1).setFirstName("Jerry");
        uniList.get(1).setLastName("Simon");
    }
}
