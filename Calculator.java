import java.util.Scanner; 
class Calculator
 { 
public static void main(String[] args)
 { 
float a,b; 
int choice; 
Scanner input=new Scanner(System.in);
System.out.print("Enter the value of a : ");
a=input.nextFloat();
System.out.print("Enter the value of b : "); 
b=input.nextFloat(); 
System.out.print("The following operations are\n1. ADDITION\n2. SUBTRACTION\n3. MULTIPLICATION\n4. DIVISION\n");
System.out.print("Enter your choice from 1 to 4 : ");
choice=input.nextInt();
input.close();
if(choice==1) 
{ 
System.out.print("\nThe sum of the values "+a+" and "+b+" is "+(a+b)); 
} 
else if(choice==2) 
{
System.out.print("\nThe difference of the values "+a+" and "+b+" is "+(a-b)); } else if(choice==3) 
{
System.out.print("\nThe product of the values "+a+" and "+b+" is "+(a*b));
}
else if(choice==4)
{ 
System.out.print("\nThe quotient of the values "+a+" and "+b+" is "+(a/b)); 
}
else
{ 
System.out.print("Enter valid choice!!\nPlease try again!!\n"); 
      }
    }
 } 

