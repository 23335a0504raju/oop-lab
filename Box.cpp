#include<iostream>
using namespace std;
class Box{
    private:
        float l;
        float w;
        float h;
    public:
            void boxArea(float length, float width,float height)
            {
                this->l=length;
                this->w=width;
                this->h=height;
                float Area;
                Area=((2*length*width)+(2*length*height)+(2*height*width));
                cout<<"Area of the box:"<<Area<<endl;
            }
            void boxVolume(float length, float width, float height);
            friend void displayBoxDimensions(Box obj1);
};
void Box::boxVolume(float length, float width, float height){
     float Volume;
     Volume=length*width*height;
     cout<<"Volume of the box: "<<Volume<<endl;
}
void displayBoxDimensions(Box obj1){
    cout<<"Length= "<<obj1.l<<endl;
    cout<<"Width= "<<obj1.w<<endl;
    cout<<"Height= "<<obj1.h<<endl;
}
 inline void displayWelcomeMessage(){
    cout<<"Welcome to the program of various types of defining functions"<<endl;
 }
 int main()
 {
    Box obj2;
    displayWelcomeMessage();
    float length,width,height;
    cout<<"Enter dimentions of a Box: ";
    cin>>length>>width>>height;
    obj2.boxArea(length,width,height);
    obj2.boxVolume(length,width,height);
    displayBoxDimensions(obj2);
 }