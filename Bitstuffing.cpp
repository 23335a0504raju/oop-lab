#include<iostream>
using namespace std;
class BitStuffing{
   protected:
     int arr1[20];
     int i,j,k;
    public:
    void bitstuff(int n,int arr[]){
        i=j=0;
        int count;
        while(i<n){
            if(arr[i]==1){
            count=1;
                arr1[j]=arr[i];
                for(k=i+1;count<5&&arr[k]==1&&k<n;k++){
                    j++;
                    arr1[j]=arr[k];
                    count++;
                    if(count==5){
                        j++;
                        arr1[j]=0;
                    }
                    i=k;
                }
            }
        else{
            arr1[j]=arr[i];
        }
        i++;
        j++;
        }
    }
    };
class Display:protected BitStuffing{
    public:
    int temp;
    public:
    Display(int n,int arr[])
    {

    bitstuff(n,arr);
     temp=j;
    }
     void show()
       {
        for(i=0;i<j;i++){
            cout<<arr1[i];
        }
        }
};

int main(){
    int arr[20];
    int i,n;
    cout<<"enter no of bits you want to enter :"<<endl;
    cin>>n;
    cout<<"enter bits one by one into the array :"<<endl;
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Bits sent = "<<n<<endl;
     Display bits(n,arr);
     bits.show();
     cout<<endl<<"bits received = "<<bits.temp<<endl;
}
