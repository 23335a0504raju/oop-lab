#include<iostream>
using namespace std;
class Operatoroverload{
    private:
        int real;
        int img;
    public:
        Operatoroverload(int r=0,int i=0){
            real=r;
            img=i;
        }
        Operatoroverload operator-(Operatoroverload const& mainobj){
            Operatoroverload funobj;
            funobj.real=real-mainobj.real;
            funobj.img=img-mainobj.img;
            return funobj;
        }
        void display(){
            cout<<endl<<"The Subtraction of complex numbers is :"<<real<<"-"<<img<<"i"<<endl;
        }
};
int main(){
    Operatoroverload mainobj(2,3);
    Operatoroverload mainobj1(4,5);
    Operatoroverload add;
    add=mainobj1-mainobj;
    add.display();
}