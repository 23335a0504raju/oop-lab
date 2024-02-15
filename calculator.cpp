#include<iostream>
using namespace std;
int main()
{
    int choice;
    cout<<"enter two operands:"<<endl;
    float a,b;
    cin>>a>>b;
    cout<<"1.add\n2.sub\n3.mul\n4.div\n";
    cin>>choice;
    switch(choice){
        case 1:
            cout<<a<<"+"<<b<<"="<<a+b<<endl;
            break;
        case 2:
            cout<<a<<"-"<<b<<"="<<a-b<<endl;
            break;
        case 3:
            cout<<a<<"*"<<b<<"="<<a*b<<endl;
            break;
        case 4:
            cout<<a<<"/"<<b<<"="<<a/b<<endl;
            break;
        default:
            cout<<"enter correct choice:";
    }
}