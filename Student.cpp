#include<iostream>
#include<string>
using namespace std;
class Student{
    private:
        string name;
        int rollnum;
        double sempercentage;
        string collagename;
        int collagecode;
    public:
        Student(string name,int rollnum,double sempercentage,string collagename,int collagecode){
            cout<<"constructor invoked: "<<endl;
            cout<<"Name of the student: "<<name<<endl<<"pin num: "<<rollnum<<endl<<"Sem percentage: "<<sempercentage<<endl<<"Collage Name :"<<collagename<<endl<<"Collage code :"<<collagecode<<endl;
        }
        ~Student(){
            cout<<"Destructor called student details has been deleted"<<endl;
        }
};
int main(){
    Student obj=Student("Raju",504,85,"MVGR",33);
    Student obj2("Santhosh",503,95,"MVGR",33);
}