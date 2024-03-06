class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}


class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}


class Boat extends Vehicle {
    void sail() {
        System.out.println("Boat is sailing");
    }
}



class Uservehicle extends Car {
    void floatOnWater() {
        System.out.println("User defined vehicle is floating on water");
    }

    void submerge() {
        System.out.println("User defined vehicle is submerging underwater");
    }
}

public class Hybrid{
    public static void main(String[] args) {
        Uservehicle uservehicle = new Uservehicle();
        uservehicle.start();
        uservehicle.drive();
        uservehicle.floatOnWater();
        uservehicle.submerge();
        uservehicle.stop();
    }
}