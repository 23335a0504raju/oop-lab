#include<iostream>
using namespace std;
int main(){
   int num1,num2;
   int choice;
   cout<<"enter your choice among these values:";
   cout<<"\n1.addition\n2.substraction\n3.multiplication\n4.division";
   cin>>choice;
   cout<<"enter two numbers";
   cin>>num1>>num2;
   switch(choice){
    case 1:
        cout<<"Addition:"<<num1+num2;
        break;
    case 2:
        cout<<"Substraction:"<<num1-num2;
        break;
    case 3:
        cout<<"Multiplication::"<<num1*num2;
        break;
    case 4:
        cout<<"Division:"<<num1/num2;
        break;
    default:
        cout<<"enter correct choice:";
}
}

