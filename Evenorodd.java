import java.util.Scanner;
    public class Evenorodd{
        public void checknum(int number){
            if(number%2==0){
                System.out.println("Given number is even");
            }
            else{
                System.out.println("Given number is odd");
            }
        }
        public static void main(String args[]){
            System.out.println("Enter number to check even or odd:");
            Scanner svar=new Scanner(System.in);
            int number=svar.nextInt();
            Evenorodd check1=new Evenorodd();
            check1.checknum(number);
        }
}