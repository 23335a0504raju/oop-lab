#include<iostream>
using namespace std;
class Bike{
    protected:
        int millage=50;
        string name="KTM";
        int maxSpeed=180;
    public:    
    void Vehicleinfo(int millage,string name,int maxSpeed){
      
            cout<<"Vehicle details:"<<endl;
            cout<<"Name of the vehicle is :"<<name<<endl;
            cout<<"Millage of the given vehicle: "<<millage<<"KM/H"<<endl;
            cout<<"Maximum speed that the vheicle can posses :"<<maxSpeed<<"Speed"<<endl;
    
    }
};
class Car:public Bike{
       public:
        Car(){
        int millage=35;
        string name="Lamborghini";
        float maxSpeed=280;
       // Vehicleinfo();
        Vehicleinfo(millage,name,maxSpeed);
        }
};
int main(){
    Bike Buyer1;
    Car Buyer2;
    Buyer1.Vehicleinfo(60,"Yamaha",120);
    Buyer2.Vehicleinfo(25,"Audi",220);
}
