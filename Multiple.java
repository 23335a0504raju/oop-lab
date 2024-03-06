import java.util.Scanner;

class Shape{
protected
    int width, height;
public
    void setWidth(int w) {
        width = w;
    }

    void setHeight(int h) {
        height = h;
    }
}

class Rectangle extends Shape {
public
    int area() {
        return width * height;
    }
}
class Square extends Rectangle {

 public static void main(String args[]){
    Square square=new Square();
    square.setWidth(5);
    square.setHeight(5);
    System.out.println( "Square area: " +square.area() );
 
}
}