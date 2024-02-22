import java.util.Scanner;
public class Student1{
    public
        Student1()
        {
            String collegeName="MVGR";
            int collegeCode=33;
            System.out.println("college Name: "+collegeName);
            System.out.println("college Code: "+collegeCode);
        }
        Student1(String fullName, double semPerentage)
        {
            System.out.println("Name of the student: "+fullName);
            System.out.println("Sem percentage : "+semPerentage+"%");
        }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter Name of the student: ");
        name=input.next();
        System.out.println("Enter sem percentage of the student: ");
        double percentage;
        percentage=input.nextDouble();
        Student1 obj1=new Student1();
        Student1 obj2=new Student1(name,percentage);
    }    
}