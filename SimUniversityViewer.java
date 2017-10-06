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
public class SimUniversityViewer 
{
    public static void main(String[] args)
   {
       final String freshman = "Freshman";
       final String sophmore = "Sophmore";
       final String junior = "Junior";
       final String senior = "Senior";
       
       Faculty employee = new Faculty("Assistant Professor", "Henry", "James", 
               "hjames@gmail.com","610-225-6787", "202", "224-556-7676", 
               "08/24/2005");
       Faculty employeeTwo = new Faculty("Professor", "Eddie", "Douglas", 
               "eDouglas@gmail.com", "610-676-5643", "243", "244-343-4343", 
               "12/14/2010");
       Faculty employeeThree = new Faculty("Professor", "Tom", "Hone", 
               "tHone@13gmail.com", "610-687-9985", "105", "255-675-0998", 
               "01/01/2009");
       
       Staff staff = new Staff("Clerk", "Sean", "Jones", 
               "seanJ22@gmail.com", "484-224-0789", "113", "776-534-7889", 
               "02/30/2013");
       Staff staffTwo = new Staff("Advisor", "Stephanie", "Long", 
               "stephanieL@gmail.com", "455-768-1111", "120", "224-444-0090", 
               "03/21/2015");
       Staff staffThree = new Staff("Manager", "John", "Thomas", 
               "johnT23@gmail.com", "555-445-5656", "214", "888-090-444", 
               "11/01/2011");
       
       Student stu = new Student("Dalton", "Thomason", "dthomason56@gmail.com", 
               "610-775-6875", junior);
       Student stuTwo = new Student("Eddie", "Riffert", "eddieR24@gmail.com", 
               "610-567-3434", freshman);
       Student stuThree = new Student("Eric", "Pol", "ePol34@gmail.com", 
               "610-443-2221", senior);
       
       ArrayList<Person> uniList;
       uniList = new ArrayList<>();
       
       uniList.add(employee);
       uniList.add(employeeTwo);
       uniList.add(employeeThree);
       
       uniList.add(staff);
       uniList.add(staffTwo);
       uniList.add(staffThree);
       
       uniList.add(stu);
       uniList.add(stuTwo);
       uniList.add(stuThree);
       
       for(Object obj: uniList)
       {
           System.out.println(obj);
           System.out.println();
       }
       
       System.out.println("Changed Names: ");
       System.out.println();
      
       stu.changeNames(uniList, "Dalton", "Thomason");
       employee.changeNames(uniList, "Henry", "James");
       
       System.out.println(stu);
       System.out.println(employee);
       
   }
}
