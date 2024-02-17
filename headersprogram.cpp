#include<iostream>
#include "boxArea.h"
#include "boxVolume.h"
using namespace std;
int main(){
    float l,w,h;
    cout<<"Enter the dimentions: ";
    cin>>l>>w>>h;
    boxArea(l,w,h);
    boxVolume(l,w,h);
}
