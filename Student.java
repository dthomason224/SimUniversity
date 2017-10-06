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
public class Student extends Person implements Changeable
{
    private String classStatus;
    public Student(String firstName, String lastName, String emailAddress, String phoneNumber, String classStatus) 
    {
        super(firstName, lastName, emailAddress, phoneNumber);
        this.classStatus = classStatus;
    }
    
    public void setClassStatus(String classStatus)
    {
        this.classStatus = classStatus;
    }
    
    public String getStudentInfo()
    {
        return getPersonInfo() + " " + "Class Status: " + classStatus;
    }
    
    @Override
    public String toString()
    {
        return "[" + getStudentInfo() + "]";
    }

    @Override
    public void changeNames(ArrayList<Person> uniList, String firstName, String lastName) 
    {
        uniList.get(6).setFirstName("Bruce");
        uniList.get(6).setLastName("Roberts");
    }
}
