#include<iostream>
using namespace std;
class Hybrid{
    protected:
        string player1;
        string player2;
    public:
        void Gameinterface(string name)
        {
            cout<<name<<" Start the Game."<<endl;
        }
         string getresult(int levelnum)
         {
                return check(levelnum);
        }
        void display(string name){
             cout<<endl<<name<<" is the WINNER"<<endl;
       }
    private:
        string level1="level-1 have to Pass";
        string level2="level-2 have to Pass";
        string level3="The Conclusion";
        string check(int levelnum){
            if(levelnum==0){
                return level1;
            }
            else if(levelnum==1){
                return level2;
            }
            else if(levelnum==2){
                return level3;
            }
            else{
                string x="disquailified";
                return x;
            }
        } 
};

class Player1:public Hybrid{
  public:
  int levelnum1;
  string play(){
        cout<<"\nEnter player one name"<<endl;
        cin>>player1;
        Gameinterface(player1);
        cout<<"\nEnter your level among these numbers: \n0.\n1.\n2:"<<endl;
        cin>>levelnum1;      
        string temp;
        temp= getresult(levelnum1);
        cout<<"Result :"<<temp;
        return player1;
  }
  string player=player1;
};
class Player2:public Hybrid{
  public:
  int levelnum2;
   string play(){
        cout<<"\nEnter player Two name"<<endl;
        cin>>player2;
        Gameinterface(player2);
        cout<<"\nEnter your level among these numbers: \n0.\n1.\n2:"<<endl;
        cin>>levelnum2;      
        string temp;
        temp= getresult(levelnum2);
        cout<<"Result :"<<temp;
        return player2;
  }
    
};
class Winner:public Hybrid
{
    public:
    Winner(int levelnum1,int levelnum2,string player1,string player2){
        if(levelnum1>levelnum2){
         display(player1);
        }
        else if(levelnum1<levelnum2){
            display(player2);
        }
        else{
            cout<<"It's a tie!";
        }
}
};
int main(){
    Player1 obj1;
    Player2 obj2;
    string player1=obj1.play();
    string player2=obj2.play();
    Winner obj3(obj1.levelnum1,obj2.levelnum2,player1,player2);
}
