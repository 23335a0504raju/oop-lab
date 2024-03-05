#include<iostream>
using namespace std;
class Route{
public:
void highway()
{
cout<<"Travel through highway stops and reach its destination"<<endl;
}
void beachroad(){
cout<<"Travel through beach road stops and reach its destination"<<endl;
}
};
class Vizagpeople:public Route{
public:

};
class Vizianagarampeople:public Route{
public:
};

class Person:public Vizagpeople,public Vizianagarampeople{
public:
Person(){
    Vizagpeople::highway();
    Vizianagarampeople::beachroad();
}
};
int main(){
Vizagpeople vizag;
Vizianagarampeople vizianagaram;
Person p;
vizag.highway();
vizianagaram.beachroad();
}