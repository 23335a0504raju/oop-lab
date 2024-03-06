class A {
    void display() {
        System.out.println("A");
    }
}

class B extends A {
   
    void display() {
        System.out.println("B");
    }
}

class C extends A {
    void display() {
        System.out.println("C");
    }
}

class D extends B {
}

public class Diamond{
    public static void main(String[] args) {
        D d = new D();
        d.display(); 
    }
}