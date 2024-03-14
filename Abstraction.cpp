#include<iostream>
using namespace std;
int a;
class Abstraction{
    public:
        virtual void area(int a)=0;
};
class Circle:public Abstraction{
    public:
        void area(int r){
            cout<<"The area of the circle:"<<(3.14*r*r)<<endl;
        }
};
class Square:public Abstraction{
    public:
        void area(int x){
            cout<<"The area of then Square:"<<(x*x)<<endl;
        }
};
int main(){
    int check;
    cout<<"enter 0 if you want to find the circle area"<<endl<<"enter 1 if you want to find square area:"<<endl;
    cin>>check;
    if(check==0){
        Circle circleobj;
        cout<<"enter radious of the circle:"<<endl;
        cin>>a;
        circleobj.area(a);
    }
    else if(check==1){
        Square squareobj;
        cout<<"enter side of the square:"<<endl;
        cin>>a;
        squareobj.area(a);
    }
}
