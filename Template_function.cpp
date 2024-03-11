#include <iostream>  
using namespace std;  
template<class P> 
P add(P a,P b)  
{  
    return a+b;  
      
} 
template<class P,class P1> 
P1 add(P1 a,P1 b){
    return a+b;
}

int main()  
{  
  int i =2;  
  int j =3;  
  float m = 2.3;  
  float n = 1.2;  
  cout<<"Addition of i and j is :"<<add(i,j)<<endl;    
  cout<<"Addition of m and n is :"<<add(m,n)<<endl;  
} 