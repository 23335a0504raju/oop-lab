#include<iostream>
using namespace std;
class Manager{
    protected:
        string CompanyName="TECH";
        int CompanyShares=50;
        string address="RushiKonda";
    public:

        void display(string classified,int CompanyShares){
            cout<<classified<<" of Company :"<<CompanyName<<endl;
            cout<<"Company Shares :"<<CompanyShares<<endl;
            cout<<"Address of the Company :"<<address<<endl;
        }
        string getValue(){
            return getv();
        }
    private:
        string getv(){
            string password="101010";
            return password;
        }

};
class Staff:private Manager{
    public:
           int CompanyShares=20;
          Staff(){  
            string classified="Staff";
            display(classified,CompanyShares);
            cout<<"Staff can not access passwords of the Company"<<endl;
             temp2=address;
          }
            string getaddress(){
                    return temp2;
            } 
            string temp2;   
};
class Teamhead:protected Manager{
    public:
      int CompanyShares=30;
       Teamhead(){
         temp=getValue();
            string classified="TeamHead";
            display(classified,CompanyShares);
        }
        string getpassword()
        {
        return temp;
        }
string temp;
};
int main(){
   Teamhead T;
    Staff st;
    Manager M;
    M.display("Member of Manager (parent class)",50);
    cout<<"Protected variable Accessed from main funtion     : "<<st.temp2<<endl;
    cout<<"passwords can be accessed only by Temhead objects :"<<T.temp<<endl;
}
