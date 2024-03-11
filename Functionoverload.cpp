#include<iostream>
using namespace std;
class Functionoverload{
    public:
        void Profile(string user,string password){
            cout<<"User of the website no need of fresh registration again :";
            cout<<"Name of the user: "<<user<<endl;
            cout<<"Client can access only the visible content of the web pages"<<endl;
        }
       
        void Profile(string id,string user,string password){
            cout<<"Fresh user need to resister into the website :"<<endl;
            cout<<"Name of the user: "<<user<<endl;
            cout<<"clients cannot access, until the whole registration completion "<<endl;
        }
       
        void Profile(string id,string user,string password,string bitlocker){
            cout<<"Admin :"<<endl;
            cout<<"Name of the Admin: "<<user<<endl;
            cout<<"Whole website access is possible and can alter any type of chabges imn the web: "<<endl;
        }
       
};
int main()
{
    string username,bitlocker,id,password;
    Functionoverload obj;
    int choice;
    cout<<"Enter your category among the given options :"<<endl;
    cout<<"\n1.New user\n2.Existing user\n3.Admin\n";
    cin>>choice;
    switch (choice)
    {
    case 1:
        cout<<"Enter your id:"<<endl;
        cin>>id;
        cout<<"Name:"<<endl;
        cin>>username;
        cout<<"Password:"<<endl;
        cin>>password;
        obj.Profile(id,username,password);
        break;
   case 2:
        cout<<"Name:"<<endl;
        cin>>username;
        cout<<"Password:"<<endl;
        cin>>password;
        obj.Profile(username,password);
        break;
    case 3:
        cout<<"Enter your id:"<<endl;
        cin>>id;
        cout<<"Name:"<<endl;
        cin>>username;
        cout<<"Password:"<<endl;
        cin>>password;
        cout<<"Enter your bitlocker key"<<endl;
        cin>>bitlocker;
        obj.Profile(id,username,password,bitlocker);
        break;
        default:
        cout<<"enter correct choice:";
    }
    }