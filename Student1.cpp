#include<iostream>
using namespace std;
class Student1{
    private:
        string collagename;
        int collagecode;
        string fullname;
        double sempercentage;
    public:
        Student1(){
            collagename="MVGR";
            collagecode=33;
            cout<<"Constructor called: "<<endl;
            cout<<collagename<<endl;
            cout<<collagecode<<endl;
        }
        Student1(string fullname,double sempercentage){
            cout<<"Constructor called: "<<endl;
            cout<<fullname<<endl;
            cout<<sempercentage<<endl;
        }
};
int main(){
    Student1 obj;
    Student1 obj1=Student1("Raju",85);
    Student1 obj2=Student1("Santhosh",95);
}