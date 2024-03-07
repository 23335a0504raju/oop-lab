import java.util.Scanner;
public class AccessSpecifierDemo{
    private
        int privar;
    protected
        int provar;
    public
        int pubvar;
        void setVar(int priValue,int proValue, int pubValue){
            privar=priValue;
            provar=proValue;
            pubvar=pubValue;
        }
         int[] getVar(){
            int arr[]={privar,provar,pubvar};
            return arr;
        }
        void display(int arr[]){
            int i;
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    public static void main(String args[]){
        AccessSpecifierDemo obj=new AccessSpecifierDemo();
        Scanner input= new Scanner(System.in);
        int pri,pro,pub;
        System.out.println("Enter private,Protected and public variables");
        pri=input.nextInt();
        pro=input.nextInt();
        pub=input.nextInt();
        obj.setVar(pri,pro,pub);
        int arr[]=obj.getVar();
        obj.display(arr);
    }
}
