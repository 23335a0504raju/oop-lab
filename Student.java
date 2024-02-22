import java.util.Scanner;
public class Student{
    private
        String fullName="Raju";
        int rollNum=504;
        double semPercentage=85;
        String collegeName="MVGR";
        int collegeCode=33;
    public
        Student()
        {
            System.out.println("Constructor called :");
            System.out.println("Name of the student: "+fullName);
            System.out.println("Pin No: "+rollNum);
            System.out.println("sem Percentage : "+semPercentage);
            System.out.println("college Name: "+collegeName);
            System.out.println("college code:"+collegeCode);
        }
    public static void main(String args[]){
        System.out.println("Details of a student: ");
        Student obj=new Student();
    }
}