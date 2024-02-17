#include<iostream>
using namespace std;
void boxArea(float length, float width,float height)
{
    float Area;
    Area=((2*length*width)+(2*length*height)+(2*height*width));
    cout<<"Area of the box:"<<Area<<endl;
}