#include <iostream>
using namespace std;
class Shape {
protected:
    int width, height;
public:
    void setWidth(int w) {
        width = w;
    }

    void setHeight(int h) {
        height = h;
    }
};

class Rectangle : public Shape {
public:
    int area() {
        return width * height;
    }
};

class Square : public Rectangle {
public:
};

int main() {
    Square square;
    square.setWidth(5);
    square.setHeight(5);
    cout << "Square area: " << square.area() << endl;

    return 0;
}