#include<iostream>
using namespace std;
class Evenorodd{
    public
    :

    void check(int num)
    {
        if(num%2==0){
            cout<<"number is even";
        }
        else{
            cout<<"number is odd";
        }
    }
};
int main(){
    int num;
    Evenorodd check1;
    cout<<"enter a number:"<<endl;
    cin>>num;
    check1.check(num);
    return 0;
}