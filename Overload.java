import java.util.Scanner;
class Client{
    void displaymsg(){
        System.out.println("Client work is done by the manager");
    }
}
class Manager extends Client{
    void displaymsg(String name){
        System.out.println("Manager is in herted from client class "+name);
    }
}
public class Overload{
public static void main(String args[]){
    Manager obj=new Manager();
    obj.displaymsg();
    System.out.println("Enter name if your are the manager:");
    Scanner input=new Scanner(System.in);
    String name;
    name=input.next();
    obj.displaymsg(name);
}
}