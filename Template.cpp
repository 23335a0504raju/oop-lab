#include<iostream>
using namespace std;
template <class P0,class P1,class P2> 
class Addition{
    private:
        P0 a;
        P1 b;
        P2 c;
    public:
        P2 add(P2 a,P2 b,P2 c){
            return a+b+c;
        }
        P1 sub(P1 a,P1 b,P1 c){
           return a-b-c;
        }
        P0 mul(P0 a,P0 b,P0 c){
            return a*b*c;
        }
};
int main(){
    Addition<int,float,double> obj;
    cout<<obj.add(1,2,3)<<endl;
    cout<<obj.sub(30.9,2.2,1.1)<<endl;
    cout<<obj.mul(2,1,3)<<endl;
}