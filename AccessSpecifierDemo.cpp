#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
        int privar;
    protected:
        int provar;
    public:
        int pubvar;
    public:
        void setVar(int priValue,int proValue, int pubValue){
                privar=priValue;
                provar=proValue;
                pubvar=pubValue;
        }
        int* getVar(){
            static int arr[10];
            arr[0]=privar;
            arr[1]=provar;
            arr[2]=pubvar;
       return arr;
       }
};
int main(){
    AccessSpecifierDemo obj;
    int pri,pro,pub;
    int* a;
    cout<<"Enter Private,Protected and Public values one by one:"<<endl;
    cin>>pri>>pro>>pub;
    obj.setVar(pri,pro,pub);
     a=obj.getVar();
     for(int i=0;i<3;i++){
        cout<<" "<<a[i]<<endl;
     }
}