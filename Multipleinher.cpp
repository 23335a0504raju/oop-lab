#include <iostream>
using namespace std;

class Multiple {
public:
    void displayA() {
        cout << "Multiple" << endl;
    }
};


class B {
public:
    void displayB() {
        cout << "inheritance" << endl;
    }
};

class C : public Multiple, public B {
public:
    void displayC() {
        cout << "Done" << endl;
    }
};

int main() {
    C obj;
    obj.displayA();
    obj.displayB();
    obj.displayC();

    return 0;
}