class Manager{
    protected
        String CompanyName="TECH";
        int CompanyShares=50;
        String address="RushiKonda";
    public

     void display(String classified,int CompanyShares){
            System.out.println(classified+" of Company :"+CompanyName);
            System.out.println("Company Shares :"+CompanyShares);
            System.out.println("Address of the Company :"+address);
        }
        String getValue(){
            return getv();
        }
    private
        String getv(){
            String password="101010";
            return password;
        }

}
class Staff extends Manager{
    public
           int CompanyShares=20;
          Staff(){  
            String classified="Staff";
            display(classified,CompanyShares);
            System.out.println("Staff can not access passwords of the Company");
             temp2=address;
          }
            String getaddress(){
                    return temp2;
            } 
            String temp2;   
}
class Teamhead extends Manager{
    public
      int CompanyShares=30;
       Teamhead(){
         temp=getValue();
            String classified="TeamHead";
            display(classified,CompanyShares);
        }
        String getpassword()
        {
        return temp;
        }
String temp;

public static void main(String args[]){
    Teamhead T=new Teamhead();
    Staff st=new Staff();
    Manager M=new Manager();
    M.display("Member of Manager (parent class)",50);
    System.out.println("Protected variable Accessed from main function     : "+st.temp2);
    System.out.println("passwords can be accessed only by Temhead objects :"+T.temp);
}
}
