public class Simpleinher{
    
        String name="raju";
        int roll=504;
        public
           void display1(){
                System.out.println("my name is :"+name);
                System.out.println("todays topic is simple inheritance");
                System.out.println("roll number is: "+roll);
            }
}
    class Subclass extends Simpleinher{
        void display(String name){
        System.out.println("class had been inherited");
        System.out.println("name :"+name);
        display1();
    }
    public static void main(String args[])
    {
        Subclass obj=new Subclass();
        obj.display(obj.name);
        
    }
}