import java.util.Scanner;
class Hellouser
{
public static void main(String args[]) 
{ 
System.out.println("Enter username:");
Scanner input = new Scanner(System.in);
String name = input.next(); 
System.out.println("Hello,"+name);
 }
 }
