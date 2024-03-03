#include<iostream>
using namespace std;
class College{
    protected:
        string collegeName="MVGR";
        int collegeCode=33;
        string address="Vizianagaram";
    public:

        void display(string classified){
            cout<<classified<<" of collage :"<<collegeName<<endl;
            cout<<"College Code :"<<collegeCode<<endl;
            cout<<"Address of the collage :"<<address<<endl;
        }
        string getValue(){
            return getv();
        }
    private:
        string getv(){
            string password="MVGR@1998";
            return password;
        }

};
class Staff:public College{
    public:
         
          Staff(){  
            string classified="Staff";
            display(classified);
            cout<<"Staff can access passwords of the collage"<<endl;
             temp2=address;
             temp=getValue();
          }
            string temp;
            string temp2;
        
};
class Student:public College{
    public:
        Student(){
            string classified="Student";
            display(classified);
        }
};
class Parents: protected College{
    public:
    Parents(){
            string classified="Parents";
            display(classified);
    }
};
int main(){
    Student s;
    Staff st;
    College c;
    Parents p;
    c.display("Member of principal (parent class)");
    cout<<"Protected variable Accessed from main funtion : "<<st.temp2<<endl;
    cout<<"passwords can be accessed only by staff objects :"<<st.temp<<endl;
}
