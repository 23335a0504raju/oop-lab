import java.util.Scanner;
class Overriding
{ 
    void sum(int a,int b){
        System.out.println("The sum of the two given numbers:"+(a+b));
    }
    void sum(float a,float b)
    {
        System.out.println("overriden function :"+(a+b));
    }
public static void main(String args[]){
    Overriding obj=new Overriding();
    Scanner input=new Scanner(System.in);
    float x,y;
    int p,q;
    System.out.println("enter any two integers:");
    p=input.nextInt();
    q=input.nextInt();
    
    obj.sum(p,q);
        System.out.println("enter any float values:");
    x=input.nextFloat();
    y=input.nextFloat();
    obj.sum(x,y);
}
